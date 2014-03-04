/**
 * Product Name : Modus TR-069 Orange
 *
 * Copyright c 2014 Orange
 *
 * This software is distributed under the Apache License, Version 2.0
 * (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 or see the "license.txt" file for
 * more details
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Olivier Beyler - Orange
 */

package com.francetelecom.admindm.restart;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * The Class Activator.
 */
public final class Activator implements BundleActivator {
	/** The log service ref. */
	private ServiceReference logServiceRef = null;
	/** The log. */
	private LogService log = null;

	/**
	 * Start.
	 * 
	 * @param context
	 *            the context
	 * @throws Exception
	 *             the exception
	 */
	public void start(final BundleContext context) throws Exception {
		logServiceRef = context.getServiceReference(LogService.class.getName());
		if (logServiceRef != null) {
			log = (LogService) context.getService(logServiceRef);
		}
		if (log != null) {
			log.log(LogService.LOG_INFO, "install ==> RESTART BUNDLE ");
		}
		Rest rest = new Rest();
		rest.location = (String) context.getBundle().getHeaders().get("location");
		if (log != null) {
			log.log(LogService.LOG_INFO, "install ==> RESTART BUNDLE " + rest.location);
		}
		rest.context = context;
		new Thread(rest).start();
	}

	/**
	 * Stop.
	 * 
	 * @param context
	 *            the context
	 * @throws Exception
	 *             the exception
	 */
	public void stop(final BundleContext context) throws Exception {
		if (log != null) {
			log.log(LogService.LOG_INFO, "uninstall ==> RESTART BUNDLE ");
		}
	}

	/**
	 * The Class Rest.
	 */
	public class Rest implements Runnable {
		/** The location. */
		String location;
		/** The context. */
		BundleContext context;

		/**
		 * Run.
		 * 
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
			try {
				Thread.sleep(1000);
				Bundle[] bundles = context.getBundles();
				for (int i = 0; i < bundles.length; i++) {
					if (location.equals(bundles[i].getLocation())) {
						bundles[i].uninstall();
						if (log != null) {
							log.log(LogService.LOG_INFO, "uninstall ==> " + location);
						}
					}
				}
				Bundle bundle = context.installBundle(location);
				bundle.start();
				if (log != null) {
					log.log(LogService.LOG_INFO, "install ==> " + location);
				}
			} catch (Exception e) {
				if (log != null) {
					log.log(LogService.LOG_ERROR, "", e);
				}
			}
		}
	}
}

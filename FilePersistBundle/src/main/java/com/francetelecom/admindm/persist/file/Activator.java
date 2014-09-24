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

package com.francetelecom.admindm.persist.file;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.francetelecom.admindm.persist.IPersist;

/**
 * The Class Activator.
 */
public final class Activator implements BundleActivator {
	/**
	 * Start.
	 * 
	 * @param context
	 *            the context
	 * @throws Exception
	 *             the exception
	 */
	public void start(final BundleContext context) throws Exception {
		FilePersist persist = new FilePersist();
		context.registerService(IPersist.class.getName(), persist, null);
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
	}
}

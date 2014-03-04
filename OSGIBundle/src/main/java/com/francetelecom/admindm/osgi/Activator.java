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

package com.francetelecom.admindm.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceListener;

import com.francetelecom.admindm.api.Log;

/**
 * The Class Activator.
 */
public final class Activator implements BundleActivator {

	// The following attribute is not used.
	// /** The RPC method mng service ref. */
	// private ServiceReference dataServiceRef = null;

	private ServiceListener serviceListener;

	/**
	 * Start.
	 * 
	 * @param context
	 *            the context
	 * @throws BundleException
	 *             the bundle exception
	 */
	public void start(final BundleContext context) throws BundleException {
		Log.info("START OSGI DATA MODEL MNG");
		serviceListener = new ParameterDataServiceListener(context);
		context.addServiceListener(serviceListener);
	}

	/**
	 * Stop.
	 * 
	 * @param context
	 *            the context
	 */
	public void stop(final BundleContext context) {
		context.removeServiceListener(serviceListener);
		serviceListener = null;
		Log.info("STOP OSGI DATA MODEL MNG");
	}
}

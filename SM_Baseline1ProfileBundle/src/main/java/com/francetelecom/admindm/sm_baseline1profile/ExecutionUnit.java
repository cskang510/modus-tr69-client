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
 * Author: Antonin Chazalet - Orange
 * Mail: antonin.chazalet@orange.com;antonin.chazale@gmail.com
 */

package com.francetelecom.admindm.sm_baseline1profile;

import java.util.Dictionary;

import org.osgi.framework.Bundle;

import com.francetelecom.admindm.sm_baseline1profile.utils.Utils;

public class ExecutionUnit {

	/** The bundle id. */
	private long euid;
	private String name = "undefined";
	/** The bundle id. */
	private String execEnvLabel;
	/** Idle, Starting, Active, Stopping */
	private String statusAsAString;
	/** writable : Idle, Active */
	private String requestedState;
	private String executionFaultCode;
	private String executionFaultMessage;
	private String vendor = "undefined";
	private String version;

	// TODO AAA may: Implement references.
	private String references = "";

	// TODO AAA may: Implement supportedDataModelList.
	private String supportedDataModelList = "";

	/**
	 * Create a ExecutionUnit initialized thanks to the info coming from bundle b.
	 * 
	 * @param b
	 */
	public ExecutionUnit(final Bundle b) {
		this.updateExecutionUnit(b);
	}

	/**
	 * Update current ExecutionUnit thanks to the info coming from bundle b.
	 * 
	 * @param bundle
	 */
	public void updateExecutionUnit(final Bundle bundle) {
		Dictionary headers = bundle.getHeaders();
		this.euid = bundle.getBundleId();
		// this.name = b.getSymbolicName();
		if (headers.get(Utils.BUNDLE_NAME) != null) {
			this.name = (String) headers.get(Utils.BUNDLE_NAME);
		}
		this.execEnvLabel = String.valueOf(bundle.getBundleId());
		int status = bundle.getState();
		this.statusAsAString = checkStatusAndMoveItToAString(status);

		// There is no requestedState, here, at initialization time.
		this.requestedState = "";
		// The faultcode is NoFault, at initialization time.
		this.executionFaultCode = "NoFault";
		// NoFault implies empty String executionFaultMessage.
		this.executionFaultMessage = "";

		if (headers.get(Utils.BUNDLE_VENDOR) != null) {
			this.vendor = (String) headers.get(Utils.BUNDLE_VENDOR);
		}
		this.version = (String) headers.get(Utils.BUNDLE_VERSION);
	}

	/**
	 * Update current ExecutionUnit when the corresponding bundle has been uninstalled.
	 */
	public void updateExecutionUnitWhenTheBundleHasBeenUninstalled() {
		// XXX AAA: non standard status. Eu's status must be: Idle, Starting,
		// Active, or Stopping.
		int status = Bundle.UNINSTALLED;
		this.statusAsAString = checkStatusAndMoveItToAString(status);
	}

	public long getEuid() {
		return this.euid;
	}

	public String getName() {
		return this.name;
	}

	public String getExecEnvLabel() {
		return this.execEnvLabel;
	}

	/**
	 * @param bundleStatus
	 * @see org.osgi.framework.Bundle
	 * 
	 *      Bundle.UNINSTALLED = 1, Bundle.INSTALLED = 2, RESOLVED = 4, STARTING = 8, STOPPING = 16, ACTIVE = 32.
	 * 
	 * @return the execution unit status as a String (i.e. Idle, Starting, Active, or Stopping).
	 */
	private String checkStatusAndMoveItToAString(final int bundleStatus) {
		switch(bundleStatus) {
		case Bundle.UNINSTALLED:
			return Utils.UNINSTALLED;
		case Bundle.INSTALLED:
		case Bundle.RESOLVED:
			return Utils.IDLE;
		case Bundle.STARTING:
			return Utils.STARTING;
		case Bundle.STOPPING:
			return Utils.STOPPING;
		case Bundle.ACTIVE:
			return Utils.ACTIVE;
		}
		throw new RuntimeException("This bundle state (" + bundleStatus + ") is UNKNOWN.");
	}

	public String getStatusAsAString() {
		return this.statusAsAString;
	}

	public String getRequestedState() {
		return this.requestedState;
	}

	public String getExecutionFaultCode() {
		return this.executionFaultCode;
	}

	public String getExecutionFaultMessage() {
		return this.executionFaultMessage;
	}

	public String getVendor() {
		return this.vendor;
	}

	public String getVersion() {
		return this.version;
	}

	public String getReferences() {
		return this.references;
	}

	public String getSupportedDataModelList() {
		return this.supportedDataModelList;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String toString = this.getClass().getName() + "[" + "euid=" + this.euid + ",name=" + this.name
				+ ",execEnvLabel=" + this.execEnvLabel + ",statusAsAString=" + this.statusAsAString
				+ ",requestedState=" + this.requestedState + ",executionFaultCode=" + this.executionFaultCode
				+ ",executionFaultMessage=" + this.executionFaultMessage + ",vendor=" + this.vendor + ",version="
				+ this.version + ",references=" + this.references + ",supportedDataModelList="
				+ this.supportedDataModelList + "]";
		return toString;
	}

}

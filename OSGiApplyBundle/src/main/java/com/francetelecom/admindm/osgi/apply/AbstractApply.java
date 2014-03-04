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

package com.francetelecom.admindm.osgi.apply;

import com.francetelecom.admindm.download.api.IApplyAction;
import com.francetelecom.admindm.soap.Fault;
import com.francetelecom.admindm.soap.FaultUtil;

/**
 * The Class AbstractApply.
 */
public abstract class AbstractApply implements IApplyAction {
	/**
	 * Reject bad file.
	 * 
	 * @param location
	 *            the location
	 * @return the fault
	 */
	protected final Fault rejectBadFile(final String location) {
		return new Fault(FaultUtil.FAULT_9018, faultMsg(location, null));
	}

	/**
	 * Reject bad file.
	 * 
	 * @param location
	 *            the location
	 * @param e
	 *            the exception
	 * @return the fault
	 */
	protected final Fault rejectBadFile(final String location, final Exception e) {
		return new Fault(FaultUtil.FAULT_9018, faultMsg(location, e), e);
	}

	/**
	 * Fault msg.
	 * 
	 * @param name
	 *            the name
	 * @return the string
	 */
	private String faultMsg(final String name, Exception e) {
		StringBuffer error = new StringBuffer(FaultUtil.STR_FAULT_9018);
		error.append(" unable to apply '");
		error.append(name);
		if (e != null) {
			error.append("' cause :");
			error.append(e.getMessage());
		}
		return error.toString();
	}
}

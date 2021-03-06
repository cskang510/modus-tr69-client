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

package com.francetelecom.admindm.getParameterValues;

import com.francetelecom.admindm.api.RPCMethod;
import com.francetelecom.admindm.api.Session;
import com.francetelecom.admindm.model.ParameterValueStruct;

/**
 * The Class GetParameterValuesResponse.
 */
public final class GetParameterValuesResponse implements RPCMethod {
	/** The Constant NAME. */
	static final String NAME = "GetParameterValuesResponse";
	/** The parameter list. */
	private ParameterValueStruct[] parameterList = null;

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 * @see com.francetelecom.admindm.api.RPCMethod#getName()
	 */
	public String getName() {
		return NAME;
	}

	/**
	 * Perform.
	 * 
	 * @param session
	 *            the session
	 */
	public void perform(final Session session) {
	}

	/**
	 * Sets the parameter list.
	 * 
	 * @param pParameterList
	 *            the new parameter list
	 */
	public void setParameterList(final ParameterValueStruct[] pParameterList) {
		this.parameterList = pParameterList;
	}

	/**
	 * Gets the parameter list.
	 * 
	 * @return the parameter list
	 */
	public ParameterValueStruct[] getParameterList() {
		return parameterList;
	}

	/**
	 * id of the RPCMethod Request by ACS.
	 */
	private String id = null;

	/**
	 * Gets the id.
	 * 
	 * @return the Id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter the Id.
	 */
	public void setId(String id) {
		this.id = id;
	}

}

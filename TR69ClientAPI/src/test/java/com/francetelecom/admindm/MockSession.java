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

package com.francetelecom.admindm;

import org.kxml2.kdom.Element;

import com.francetelecom.admindm.api.RPCMethod;
import com.francetelecom.admindm.api.Session;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterData;
import com.francetelecom.admindm.soap.Fault;

/**
 * The Class MockSession.
 */
public final class MockSession implements Session {
	/**
	 * Close session.
	 * 
	 * @param isSuccessfull
	 *            the is successfull
	 */
	public void closeSession(final boolean isSuccessfull) {
	}

	/**
	 * Do a soap response.
	 * 
	 * @param method
	 *            the method
	 * @throws Fault
	 *             the fault
	 */
	public void doASoapResponse(final RPCMethod method) throws Fault {
	}

	/**
	 * Do soap request.
	 * 
	 * @param element
	 *            the element
	 * @param id
	 *            the id
	 * @throws Fault
	 *             the fault
	 */
	public void doSoapRequest(final Element element, String id) throws Fault {
	}

	/** The last rpc. */
	private RPCMethod lastRPCMethod;

	/**
	 * Sets the last rpc method.
	 * 
	 * @param lastRPCMethod
	 *            the last rpc method
	 */
	public void setLastRPCMethod(final RPCMethod pLastRPCMethod) {
		this.lastRPCMethod = pLastRPCMethod;
	}

	/**
	 * Instantiates a new mock session.
	 * 
	 * @param pLastRPC
	 *            the last rpc
	 */
	public MockSession() {
	}

	/**
	 * Gets the last rpc method.
	 * 
	 * @return the last rpc method
	 * @see com.francetelecom.admindm.api.Session#getLastRPCMethod()
	 */
	public RPCMethod getLastRPCMethod() {
		return lastRPCMethod;
	}

	IParameterData data = new ParameterData();

	/**
	 * Gets the parameter data.
	 * 
	 * @return the parameter data
	 * @see com.francetelecom.admindm.api.Session#getParameterData()
	 */
	public IParameterData getParameterData() {
		return data;
	}

	/** The session id. */
	private String sessionId = "";

	/**
	 * Sets the session id.
	 * 
	 * @param pSessionId
	 *            the new session id
	 */
	public void setSessionId(String pSessionId) {
		this.sessionId = pSessionId;
	}

	/**
	 * Gets the session id.
	 * 
	 * @return the session id
	 * @see com.francetelecom.admindm.api.Session#getSessionId()
	 */
	public String getSessionId() {
		return sessionId;
	}
}

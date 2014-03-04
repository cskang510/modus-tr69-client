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

package com.francetelecom.admindm.api;

import java.util.Collection;

import com.francetelecom.admindm.model.ParameterType;

/**
 * The Class GetterForList.
 */
public final class GetterForList implements Getter {
	/** The list. */
	private final Collection list;
	/** The type. */
	private final int type;

	/**
	 * Instantiates a new getter for list.
	 * 
	 * @param pList
	 *            the list
	 * @param pType
	 *            the type
	 */
	public GetterForList(final Collection pList, final int pType) {
		this.list = pList;
		this.type = pType;
	}

	/**
	 * Instantiates a new getter for list.
	 * 
	 * @param pList
	 *            the list
	 */
	public GetterForList(final Collection pList) {
		this(pList, ParameterType.UINT);
	}

	/**
	 * Gets the.
	 * 
	 * @param sessionId
	 *            the session id
	 * @return the object
	 * @see com.francetelecom.admindm.api.Getter#get(java.lang.String)
	 */
	public Object get(final String sessionId) {
		Object result = null;
		if (ParameterType.UINT == this.type || ParameterType.LONG == this.type) {
			result = new Long(this.list.size());
		} else if (ParameterType.INT == this.type) {
			result = Integer.valueOf(String.valueOf(this.list.size()));
		}
		return result;
	}
}

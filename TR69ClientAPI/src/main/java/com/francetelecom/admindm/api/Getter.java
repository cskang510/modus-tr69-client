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

/**
 * The Interface Getter. Allow to specify a new behavior of a parameter.
 * 
 * @author Olivier Beyler - OrangeLabs
 */
public interface Getter {

	/**
	 * Getter of an object.
	 * 
	 * @param sessionId
	 *            the session id
	 * @return the Object.
	 */
	Object get(String sessionId);
}

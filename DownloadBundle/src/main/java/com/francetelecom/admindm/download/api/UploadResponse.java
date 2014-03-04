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

package com.francetelecom.admindm.download.api;

/**
 * The Class DownloadResponse.
 */
public final class UploadResponse extends BaseResponse {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The Constant NAME. */
	public static final String NAME = "UploadResponse";

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return NAME;
	}
}

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

import com.francetelecom.admindm.api.Session;
import com.francetelecom.admindm.download.IEngine;
import com.francetelecom.admindm.soap.Fault;
import com.francetelecom.admindm.soap.FaultUtil;

/**
 * The Class Upload.
 */
public final class Upload extends Base {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The Constructor.
	 * 
	 * @param pEngine
	 *            the engine
	 */
	public Upload(final IEngine pEngine) {
		super(pEngine);
	}

	/** The Constant NAME. */
	public static final String NAME = "Upload";

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
	 * @throws Fault
	 *             the fault
	 */
	public void perform(final Session session) throws Fault {
		// always add the download request to the download engine and answers
		// that the download isn't yet finished.
		if (getEngine() == null) {
			// The Engine must not be null
			// The engine must be set
			throw new Fault(FaultUtil.FAULT_9002, FaultUtil.STR_FAULT_9002);
		}
		getEngine().addUpload(this);
		UploadResponse response = new UploadResponse();
		response.setStatus(1);
		response.setStartTime(0);
		response.setCompleteTime(0);
		session.doASoapResponse(response);
	}

	/** The filename. */
	private String filename = "";

	/**
	 * Gets the filename.
	 * 
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	public void setFilename(final String pFilename) {
		filename = pFilename;
	}
}

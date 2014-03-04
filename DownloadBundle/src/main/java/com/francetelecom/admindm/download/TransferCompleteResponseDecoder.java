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

package com.francetelecom.admindm.download;

import org.kxml2.kdom.Element;

import com.francetelecom.admindm.api.RPCDecoder;
import com.francetelecom.admindm.api.RPCMethod;
import com.francetelecom.admindm.soap.Fault;

/**
 * The Class TransferCompleteReponseDecoder.
 */
public final class TransferCompleteResponseDecoder implements RPCDecoder {
	/** The engine. */
	private final IEngine engine;

	/**
	 * The Constructor.
	 * 
	 * @param pEngine
	 *            the engine
	 */
	public TransferCompleteResponseDecoder(final IEngine pEngine) {
		this.engine = pEngine;
	}

	/**
	 * Decode.
	 * 
	 * @param element
	 *            the element
	 * @return the RPC method
	 * @throws Fault
	 *             the decoder exception
	 */
	public RPCMethod decode(final Element element) throws Fault {
		return new TransferCompleteResponse(engine);
	}
}

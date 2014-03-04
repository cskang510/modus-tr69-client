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

import java.io.OutputStreamWriter;

import junit.framework.TestCase;

import org.kxml2.io.KXmlSerializer;
import org.kxml2.kdom.Document;
import org.ow2.odis.test.TestUtil;
import org.xmlpull.v1.XmlSerializer;

import com.francetelecom.admindm.api.RPCEncoder;
import com.francetelecom.admindm.soap.Soap;

/**
 * The Class TransferCompleteEncoderTest.
 */
public final class TransferCompleteEncoderTest extends TestCase {
	private static final String INDENT_OUTPUT = "http://xmlpull.org/v1/doc/features.html#indent-output";

	/**
	 * Test encode.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	public void testEncode() throws Exception {
		TestUtil.TRACE(this);

		TransferComplete tc;
		tc = new TransferComplete();
		tc.setCommandKey("commandeKey");
		tc.setCompleteTime(0);
		tc.setStartTime(0);

		RPCEncoder encoder = new TransferCompleteEncoder();
		Document doc = Soap.getDocument(encoder.encode(tc), "test");
		XmlSerializer serial = new KXmlSerializer();
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		serial.setOutput(writer);
		serial.setFeature(INDENT_OUTPUT, true);
		doc.write(serial);
		System.out.println("");
	}
}

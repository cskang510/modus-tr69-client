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

import java.io.IOException;
import java.io.OutputStreamWriter;

import junit.framework.TestCase;

import org.kxml2.io.KXmlSerializer;
import org.kxml2.kdom.Document;
import org.ow2.odis.test.TestUtil;
import org.xmlpull.v1.XmlSerializer;

import com.francetelecom.admindm.model.ParameterValueStruct;
import com.francetelecom.admindm.soap.Soap;

/**
 * The Class GetParameterValuesResponseEncoderTest.
 */
public class GetParameterValuesResponseEncoderTest extends TestCase {

	/**
	 * Test encode.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void testEncodeWithNoParameterValues() throws IOException {
		TestUtil.TRACE(this);
		GetParameterValuesResponseEncoder encoder;
		GetParameterValuesResponse response;
		response = new GetParameterValuesResponse();
		encoder = new GetParameterValuesResponseEncoder();
		Document doc = Soap.getDocument(encoder.encode(response), "test");
		XmlSerializer serial = new KXmlSerializer();
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		serial.setOutput(writer);
		serial.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
		doc.write(serial);
		System.out.println("");
	}

	/**
	 * Test encode.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void testEncodeWithParameterValues() throws IOException {
		TestUtil.TRACE(this);
		GetParameterValuesResponseEncoder encoder;
		GetParameterValuesResponse response;
		response = new GetParameterValuesResponse();
		ParameterValueStruct[] pList = new ParameterValueStruct[1];
		pList[0] = new ParameterValueStruct("test", "valeur");
		response.setParameterList(pList);
		encoder = new GetParameterValuesResponseEncoder();
		Document doc = Soap.getDocument(encoder.encode(response), "test");
		XmlSerializer serial = new KXmlSerializer();
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		serial.setOutput(writer);
		serial.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
		doc.write(serial);
		System.out.println("");
	}
}

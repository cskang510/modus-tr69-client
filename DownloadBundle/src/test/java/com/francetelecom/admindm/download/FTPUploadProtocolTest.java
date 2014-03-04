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

import junit.framework.TestCase;

import org.ow2.odis.test.TestUtil;

import com.francetelecom.admindm.api.FileUtil;
import com.francetelecom.admindm.download.api.Upload;

public class FTPUploadProtocolTest extends TestCase {
	Upload createUpload() {
		MockDownloadEngine engine = new MockDownloadEngine();
		FileUtil.CONFIG_FILE = "./src/test/resources/Config.txt";
		Upload upload = new Upload(engine);
		upload.setUrl("ftp://g-odis-1");
		upload.setDelaySeconds(0);
		upload.setUsername("olivier");
		upload.setFileType(FileUtil.CONFIG);
		upload.setPassword("olivier");
		upload.setFilename("test.txt");
		upload.setCommandKey("");
		return upload;
	}

	public void testIsPrefixCompatible() {
		TestUtil.TRACE(this);
		Upload upload = createUpload();
		FTPUploadProtocol ftpUpload = new FTPUploadProtocol();
		assertTrue(ftpUpload.isPrefixCompatible(upload.getUrl()));
	}

	public void testOnUpload() throws Exception {
		TestUtil.TRACE(this);
		Upload upload = createUpload();
		FTPUploadProtocol ftpUpload = new FTPUploadProtocol();
		assertTrue(ftpUpload.isPrefixCompatible(upload.getUrl()));
		ftpUpload.onUpload(upload);
	}
}

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

import java.io.IOException;

import junit.framework.TestCase;

import org.ow2.odis.test.TestUtil;

import com.francetelecom.admindm.download.api.Download;
import com.francetelecom.admindm.soap.Fault;

/**
 * The Class DownloadTaskTest.
 */
public final class DownloadTaskTest extends TestCase {
	/**
	 * Test run.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void testRun() throws IOException {
		TestUtil.TRACE(this);
		IEngine engine = new MockDownloadEngine();
		Download download = new Download(engine);
		DelayedTask task;
		task = new DelayedTask(download, new MockProtocolDownload(), engine, true);
		task.run();
	}

	/**
	 * Test check delay.
	 */
	public void testCheckDelay() {
		TestUtil.TRACE(this);
		Download download = new Download(new MockDownloadEngine());
		download.setCreationDate(0);
		try {
			DelayedTask.checkDelay(download);
			fail("should throw a Fault");
		} catch (Fault e) {
			System.out.println("OK");
		}
	}
}

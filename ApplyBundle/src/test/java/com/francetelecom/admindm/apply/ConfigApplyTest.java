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

package com.francetelecom.admindm.apply;

import junit.framework.TestCase;

import org.ow2.odis.test.TestUtil;

/**
 * The Class ConfigApplyTest.
 */
public class ConfigApplyTest extends TestCase {

	/**
	 * Test apply whith null argue.
	 */
	public void testApplyWhithNullArgue() {
		TestUtil.TRACE(this);
		try {
			assertFalse(new ConfigApply().apply(null));
		} catch (Exception e) {
			e.printStackTrace();
			fail("even on  null should not have any exception");
		}
	}

	/**
	 * Test is applicable null argue.
	 */
	public void testIsApplicableNullArgue() {
		TestUtil.TRACE(this);
		try {
			assertFalse(new ConfigApply().isApplicable(null));
		} catch (Exception e) {
			e.printStackTrace();
			fail("even on  null should not have any exception");
		}
	}

	/**
	 * Test is applicable.
	 */
	public void testIsApplicable() {
		TestUtil.TRACE(this);
		try {
			String test = "3 Vendor Configuration File";
			assertTrue(new ConfigApply().isApplicable(test));
			test = "1 Firmware";
			assertFalse(new ConfigApply().isApplicable(test));
		} catch (Exception e) {
			e.printStackTrace();
			fail("even on  null should not have any exception");
		}
	}
}

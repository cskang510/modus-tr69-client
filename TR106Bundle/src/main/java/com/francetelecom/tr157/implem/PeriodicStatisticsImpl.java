/**
 * Copyright France Telecom (Orange Labs R&D) 2008,  All Rights Reserved.
 *
 * This software is the confidential and proprietary information
 * of France Telecom (Orange Labs R&D). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * France Telecom (Orange Labs R&D)
 *
 * Project     : Modus
 * Software    : Library
 *
 * Author : Orange Labs R&D O.Beyler
 */

package com.francetelecom.tr157.implem;

import java.util.ArrayList;
import java.util.List;

import com.francetelecom.admindm.api.Factory;
import com.francetelecom.admindm.api.GetterForList;
import com.francetelecom.admindm.api.Log;
import com.francetelecom.admindm.api.StorageMode;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.Parameter;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;
import com.francetelecom.tr157.gen.PeriodicStatistics;

/**
 * @author mpcy8647
 * 
 */
public class PeriodicStatisticsImpl extends PeriodicStatistics implements Factory {

	/** The sample set list. */
	private List sampleSetList;

	/**
	 * Instantiates a new periodic statistics impl.
	 * 
	 * @param pData
	 *            the data
	 * @param pBasePath
	 *            the base path
	 */
	public PeriodicStatisticsImpl(IParameterData pData, String pBasePath) {
		super(pData, pBasePath);
		sampleSetList = new ArrayList();
	}

	/**
	 * <p>
	 * Initialize.
	 * </p>
	 * <p>
	 * The following actions are performed:
	 * <ul>
	 * <li>calls the initialize method of the super class.</li>
	 * <li>adds a getterForList for the SampleSetNumberOfEntries.</li>
	 * </ul>
	 * </p>
	 * 
	 * @throws Fault
	 *             the fault
	 * 
	 * @see com.francetelecom.tr157.gen.PeriodicStatistics#initialize()
	 */
	public void initialize() throws Fault {
		super.initialize();

		Parameter sampleSet = getData().createOrRetrieveParameter(getBasePath() + "SampleSet.");
		sampleSet.setWritable(true);
		sampleSet.setHidden(false);
		sampleSet.setValue(null);
		sampleSet.setStorageMode(StorageMode.COMPUTED);
		sampleSet.setType(ParameterType.ANY);
		sampleSet.setFactory(this);

		getParamSampleSetNumberOfEntries().setGetter(new GetterForList(sampleSetList));

	}

	/**
	 * Adds the sample set.
	 * 
	 * @return the sample set impl
	 */
	public SampleSetImpl addSampleSet() {
		SampleSetImpl sampleSet = null;
		try {
			String sampleSetBasePath = getBasePath() + "SampleSet." + (sampleSetList.size() + 1) + ".";
			sampleSet = new SampleSetImpl(getData(), sampleSetBasePath);
			sampleSet.initialize();
			sampleSetList.add(sampleSet);
		} catch (Fault e) {
			Log.error("unable to create a SampleSet", e);
		}

		return sampleSet;
	}

	/**
	 * <p>
	 * Creates an instance object of SampleSet.
	 * </p>
	 * <p>
	 * The instance number of the newly created object is generated by the
	 * implementation (the number parameter isn't used).
	 * </p>
	 * 
	 * @param number
	 *            never used
	 * @param data
	 *            parameter data
	 * @see com.francetelecom.admindm.api.Factory#createObjectInstance(long,
	 *      com.francetelecom.admindm.model.IParameterData)
	 */
	public int createObjectInstance(long number, IParameterData data) throws Fault {
		SampleSetImpl sampleSet = null;
		int instanceNumber = sampleSetList.size() + 1;
		try {
			String sampleSetBasePath = getBasePath() + "SampleSet." + instanceNumber + ".";
			sampleSet = new SampleSetImpl(data, sampleSetBasePath);
			sampleSet.initialize();
			sampleSetList.add(sampleSet);
		} catch (Fault e) {
			Log.error("unable to create a SampleSet", e);
		}

		return instanceNumber;
	}

}
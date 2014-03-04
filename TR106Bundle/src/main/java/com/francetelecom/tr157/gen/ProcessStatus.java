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
 * Generated : 21 oct. 2009 by GenModel
 */

package com.francetelecom.tr157.gen;

import com.francetelecom.admindm.api.StorageMode;
import com.francetelecom.admindm.model.CheckMaximum;
import com.francetelecom.admindm.model.CheckMinimum;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;

/**
 * Class ProcessStatus.
 * 
 * @author OrangeLabs R&D
 */
public class ProcessStatus {
	/** The data. */
	private final IParameterData data;
	/** The base path. */
	private final String basePath;

	/**
	 * Default constructor.
	 * 
	 * @param pData
	 *            data model
	 * @param pBasePath
	 *            base path of attribute
	 * @param pPersist
	 *            persistence
	 */
	public ProcessStatus(final IParameterData pData, final String pBasePath) {
		super();
		this.data = pData;
		this.basePath = pBasePath;
	}

	/**
	 * Get the data.
	 * 
	 * @return the data
	 */
	public final IParameterData getData() {
		return data;
	}

	/**
	 * Get the basePath.
	 * 
	 * @return the basePath
	 */
	public final String getBasePath() {
		return basePath;
	}

	/**
	 * Initialiser.
	 */
	public void initialize() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath);
		param.setType(ParameterType.ANY);

		paramProcessNumberOfEntries = createProcessNumberOfEntries();
		paramProcess = createProcess();
		paramCPUUsage = createCPUUsage();
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramProcessNumberOfEntries;

	/**
	 * Getter method of ProcessNumberOfEntries.
	 * 
	 * @return _ProcessNumberOfEntries
	 */
	public final com.francetelecom.admindm.model.Parameter getParamProcessNumberOfEntries() {
		return paramProcessNumberOfEntries;
	}

	/**
	 * Create the parameter ProcessNumberOfEntries
	 * 
	 * @return ProcessNumberOfEntries
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createProcessNumberOfEntries()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath
				+ "ProcessNumberOfEntries");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramProcess;

	/**
	 * Getter method of Process.
	 * 
	 * @return _Process
	 */
	public final com.francetelecom.admindm.model.Parameter getParamProcess() {
		return paramProcess;
	}

	/**
	 * Create the parameter Process
	 * 
	 * @return Process
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createProcess()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Process");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.ANY);
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramCPUUsage;

	/**
	 * Getter method of CPUUsage.
	 * 
	 * @return _CPUUsage
	 */
	public final com.francetelecom.admindm.model.Parameter getParamCPUUsage() {
		return paramCPUUsage;
	}

	/**
	 * Create the parameter CPUUsage
	 * 
	 * @return CPUUsage
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createCPUUsage()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "CPUUsage");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMaximum(100));
		param.setWritable(false);
		return param;
	}

}
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
import com.francetelecom.admindm.model.CheckEnum;
import com.francetelecom.admindm.model.CheckLength;
import com.francetelecom.admindm.model.CheckMaximum;
import com.francetelecom.admindm.model.CheckMinimum;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;

/**
 * Class RootDevice.
 * 
 * @author OrangeLabs R&D
 */
public class RootDevice {
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
	public RootDevice(final IParameterData pData, final String pBasePath) {
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

		paramUSN = createUSN();
		paramStatus = createStatus();
		paramHost = createHost();
		paramUUID = createUUID();
		paramLocation = createLocation();
		paramLeaseTime = createLeaseTime();
		paramServer = createServer();
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramUSN;

	/**
	 * Getter method of USN.
	 * 
	 * @return _USN
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUSN() {
		return paramUSN;
	}

	/**
	 * Create the parameter USN
	 * 
	 * @return USN
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUSN()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "USN");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramStatus;

	/**
	 * Getter method of Status.
	 * 
	 * @return _Status
	 */
	public final com.francetelecom.admindm.model.Parameter getParamStatus() {
		return paramStatus;
	}

	/**
	 * Create the parameter Status
	 * 
	 * @return Status
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createStatus()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Status");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.setValue("");
		String[] values = { "LeaseActive", "LeaseExpired", "ByebyeReceived", };
		param.addCheck(new CheckEnum(values));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramHost;

	/**
	 * Getter method of Host.
	 * 
	 * @return _Host
	 */
	public final com.francetelecom.admindm.model.Parameter getParamHost() {
		return paramHost;
	}

	/**
	 * Create the parameter Host
	 * 
	 * @return Host
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createHost()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Host");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(1024));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramUUID;

	/**
	 * Getter method of UUID.
	 * 
	 * @return _UUID
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUUID() {
		return paramUUID;
	}

	/**
	 * Create the parameter UUID
	 * 
	 * @return UUID
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUUID()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "UUID");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(36));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramLocation;

	/**
	 * Getter method of Location.
	 * 
	 * @return _Location
	 */
	public final com.francetelecom.admindm.model.Parameter getParamLocation() {
		return paramLocation;
	}

	/**
	 * Create the parameter Location
	 * 
	 * @return Location
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createLocation()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Location");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramLeaseTime;

	/**
	 * Getter method of LeaseTime.
	 * 
	 * @return _LeaseTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamLeaseTime() {
		return paramLeaseTime;
	}

	/**
	 * Create the parameter LeaseTime
	 * 
	 * @return LeaseTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createLeaseTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "LeaseTime");
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
	private com.francetelecom.admindm.model.Parameter paramServer;

	/**
	 * Getter method of Server.
	 * 
	 * @return _Server
	 */
	public final com.francetelecom.admindm.model.Parameter getParamServer() {
		return paramServer;
	}

	/**
	 * Create the parameter Server
	 * 
	 * @return Server
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createServer()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = data.createOrRetrieveParameter(basePath + "Server");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

}
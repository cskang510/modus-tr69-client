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
import com.francetelecom.admindm.model.CheckBoolean;
import com.francetelecom.admindm.model.CheckEnum;
import com.francetelecom.admindm.model.CheckLength;
import com.francetelecom.admindm.model.CheckMinimum;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;

/**
 * Class TemperatureSensor.
 * 
 * @author OrangeLabs R&D
 */
public class TemperatureSensor {
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
	public TemperatureSensor(final IParameterData pData, final String pBasePath) {
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
		return this.data;
	}

	/**
	 * Get the basePath.
	 * 
	 * @return the basePath
	 */
	public final String getBasePath() {
		return this.basePath;
	}

	/**
	 * Initialiser.
	 */
	public void initialize() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath);
		param.setType(ParameterType.ANY);

		this.paramValue = createValue();
		this.paramMinValue = createMinValue();
		this.paramMinTime = createMinTime();
		this.paramMaxValue = createMaxValue();
		this.paramLowAlarmTime = createLowAlarmTime();
		this.paramHighAlarmTime = createHighAlarmTime();
		this.paramResetTime = createResetTime();
		this.paramName = createName();
		this.paramStatus = createStatus();
		this.paramLastUpdate = createLastUpdate();
		this.paramEnable = createEnable();
		this.paramHighAlarmValue = createHighAlarmValue();
		this.paramMaxTime = createMaxTime();
		this.paramLowAlarmValue = createLowAlarmValue();
		this.paramReset = createReset();
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramValue;

	/**
	 * Getter method of Value.
	 * 
	 * @return _Value
	 */
	public final com.francetelecom.admindm.model.Parameter getParamValue() {
		return this.paramValue;
	}

	/**
	 * Create the parameter Value
	 * 
	 * @return Value
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createValue()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Value");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-274));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMinValue;

	/**
	 * Getter method of MinValue.
	 * 
	 * @return _MinValue
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMinValue() {
		return this.paramMinValue;
	}

	/**
	 * Create the parameter MinValue
	 * 
	 * @return MinValue
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMinValue()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "MinValue");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-274));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMinTime;

	/**
	 * Getter method of MinTime.
	 * 
	 * @return _MinTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMinTime() {
		return this.paramMinTime;
	}

	/**
	 * Create the parameter MinTime
	 * 
	 * @return MinTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMinTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "MinTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMaxValue;

	/**
	 * Getter method of MaxValue.
	 * 
	 * @return _MaxValue
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMaxValue() {
		return this.paramMaxValue;
	}

	/**
	 * Create the parameter MaxValue
	 * 
	 * @return MaxValue
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMaxValue()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "MaxValue");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-274));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramLowAlarmTime;

	/**
	 * Getter method of LowAlarmTime.
	 * 
	 * @return _LowAlarmTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamLowAlarmTime() {
		return this.paramLowAlarmTime;
	}

	/**
	 * Create the parameter LowAlarmTime
	 * 
	 * @return LowAlarmTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createLowAlarmTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath
				+ "LowAlarmTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramHighAlarmTime;

	/**
	 * Getter method of HighAlarmTime.
	 * 
	 * @return _HighAlarmTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamHighAlarmTime() {
		return this.paramHighAlarmTime;
	}

	/**
	 * Create the parameter HighAlarmTime
	 * 
	 * @return HighAlarmTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createHighAlarmTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath
				+ "HighAlarmTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramResetTime;

	/**
	 * Getter method of ResetTime.
	 * 
	 * @return _ResetTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamResetTime() {
		return this.paramResetTime;
	}

	/**
	 * Create the parameter ResetTime
	 * 
	 * @return ResetTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createResetTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data
				.createOrRetrieveParameter(this.basePath + "ResetTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramName;

	/**
	 * Getter method of Name.
	 * 
	 * @return _Name
	 */
	public final com.francetelecom.admindm.model.Parameter getParamName() {
		return this.paramName;
	}

	/**
	 * Create the parameter Name
	 * 
	 * @return Name
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createName()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Name");
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
		return this.paramStatus;
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
		param = this.data.createOrRetrieveParameter(this.basePath + "Status");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.setValue("");
		String[] values = { "Disabled", "Enabled", "Error", };
		param.addCheck(new CheckEnum(values));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramLastUpdate;

	/**
	 * Getter method of LastUpdate.
	 * 
	 * @return _LastUpdate
	 */
	public final com.francetelecom.admindm.model.Parameter getParamLastUpdate() {
		return this.paramLastUpdate;
	}

	/**
	 * Create the parameter LastUpdate
	 * 
	 * @return LastUpdate
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createLastUpdate()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath
				+ "LastUpdate");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramEnable;

	/**
	 * Getter method of Enable.
	 * 
	 * @return _Enable
	 */
	public final com.francetelecom.admindm.model.Parameter getParamEnable() {
		return this.paramEnable;
	}

	/**
	 * Create the parameter Enable
	 * 
	 * @return Enable
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createEnable()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Enable");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.BOOLEAN);
		param.addCheck(CheckBoolean.getInstance());
		param.setValue(Boolean.FALSE);
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramHighAlarmValue;

	/**
	 * Getter method of HighAlarmValue.
	 * 
	 * @return _HighAlarmValue
	 */
	public final com.francetelecom.admindm.model.Parameter getParamHighAlarmValue() {
		return this.paramHighAlarmValue;
	}

	/**
	 * Create the parameter HighAlarmValue
	 * 
	 * @return HighAlarmValue
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createHighAlarmValue()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath
				+ "HighAlarmValue");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-274));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramMaxTime;

	/**
	 * Getter method of MaxTime.
	 * 
	 * @return _MaxTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamMaxTime() {
		return this.paramMaxTime;
	}

	/**
	 * Create the parameter MaxTime
	 * 
	 * @return MaxTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createMaxTime()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "MaxTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramLowAlarmValue;

	/**
	 * Getter method of LowAlarmValue.
	 * 
	 * @return _LowAlarmValue
	 */
	public final com.francetelecom.admindm.model.Parameter getParamLowAlarmValue() {
		return this.paramLowAlarmValue;
	}

	/**
	 * Create the parameter LowAlarmValue
	 * 
	 * @return LowAlarmValue
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createLowAlarmValue()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath
				+ "LowAlarmValue");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-274));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramReset;

	/**
	 * Getter method of Reset.
	 * 
	 * @return _Reset
	 */
	public final com.francetelecom.admindm.model.Parameter getParamReset() {
		return this.paramReset;
	}

	/**
	 * Create the parameter Reset
	 * 
	 * @return Reset
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createReset()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Reset");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setHidden(true);
		param.setType(ParameterType.BOOLEAN);
		param.addCheck(CheckBoolean.getInstance());
		param.setValue(Boolean.FALSE);
		param.setWritable(true);
		return param;
	}

}
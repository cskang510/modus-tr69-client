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

package com.francetelecom.tr106.gen;

import com.francetelecom.admindm.api.StorageMode;
import com.francetelecom.admindm.model.CheckBoolean;
import com.francetelecom.admindm.model.CheckLength;
import com.francetelecom.admindm.model.CheckMaximum;
import com.francetelecom.admindm.model.CheckMinimum;
import com.francetelecom.admindm.model.IParameterData;
import com.francetelecom.admindm.model.ParameterType;
import com.francetelecom.admindm.soap.Fault;

/**
 * Class ManagementServer.
 * 
 * @author OrangeLabs R&D
 */
public class ManagementServer {
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
	public ManagementServer(final IParameterData pData, final String pBasePath) {
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

		this.paramSTUNUsername = createSTUNUsername();
		this.paramSTUNMaximumKeepAlivePeriod = createSTUNMaximumKeepAlivePeriod();
		this.paramUDPConnectionRequestAddress = createUDPConnectionRequestAddress();
		this.paramSTUNServerAddress = createSTUNServerAddress();
		this.paramConnectionRequestPassword = createConnectionRequestPassword();
		this.paramPassword = createPassword();
		this.paramKickURL = createKickURL();
		this.paramNATDetected = createNATDetected();
		this.paramPeriodicInformInterval = createPeriodicInformInterval();
		this.paramSTUNServerPort = createSTUNServerPort();
		this.paramSTUNEnable = createSTUNEnable();
		this.paramPeriodicInformEnable = createPeriodicInformEnable();
		this.paramUDPConnectionRequestAddressNotificationLimit = createUDPConnectionRequestAddressNotificationLimit();
		this.paramPeriodicInformTime = createPeriodicInformTime();
		this.paramConnectionRequestURL = createConnectionRequestURL();
		this.paramDownloadProgressURL = createDownloadProgressURL();
		this.paramUsername = createUsername();
		this.paramSTUNMinimumKeepAlivePeriod = createSTUNMinimumKeepAlivePeriod();
		this.paramSTUNPassword = createSTUNPassword();
		this.paramConnectionRequestUsername = createConnectionRequestUsername();
		this.paramUpgradesManaged = createUpgradesManaged();
		this.paramURL = createURL();
		this.paramParameterKey = createParameterKey();
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNUsername;

	/**
	 * Getter method of STUNUsername.
	 * 
	 * @return _STUNUsername
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNUsername() {
		return this.paramSTUNUsername;
	}

	/**
	 * Create the parameter STUNUsername
	 * 
	 * @return STUNUsername
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNUsername() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNUsername");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNMaximumKeepAlivePeriod;

	/**
	 * Getter method of STUNMaximumKeepAlivePeriod.
	 * 
	 * @return _STUNMaximumKeepAlivePeriod
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNMaximumKeepAlivePeriod() {
		return this.paramSTUNMaximumKeepAlivePeriod;
	}

	/**
	 * Create the parameter STUNMaximumKeepAlivePeriod
	 * 
	 * @return STUNMaximumKeepAlivePeriod
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNMaximumKeepAlivePeriod() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNMaximumKeepAlivePeriod");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.INT);
		param.setValue(Integer.valueOf("0"));
		param.addCheck(new CheckMinimum(-1));
		param.setWritable(true);
		return param;
	}

	/**
	 * Address and port to which an ACS MAY send a UDP Connection Request the CPE (see {{bibref|TR-069a2|Annex G}}).
	 * This parameter is in the form of an Authority element as defined in The value MUST be in one of the following two
	 * forms: : host:port : * When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' of this parameter MUST
	 * represent the public address and port to the NAT binding through which the ACS can send UDP Connection messages
	 * (once this information is learned by the CPE through the of STUN). * When {{param|STUNEnable}} is {{false}}, the
	 * ''host'' and portions of the URL MUST represent the local IP address and port on the CPE is listening for UDP
	 * Connection Request messages. The second of this parameter MAY be used only if the port value is equal to
	 * 
	 */
	private com.francetelecom.admindm.model.Parameter paramUDPConnectionRequestAddress;

	/**
	 * Getter method of UDPConnectionRequestAddress.
	 * 
	 * @return _UDPConnectionRequestAddress
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUDPConnectionRequestAddress() {
		return this.paramUDPConnectionRequestAddress;
	}

	/**
	 * Create the parameter UDPConnectionRequestAddress
	 * 
	 * @return UDPConnectionRequestAddress
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUDPConnectionRequestAddress() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "UDPConnectionRequestAddress");
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
	private com.francetelecom.admindm.model.Parameter paramSTUNServerAddress;

	/**
	 * Getter method of STUNServerAddress.
	 * 
	 * @return _STUNServerAddress
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNServerAddress() {
		return this.paramSTUNServerAddress;
	}

	/**
	 * Create the parameter STUNServerAddress
	 * 
	 * @return STUNServerAddress
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNServerAddress() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNServerAddress");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramConnectionRequestPassword;

	/**
	 * Getter method of ConnectionRequestPassword.
	 * 
	 * @return _ConnectionRequestPassword
	 */
	public final com.francetelecom.admindm.model.Parameter getParamConnectionRequestPassword() {
		return this.paramConnectionRequestPassword;
	}

	/**
	 * Create the parameter ConnectionRequestPassword
	 * 
	 * @return ConnectionRequestPassword
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createConnectionRequestPassword() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "ConnectionRequestPassword");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setHidden(true);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
	 * nullNote that on a factory reset of the CPE, the value of this might be reset to its factory value. If an ACS
	 * modifies the value of parameter, it SHOULD be prepared to accommodate the situation that original value is
	 * restored as the result of a factory reset.
	 */
	private com.francetelecom.admindm.model.Parameter paramPassword;

	/**
	 * Getter method of Password.
	 * 
	 * @return _Password
	 */
	public final com.francetelecom.admindm.model.Parameter getParamPassword() {
		return this.paramPassword;
	}

	/**
	 * Create the parameter Password
	 * 
	 * @return Password
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createPassword() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Password");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setHidden(true);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
	 * Present only for a CPE that supports the Kicked RPC method. URL, as defined in {{bibref|RFC3986}}, from which the
	 * CPE can be to initiate the Kicked RPC method call. MUST be an absolute URL a host name or IP address as would be
	 * used on the LAN side of the
	 * 
	 */
	private com.francetelecom.admindm.model.Parameter paramKickURL;

	/**
	 * Getter method of KickURL.
	 * 
	 * @return _KickURL
	 */
	public final com.francetelecom.admindm.model.Parameter getParamKickURL() {
		return this.paramKickURL;
	}

	/**
	 * Create the parameter KickURL
	 * 
	 * @return KickURL
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createKickURL() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "KickURL");
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
	private com.francetelecom.admindm.model.Parameter paramNATDetected;

	/**
	 * Getter method of NATDetected.
	 * 
	 * @return _NATDetected
	 */
	public final com.francetelecom.admindm.model.Parameter getParamNATDetected() {
		return this.paramNATDetected;
	}

	/**
	 * Create the parameter NATDetected
	 * 
	 * @return NATDetected
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createNATDetected() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "NATDetected");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.BOOLEAN);
		param.addCheck(CheckBoolean.getInstance());
		param.setValue(Boolean.FALSE);
		param.setWritable(false);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramPeriodicInformInterval;

	/**
	 * Getter method of PeriodicInformInterval.
	 * 
	 * @return _PeriodicInformInterval
	 */
	public final com.francetelecom.admindm.model.Parameter getParamPeriodicInformInterval() {
		return this.paramPeriodicInformInterval;
	}

	/**
	 * Create the parameter PeriodicInformInterval
	 * 
	 * @return PeriodicInformInterval
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createPeriodicInformInterval() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "PeriodicInformInterval");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(1));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNServerPort;

	/**
	 * Getter method of STUNServerPort.
	 * 
	 * @return _STUNServerPort
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNServerPort() {
		return this.paramSTUNServerPort;
	}

	/**
	 * Create the parameter STUNServerPort
	 * 
	 * @return STUNServerPort
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNServerPort() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNServerPort");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(65535));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNEnable;

	/**
	 * Getter method of STUNEnable.
	 * 
	 * @return _STUNEnable
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNEnable() {
		return this.paramSTUNEnable;
	}

	/**
	 * Create the parameter STUNEnable
	 * 
	 * @return STUNEnable
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNEnable() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNEnable");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.BOOLEAN);
		param.addCheck(CheckBoolean.getInstance());
		param.setValue(Boolean.FALSE);
		param.setWritable(true);
		return param;
	}

	/**
	 * Whether or not the CPE MUST periodically send CPE information to the using the Inform method call.
	 */
	private com.francetelecom.admindm.model.Parameter paramPeriodicInformEnable;

	/**
	 * Getter method of PeriodicInformEnable.
	 * 
	 * @return _PeriodicInformEnable
	 */
	public final com.francetelecom.admindm.model.Parameter getParamPeriodicInformEnable() {
		return this.paramPeriodicInformEnable;
	}

	/**
	 * Create the parameter PeriodicInformEnable
	 * 
	 * @return PeriodicInformEnable
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createPeriodicInformEnable() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "PeriodicInformEnable");
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
	private com.francetelecom.admindm.model.Parameter paramUDPConnectionRequestAddressNotificationLimit;

	/**
	 * Getter method of UDPConnectionRequestAddressNotificationLimit.
	 * 
	 * @return _UDPConnectionRequestAddressNotificationLimit
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUDPConnectionRequestAddressNotificationLimit() {
		return this.paramUDPConnectionRequestAddressNotificationLimit;
	}

	/**
	 * Create the parameter UDPConnectionRequestAddressNotificationLimit
	 * 
	 * @return UDPConnectionRequestAddressNotificationLimit
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUDPConnectionRequestAddressNotificationLimit()
			throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "UDPConnectionRequestAddressNotificationLimit");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(true);
		return param;
	}

	/**
	 * An absolute time reference in UTC to determine when the CPE will the periodic Inform method calls. Each Inform
	 * call MUST occur at reference time plus or minus an integer multiple of the {{param}} is used only to set the
	 * ''phase'' of the periodic Informs. actual value of {{param}} can be arbitrarily far into the past or For example,
	 * if {{param|PeriodicInformInterval}} is 86400 (a day) if {{param}} is set to UTC midnight on some day (in the
	 * past, or future) then periodic Informs will occur every day at UTC These MUST begin on the very next midnight,
	 * even if {{param}} refers a day in the future. The Unknown Time value defined in 3.2}} indicates that no
	 * particular time reference is specified. That the CPE MAY locally choose the time reference, and needs only to to
	 * the specified {{param|PeriodicInformInterval}}. If absolute time not available to the CPE, its periodic Inform
	 * behavior MUST be the as if the {{param}} parameter was set to the Unknown Time value.
	 */
	private com.francetelecom.admindm.model.Parameter paramPeriodicInformTime;

	/**
	 * Getter method of PeriodicInformTime.
	 * 
	 * @return _PeriodicInformTime
	 */
	public final com.francetelecom.admindm.model.Parameter getParamPeriodicInformTime() {
		return this.paramPeriodicInformTime;
	}

	/**
	 * Create the parameter PeriodicInformTime
	 * 
	 * @return PeriodicInformTime
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createPeriodicInformTime() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "PeriodicInformTime");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.DATE);
		param.setValue(new Long(0));
		param.setWritable(true);
		return param;
	}

	/**
	 * HTTP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Request notification to the CPE. In the form: :
	 * The ''host'' portion of the URL MAY be the IP address for the interface of the CPE in lieu of a host name.
	 */
	private com.francetelecom.admindm.model.Parameter paramConnectionRequestURL;

	/**
	 * Getter method of ConnectionRequestURL.
	 * 
	 * @return _ConnectionRequestURL
	 */
	public final com.francetelecom.admindm.model.Parameter getParamConnectionRequestURL() {
		return this.paramConnectionRequestURL;
	}

	/**
	 * Create the parameter ConnectionRequestURL
	 * 
	 * @return ConnectionRequestURL
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createConnectionRequestURL() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "ConnectionRequestURL");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setMandatoryNotification(true);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
	 * Present only for a CPE that provides a LAN-side web page to show during a file download. LAN-accessible URL, as
	 * defined in to which a web-server associated with the ACS MAY redirect a user's on initiation of a file download
	 * to observer the status of the
	 * 
	 */
	private com.francetelecom.admindm.model.Parameter paramDownloadProgressURL;

	/**
	 * Getter method of DownloadProgressURL.
	 * 
	 * @return _DownloadProgressURL
	 */
	public final com.francetelecom.admindm.model.Parameter getParamDownloadProgressURL() {
		return this.paramDownloadProgressURL;
	}

	/**
	 * Create the parameter DownloadProgressURL
	 * 
	 * @return DownloadProgressURL
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createDownloadProgressURL() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "DownloadProgressURL");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

	/**
	 * nullNote that on a factory reset of the CPE, the value of this might be reset to its factory value. If an ACS
	 * modifies the value of parameter, it SHOULD be prepared to accommodate the situation that original value is
	 * restored as the result of a factory reset.
	 */
	private com.francetelecom.admindm.model.Parameter paramUsername;

	/**
	 * Getter method of Username.
	 * 
	 * @return _Username
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUsername() {
		return this.paramUsername;
	}

	/**
	 * Create the parameter Username
	 * 
	 * @return Username
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUsername() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "Username");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNMinimumKeepAlivePeriod;

	/**
	 * Getter method of STUNMinimumKeepAlivePeriod.
	 * 
	 * @return _STUNMinimumKeepAlivePeriod
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNMinimumKeepAlivePeriod() {
		return this.paramSTUNMinimumKeepAlivePeriod;
	}

	/**
	 * Create the parameter STUNMinimumKeepAlivePeriod
	 * 
	 * @return STUNMinimumKeepAlivePeriod
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNMinimumKeepAlivePeriod() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNMinimumKeepAlivePeriod");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.UINT);
		param.addCheck(new CheckMinimum(0));
		param.addCheck(new CheckMaximum(4294967295L));
		param.setValue(new Long(0));
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramSTUNPassword;

	/**
	 * Getter method of STUNPassword.
	 * 
	 * @return _STUNPassword
	 */
	public final com.francetelecom.admindm.model.Parameter getParamSTUNPassword() {
		return this.paramSTUNPassword;
	}

	/**
	 * Create the parameter STUNPassword
	 * 
	 * @return STUNPassword
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createSTUNPassword() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "STUNPassword");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setHidden(true);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramConnectionRequestUsername;

	/**
	 * Getter method of ConnectionRequestUsername.
	 * 
	 * @return _ConnectionRequestUsername
	 */
	public final com.francetelecom.admindm.model.Parameter getParamConnectionRequestUsername() {
		return this.paramConnectionRequestUsername;
	}

	/**
	 * Create the parameter ConnectionRequestUsername
	 * 
	 * @return ConnectionRequestUsername
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createConnectionRequestUsername() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "ConnectionRequestUsername");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
	 * Indicates whether or not the ACS will manage upgrades for the CPE. {{true}}, the CPE SHOULD NOT use other means
	 * other than the ACS to out available upgrades. If {{false}}, the CPE MAY use other means this purpose. Note that
	 * an autonomous upgrade (reported via an "10 TRANSFER COMPLETE" Inform Event code) SHOULD be regarded as a upgrade
	 * if it is performed according to ACS-specified policy.
	 */
	private com.francetelecom.admindm.model.Parameter paramUpgradesManaged;

	/**
	 * Getter method of UpgradesManaged.
	 * 
	 * @return _UpgradesManaged
	 */
	public final com.francetelecom.admindm.model.Parameter getParamUpgradesManaged() {
		return this.paramUpgradesManaged;
	}

	/**
	 * Create the parameter UpgradesManaged
	 * 
	 * @return UpgradesManaged
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createUpgradesManaged() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "UpgradesManaged");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.BOOLEAN);
		param.addCheck(CheckBoolean.getInstance());
		param.setValue(Boolean.FALSE);
		param.setWritable(true);
		return param;
	}

	/**
	 * URL, as defined in {{bibref|RFC3986}}, for the CPE to connect to the using the CPE WAN Management Protocol. This
	 * parameter MUST be in the of a valid HTTP or HTTPS URL. The ''host'' portion of this URL is by the CPE for
	 * validating the ACS certificate when using SSL or TLS. that on a factory reset of the CPE, the value of this
	 * parameter be reset to its factory value. If an ACS modifies the value of this it SHOULD be prepared to
	 * accommodate the situation that the original is restored as the result of a factory reset.
	 */
	private com.francetelecom.admindm.model.Parameter paramURL;

	/**
	 * Getter method of URL.
	 * 
	 * @return _URL
	 */
	public final com.francetelecom.admindm.model.Parameter getParamURL() {
		return this.paramURL;
	}

	/**
	 * Create the parameter URL
	 * 
	 * @return URL
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createURL() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "URL");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(256));
		param.setValue("");
		param.setWritable(true);
		return param;
	}

	/**
    *  
    */
	private com.francetelecom.admindm.model.Parameter paramParameterKey;

	/**
	 * Getter method of ParameterKey.
	 * 
	 * @return _ParameterKey
	 */
	public final com.francetelecom.admindm.model.Parameter getParamParameterKey() {
		return this.paramParameterKey;
	}

	/**
	 * Create the parameter ParameterKey
	 * 
	 * @return ParameterKey
	 * @throws Fault
	 *             exception
	 */
	public final com.francetelecom.admindm.model.Parameter createParameterKey() throws Fault {
		com.francetelecom.admindm.model.Parameter param;
		param = this.data.createOrRetrieveParameter(this.basePath + "ParameterKey");
		param.setNotification(0);
		param.setStorageMode(StorageMode.DM_ONLY);
		param.setActiveNotificationDenied(true);
		param.setMandatoryNotification(true);
		param.setType(ParameterType.STRING);
		param.addCheck(new CheckLength(32));
		param.setValue("");
		param.setWritable(false);
		return param;
	}

}
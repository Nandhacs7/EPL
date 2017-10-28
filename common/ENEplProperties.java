/**
 * 
 */
package com.firstapex.rs.epl.cn.common;

import javax.annotation.Resource;

import org.springframework.core.env.Environment;

/**
 * @author lokeshm
 *
 */
//@PropertySource({ "classpath:configuration/enepl.properties"})
public class ENEplProperties {
	
	@Resource
	private static Environment env;
//	
//	private static final String PROPERTY_NAME_FG_SERVER_HOST_NAME = "epl.fgserverhost";
//	private static final String PROPERTY_NAME_FG_SERVER_PORT_NAME = "epl.fgserverport";
//	private static final String PROPERTY_NAME_OPERATOR_ID="epl.operatorid";
//	private static final String PROPERTY_NAME_ORACLE_HOST_NAME="epl.oracleHost";
//	private static final String PROPERTY_NAME_ORACLE_PORT="epl.oraclePort";
//	private static final String PROPERTY_NAME_ORACLE_SERVICE_ID="epl.oracleSID";
//	private static final String PROPERTY_NAME_DATABASE_USERNAME = "epl.username";
//	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "epl.password";
	
	private String fgserverhost;
	private String fgserverport;
	private String operatorid;
	private String OracleHost;
	private String OraclePort;
	private String OracleSID;
	private String OracleUser;
	private String OraclePwd;
	
	
	public static ENEplProperties getEnEplProperties() {
		
		ENEplProperties enProp = new ENEplProperties();
//		
//		InputStream input = getClass().getClassLoader().getResourceAsStream("configuration/enepl.properties");
//		Properties prop = new Properties();
//		prop.load(input);
//		
//		
//		enProp.setFgserverhost(env.getRequiredProperty(PROPERTY_NAME_FG_SERVER_HOST_NAME));
//		enProp.setFgserverport(env.getRequiredProperty(PROPERTY_NAME_FG_SERVER_PORT_NAME));
//		enProp.setOperatorid(env.getRequiredProperty(PROPERTY_NAME_OPERATOR_ID));
//		enProp.setOracleHost(env.getRequiredProperty(PROPERTY_NAME_ORACLE_HOST_NAME));
//		enProp.setOraclePort(env.getRequiredProperty(PROPERTY_NAME_ORACLE_PORT));
//		enProp.setOracleSID(env.getRequiredProperty(PROPERTY_NAME_ORACLE_SERVICE_ID));
//		enProp.setOracleUser(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
//		enProp.setOraclePwd(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
		
		return enProp;
	}

	
	public String getFgserverhost() {
		return fgserverhost;
	}

	public void setFgserverhost(String fgserverhost) {
		this.fgserverhost = fgserverhost;
	}

	public String getFgserverport() {
		return fgserverport;
	}

	public void setFgserverport(String fgserverport) {
		this.fgserverport = fgserverport;
	}

	public String getOperatorid() {
		return operatorid;
	}

	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	public String getOracleHost() {
		return OracleHost;
	}

	public void setOracleHost(String oracleHost) {
		OracleHost = oracleHost;
	}

	public String getOraclePort() {
		return OraclePort;
	}

	public void setOraclePort(String oraclePort) {
		OraclePort = oraclePort;
	}

	public String getOracleSID() {
		return OracleSID;
	}

	public void setOracleSID(String oracleSID) {
		OracleSID = oracleSID;
	}

	public String getOracleUser() {
		return OracleUser;
	}

	public void setOracleUser(String oracleUser) {
		OracleUser = oracleUser;
	}

	public String getOraclePwd() {
		return OraclePwd;
	}

	public void setOraclePwd(String oraclePwd) {
		OraclePwd = oraclePwd;
	}
}

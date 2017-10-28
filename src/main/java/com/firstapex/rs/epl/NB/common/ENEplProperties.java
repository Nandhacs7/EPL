/**
 * 
 */
package com.firstapex.rs.epl.NB.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



/**
 * @author lokeshm
 *
 */
public class ENEplProperties {
	private String fgserverhost;
	private String fgserverport;
	private String operatorid;
    private int scheduletime;
    private boolean flag;
    private boolean eappflag;
    private static String connectionstring="D://EPL-NB-PROPS//connection.properties";
    

	public static ENEplProperties getEnEplProperties(){
		ENEplProperties enProp = new ENEplProperties();
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(connectionstring));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		enProp.setFgserverhost(prop.getProperty("EPLNB.fgserverhost"));
		enProp.setFgserverport(prop.getProperty("EPLNB.fgserverport"));
		enProp.setOperatorid(prop.getProperty("EPLNB.operatorid"));
		enProp.setScheduletime(Integer.parseInt(prop.getProperty("EPLNB.scheduleTime")));
		enProp.setFlag(Boolean.parseBoolean(prop.getProperty("EPLNB.flag")));
		enProp.setEappflag(Boolean.parseBoolean(prop.getProperty("EAPP.Eappflag")));
		enProp.setConnectionstring(connectionstring);
		return enProp;
	}
	
	public  String getConnectionstring() {
		return connectionstring;
	}

	public  void setConnectionstring(String connectionstring) {
		ENEplProperties.connectionstring = connectionstring;
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
	
	public int getScheduletime() {
		return scheduletime;
	}
	public void setScheduletime(int scheduletime) {
		this.scheduletime = scheduletime;
	}	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public boolean isEappflag() {
		return eappflag;
	}
	public void setEappflag(boolean eappflag) {
		this.eappflag = eappflag;
	}
}

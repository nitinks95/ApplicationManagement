package com.xworkz.app.mgmt.entity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	private Long lAppId;
	private String sAppName;
	private String sVersion;
	private String sLastRelease;
	private String sNextRelease;
	private String sDevDate;
	private String sIsDecommisioned;
	private List<Environment> myTableData;
	private String sTLName;
	private String sTeamMail;
	
	public Application(String sAppName, String sVersion, String sLastRelease, String sNextRelease,
			String sDevDate, String sIsDecommisioned, List<Environment> myTableData, String sTLName, String sTeamMail) {
		super();
		this.sAppName = sAppName;
		this.sVersion = sVersion;
		this.sLastRelease = sLastRelease;
		this.sNextRelease = sNextRelease;
		this.sDevDate = sDevDate;
		this.sIsDecommisioned = sIsDecommisioned;
		this.myTableData = myTableData;
		this.sTLName = sTLName;
		this.sTeamMail = sTeamMail;
		log.info(" --- inserted Application " + this.toString() + "successfully --- ");
	}
	
	public Long getlAppId() {
		return lAppId;
	}
	public void setlAppId(Long lAppId) {
		this.lAppId = lAppId;
	}
	public String getsAppName() {
		return sAppName;
	}
	public void setsAppName(String sAppName) {
		this.sAppName = sAppName;
	}
	public String getsVersion() {
		return sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}
	public String getsLastRelease() {
		return sLastRelease;
	}
	public void setsLastRelease(String sLastRelease) {
		this.sLastRelease = sLastRelease;
	}
	public String getsNextRelease() {
		return sNextRelease;
	}
	public void setsNextRelease(String sNextRelease) {
		this.sNextRelease = sNextRelease;
	}
	public String getsDevDate() {
		return sDevDate;
	}
	public void setsDevDate(String sDevDate) {
		this.sDevDate = sDevDate;
	}
	public String getsIsDecommisioned() {
		return sIsDecommisioned;
	}
	public void setsIsDecommisioned(String sIsDecommisioned) {
		this.sIsDecommisioned = sIsDecommisioned;
	}
	public List<Environment> getmyTableData() {
		return myTableData;
	}
	public void setmyTableData(List<Environment> myTableData) {
		this.myTableData = myTableData;
	}
	
	public String getsTLName() {
		return sTLName;
	}

	public void setsTLName(String sTLName) {
		this.sTLName = sTLName;
	}

	public String getsTeamMail() {
		return sTeamMail;
	}

	public void setsTeamMail(String sTeamMail) {
		this.sTeamMail = sTeamMail;
	}

	@Override
	public String toString() {
		return "Application [lAppId=" + lAppId + ", sAppName=" + sAppName + ", sVersion=" + sVersion + ", sLastRelease="
				+ sLastRelease + ", sNextRelease=" + sNextRelease + ", sDevDate=" + sDevDate
				+ ", sIsDecommisioned=" + sIsDecommisioned + ", myTableData=" + myTableData + ", sTLName=" + sTLName
				+ ", sTeamMail=" + sTeamMail + "]";
	}
	
	
	
}

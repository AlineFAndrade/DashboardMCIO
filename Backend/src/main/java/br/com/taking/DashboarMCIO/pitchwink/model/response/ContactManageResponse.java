package br.com.taking.DashboarMCIO.pitchwink.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ContactManageResponse {
	
	private String returncode;
	private String pwcodecontact;
	
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public String getPwcodecontact() {
		return pwcodecontact;
	}
	public void setPwcodecontact(String pwcodecontact) {
		this.pwcodecontact = pwcodecontact;
	}
	
	

}

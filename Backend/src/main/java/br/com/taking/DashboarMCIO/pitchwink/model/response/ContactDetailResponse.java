package br.com.taking.DashboarMCIO.pitchwink.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDetailResponse {

	private String name;
	private String pwcodecontact;
	private String email;
	private String mobile;
	private String gender;
	private String birthday;

	public ContactDetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwcodecontact() {
		return pwcodecontact;
	}

	public void setPwcodecontact(String pwcodecontact) {
		this.pwcodecontact = pwcodecontact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}

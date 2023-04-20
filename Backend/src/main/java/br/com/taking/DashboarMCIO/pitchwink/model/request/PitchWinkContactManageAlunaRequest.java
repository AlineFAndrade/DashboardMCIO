package br.com.taking.DashboarMCIO.pitchwink.model.request;

public class PitchWinkContactManageAlunaRequest extends PitchWinkContactManageRequest{

	private String name;
	private String email;
	private String mobile;
	private String birthday;
	private String gender;
	
	
	public PitchWinkContactManageAlunaRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PitchWinkContactManageAlunaRequest(String credential, String token, String function, String usercodegroup,
			String delete) {
		super(credential, token, function, usercodegroup, delete);
		// TODO Auto-generated constructor stub
	}
	public PitchWinkContactManageAlunaRequest(String credential, String token, String function, String usercodegroup,
			String delete, String name, String email, String mobile, String birthday, String gender) {
		super(credential, token, function, usercodegroup, delete);
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.birthday = birthday;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}

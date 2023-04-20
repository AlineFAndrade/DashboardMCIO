package br.com.taking.DashboarMCIO.pitchwink.model.request;

public class PitchWinkContactManageRequest {
	
	private String credential;
	private String token;
	private String function;
	private String usercodegroup;
	private String delete;
	
	public PitchWinkContactManageRequest(String credential, String token, String function, String usercodegroup,
			String delete) {
		super();
		this.credential = credential;
		this.token = token;
		this.function = function;
		this.usercodegroup = usercodegroup;
		this.delete = delete;
	}

	public PitchWinkContactManageRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getUsercodegroup() {
		return usercodegroup;
	}

	public void setUsercodegroup(String usercodegroup) {
		this.usercodegroup = usercodegroup;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}
	

}

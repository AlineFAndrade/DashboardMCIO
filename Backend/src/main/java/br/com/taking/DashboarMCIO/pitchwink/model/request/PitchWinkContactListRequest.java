package br.com.taking.DashboarMCIO.pitchwink.model.request;

public class PitchWinkContactListRequest {
	
	private String credential;
	private String token;
	private String function;
	private String usercodegroup;
	
	public PitchWinkContactListRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PitchWinkContactListRequest(String credential, String token, String function, String usercodegroup) {
		super();
		this.credential = credential;
		this.token = token;
		this.function = function;
		this.usercodegroup = usercodegroup;
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

}

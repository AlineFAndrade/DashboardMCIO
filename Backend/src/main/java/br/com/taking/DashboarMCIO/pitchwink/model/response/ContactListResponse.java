package br.com.taking.DashboarMCIO.pitchwink.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ContactListResponse {
	
	private List<ContactDetailResponse> contactsdetails;

	public ContactListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactListResponse(List<ContactDetailResponse> contactsdetails) {
		super();
		this.contactsdetails = contactsdetails;
	}

	public List<ContactDetailResponse> getContactsdetails() {
		return contactsdetails;
	}

	public void setContactsdetails(List<ContactDetailResponse> contactsdetails) {
		this.contactsdetails = contactsdetails;
	}

	

}

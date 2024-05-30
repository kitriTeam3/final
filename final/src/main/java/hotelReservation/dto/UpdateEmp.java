package hotelReservation.dto;

public class UpdateEmp {

	private String eid;
	private String email;
	private String ephone;
	
	public UpdateEmp() {
		
	}
	
	public UpdateEmp(String eid, String email, String ephone) {
		this.eid = eid;
		this.email = email;
		this.ephone = ephone;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEphone() {
		return ephone;
	}
	public void setEphone(String ephone) {
		this.ephone = ephone;
	}
}

package hotelReservation.dto;

public class UpdateCus {

	private String cid;
	private String cmail;
	private String cphone;
	
	public UpdateCus() {
		
	}
	
	public UpdateCus(String cid, String cmail, String cphone) {
		this.cid = cid;
		this.cmail = cmail;
		this.cphone = cphone;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	
}

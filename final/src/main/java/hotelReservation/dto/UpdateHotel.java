package hotelReservation.dto;

public class UpdateHotel {
	
	private String hid;
	private String hmail;
	private String hphone;
	
	public UpdateHotel() {
		
	}
	
	public UpdateHotel(String hid, String hmail, String hphone) {
		this.hid = hid;
		this.hmail = hmail;
		this.hphone = hphone;
	}
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHmail() {
		return hmail;
	}
	public void setHmail(String hmail) {
		this.hmail = hmail;
	}
	public String getHphone() {
		return hphone;
	}
	public void setHphone(String hphone) {
		this.hphone = hphone;
	}
}

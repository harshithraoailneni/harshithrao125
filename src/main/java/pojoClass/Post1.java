package pojoClass;

public class Post1 {
	String address;
	String area;
	long contact;
	String hotelname;
	double payment;
	String website;
	String id;
	public Post1(String address, String area, long contact, String hotelname, double payment, String website,
			String id) {
		super();
		this.address = address;
		this.area = area;
		this.contact = contact;
		this.hotelname = hotelname;
		this.payment = payment;
		this.website = website;
		this.id = id;
	}
	public void Post1(String address2, String area2, long contact2, String hotelname2, double payment2, String website2,
			String id2) {
		
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}

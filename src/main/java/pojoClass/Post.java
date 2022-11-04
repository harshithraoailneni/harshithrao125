package pojoClass;

public class Post {
	String address;
	String area;
	long contact;
	String hotelname;
	double payment;
	String website;
	public Post(String address, String area, long contact, String hotelname, double payment, String website) {
		super();
		this.address = address;
		this.area = area;
		this.contact = contact;
		this.hotelname = hotelname;
		this.payment = payment;
		this.website = website;
	}
	public void Post(String address2, String area2, long contact2, String hotelname2, double payment2, String website2) {
		// TODO Auto-generated constructor stub
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
}

package com.dto;

public class TableBooking {
	
	private String bookingid;
	private int nofpax;
	private String cusine;
	private int starrating;
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public int getNofpax() {
		return nofpax;
	}
	public void setNofpax(int nofpax) {
		this.nofpax = nofpax;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public int getStarrating() {
		return starrating;
	}
	public void setStarrating(int starrating) {
		this.starrating = starrating;
	}
	public TableBooking(String bookingid, int nofpax, String cusine, int starrating) {
		super();
		this.bookingid = bookingid;
		this.nofpax = nofpax;
		this.cusine = cusine;
		this.starrating = starrating;
	}
	public TableBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TableBooking [bookingid=" + bookingid + ", nofpax=" + nofpax + ", cusine=" + cusine + ", starrating="
				+ starrating + "]";
	}
	

}

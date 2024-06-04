package com.palak;

public class Address {

	private String add1;
	private String add2;
	private String city;
	private Long zipCode;
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [add1=" + add1 + ", add2=" + add2 + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
}

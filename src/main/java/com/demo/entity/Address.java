package com.demo.entity;

public class Address {
 private String street;
 private String state;
 private String city;
 private String country;
 private String zip;
 public Address() {
	 
 }
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "Address [street=" + street + ", state=" + state + ", city=" + city + ", country=" + country + ", zip=" + zip
			+ "]";
}
 
}

package com.app.myapp.domain;

import javax.persistence.Entity;

@Entity
public class Address {
		
private String Line1;
private String city;
private String state;



@Override
public String toString() {
	return "Address [Line1=" + Line1 + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
}
public Address() {
	super();
}
public Address(String line1, String city, String state, String zip) {
	super();
	Line1 = line1;
	this.city = city;
	this.state = state;
	this.zip = zip;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Line1 == null) ? 0 : Line1.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((zip == null) ? 0 : zip.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (Line1 == null) {
		if (other.Line1 != null)
			return false;
	} else if (!Line1.equals(other.Line1))
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (state == null) {
		if (other.state != null)
			return false;
	} else if (!state.equals(other.state))
		return false;
	if (zip == null) {
		if (other.zip != null)
			return false;
	} else if (!zip.equals(other.zip))
		return false;
	return true;
}
public String getLine1() {
	return Line1;
}
public void setLine1(String line1) {
	Line1 = line1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
private String zip;

}

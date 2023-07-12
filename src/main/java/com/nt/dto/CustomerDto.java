package com.nt.dto;

public class CustomerDto {
private int id;
private String name;
private String addres;
private Float pamt;
private Float rate;
private Float time;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
public Float getPamt() {
	return pamt;
}
public void setPamt(Float pamt) {
	this.pamt = pamt;
}
public Float getRate() {
	return rate;
}
public void setRate(Float rate) {
	this.rate = rate;
}
public Float getTime() {
	return time;
}
public void setTime(Float time) {
	this.time = time;
}
@Override
public String toString() {
	return "CustomerDto [id=" + id + ", name=" + name + ", addres=" + addres + ", pamt=" + pamt + ", rate=" + rate
			+ ", time=" + time + "]";
}

}

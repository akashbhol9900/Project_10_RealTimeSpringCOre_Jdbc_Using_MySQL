package com.nt.Vo;

public class CustomerVo {
private String id;
private String name;
private String addres;
private String pamt;
private String rate;
private String time;
public String getId() {
	return id;
}
public void setId(String id) {
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
public String getPamt() {
	return pamt;
}
public void setPamt(String pamt) {
	this.pamt = pamt;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public String toString() {
	return "CustomerVo [id=" + id + ", name=" + name + ", addres=" + addres + ", pamt=" + pamt + ", rate=" + rate
			+ ", time=" + time + "]";
}


}

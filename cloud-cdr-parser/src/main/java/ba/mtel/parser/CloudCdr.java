package ba.mtel.parser;

import java.sql.Date;

public class CloudCdr {
	
	private String cloud;
	private String service;
	private double amount;
	private Date date;
	
	
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	

}

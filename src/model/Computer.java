package model;

public class Computer {
	private String reference;
	private String ipAddress;
	private String brand;
	public Computer(String reference, String ipAddress, String brand) {
		this.reference = reference;
		this.ipAddress = ipAddress;
		this.brand = brand;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}

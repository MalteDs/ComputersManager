package model;

public interface Operable {
	public static final int processorsNumber=8;
	public String turnOn(String ipAddress,String reference);
	public String turnOff(String ipAddress, String reference);
}

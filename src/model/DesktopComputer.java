package model;

public class DesktopComputer extends Computer implements Operable {
	private String accesories;
	private double memoriShore;
	
	public DesktopComputer(String reference, String ipAddress, String brand, String accesories, double memoriShore) {
		super(reference, ipAddress, brand);
		this.accesories = accesories;
		this.memoriShore = memoriShore;
	}

	public String getAccesories() {
		return accesories;
	}

	public void setAccesories(String accesories) {
		this.accesories = accesories;
	}

	public double getMemoriShore() {
		return memoriShore;
	}

	public void setMemoriShore(double memoriShore) {
		this.memoriShore = memoriShore;
	}

	public String turnOn(String ipAddress,String reference) {
		String message="The computer "+reference+" is ON";
		
		return message;
	}

	public String turnOff(String ipAddress,String reference) {
		String message="The computer "+reference+" is OFF";
		return message;
	}
	
	
	
	

}

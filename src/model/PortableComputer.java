package model;

public class PortableComputer extends Computer {
	
	private int size;

	public PortableComputer(String reference, String ipAddress, String brand, int size) {
		super(reference, ipAddress, brand);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}

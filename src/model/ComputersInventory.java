package model;

public class ComputersInventory {
	//Attributes
	private static final int MAX_COMP=50;
	private static final int MEMORY_SHORE=500;
	//Relations
	private Computer[] computersList;
	public ComputersInventory() {
		this.computersList= new Computer[MAX_COMP];
	}
	
	public String addComputer(String reference,String ip, String brand, int size) {
		String message="";
		int exists=compVerify(reference);
		if(exists==-1){
			for (int i = 0; i < MAX_COMP; i++) {
				if (computersList[i]==null) {
					computersList[i]=new PortableComputer(reference,ip,brand,size);
					message="Portable computer sucefully added";
				}
			}
			
		}
		else if(exists!=-1)
			message="The computer reference already exists. The last one entered will be deleted";
		return message;
	}
	
	public String addComputer(String reference, String ip, String brand, String accesories) {
		String message="";
		int exists=compVerify(reference);
		if(exists==-1){
			for (int i = 0; i < MAX_COMP; i++) {
				if (computersList[i]==null) {
					computersList[i]=new DesktopComputer(reference,ip,brand,accesories,0);
					message="Desktop computer sucefully added";
				}
			}
			
		}
		else if(exists!=-1)
			message="The computer reference already exists. The last one entered will be deleted";
		return message;
	}
	
	public int compVerify(String reference){
		int exists=-1;
		for(int i=0;i<MAX_COMP;i++){
			if(computersList[i]!=null && computersList[i].getReference().equalsIgnoreCase(reference))
				return i;
		}
		return exists;
	}
	
	public String turnOn(String reference, String ip) {
		String message="";
		int exists=compVerify(reference);
		if(exists!=-1){
			if(computersList[exists]!=null){
				if(computersList[exists].getReference().equalsIgnoreCase(reference) && computersList[exists] instanceof DesktopComputer) {
					message=((DesktopComputer) (computersList[exists])).turnOn("172.31.255.255", reference);
					((DesktopComputer) (computersList[exists])).setMemoriShore(MEMORY_SHORE);
					return message;
				}
			}
		}
		else if(exists==-1) {
			message="The desktop computer no exists";
			return message;
		}
		return message;
	}
	
	public String turnOff(String reference, String ip) {
		String message="";
		int exists=compVerify(reference);
		if(exists!=-1){
			if(computersList[exists]!=null){
				if(computersList[exists].getReference().equalsIgnoreCase(reference) && computersList[exists] instanceof DesktopComputer) {
					message=((DesktopComputer) (computersList[exists])).turnOff("172.31.255.255", reference);
					((DesktopComputer) (computersList[exists])).setMemoriShore(MEMORY_SHORE);
					return message;
				}
			}
		}
		else if(exists==-1) {
			message="The desktop computer no exists";
			return message;
		}
		return message;
	}
	
	public String removeComputer(String reference) {
		String message="";
		int exists=compVerify(reference);
		if(exists!=-1){
			if(computersList[exists]!=null){
				if(computersList[exists].getReference().equalsIgnoreCase(reference) && computersList[exists] instanceof DesktopComputer) {
					computersList[exists]=null;
					message="The computer: "+reference+" has been deleted";
				}
			}
		}
		else if(exists==-1)
			message="The desktop computer no exists";
		return message;
	}
}

package ui;
import model.*;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc=new Scanner(System.in);
	public static ComputersInventory computers= new ComputersInventory();
	public static void main(String[] args) {
		int computersCont=0;
		for (boolean exit = false; exit == false;) {
			System.out.println("COMPUTERS MANAGER \n There are "+computersCont+" computers \n 1. Add computer \n 2. Turn on computer \n 3. Turn off computer \n 4. Remove computer \n 5. exit");
			int sel=sc.nextInt();
			sc.nextLine();
			switch (sel) {
				case 1: addComputer(sc);
					computersCont++;
					break;
				case 2: turnOn(sc);
					break;
				case 3: turnOff(sc);
					break;
				case 4: removeComputer(sc);
					computersCont--;
					break;
				case 5: exit=true;
				break;
			}
		}

	}
	

	public static void addComputer(Scanner sc) {
		System.out.println("Select computer category \n 1. Portatil computer \n 2. Desktop computer");
		int sel=sc.nextInt();
		sc.nextLine();
		if(sel==1)
			addPortatil(sc);
		if(sel==2)
			addDesktop(sc);
	}
	
	

	public static void addPortatil(Scanner sc) {
		System.out.println("CREATE PORTATIL COMPUTER");
		System.out.println("Enter the unique reference");
		String reference=sc.nextLine();
		System.out.println("Enter the ip address");
		String ip=sc.nextLine();
		System.out.println("Enter the brand");
		String brand=sc.nextLine();
		System.out.println("Enter the size");
		int size=sc.nextInt();
		sc.nextLine();
		String message=computers.addComputer(reference, ip, brand, size);
		System.out.println(message);
	}


	public static void addDesktop(Scanner sc) {
		System.out.println("CREATE PORTATIL COMPUTER");
		System.out.println("The ip address for the all desktop computers is 172.31.255.255");
		String ip="172.31.255.255";
		System.out.println("Enter the unique reference");
		String reference=sc.nextLine();
		System.out.println("Enter the brand");
		String brand=sc.nextLine();
		System.out.println("Enter the accesories");
		String accesories=sc.nextLine();
		String message=computers.addComputer(reference, ip, brand, accesories);
		System.out.println(message);
	}


	public static void turnOn(Scanner sc) {
		System.out.println("TURN ON A COMPUTER(desktop only)");
		System.out.println("Enter the reference to search");
		String reference=sc.nextLine();
		String ip="172.31.255.255";
		String message=computers.turnOn(reference,ip);
		System.out.println(message);
	}


	public static void turnOff(Scanner sc) {
		System.out.println("TURN OFF A COMPUTER(desktop only)");
		System.out.println("Enter the reference to search");
		String reference=sc.nextLine();
		String ip="172.31.255.255";
		String message=computers.turnOff(reference,ip);
		System.out.println(message);
		
	}


	public static void removeComputer(Scanner sc) {
		System.out.println("DELETE A COMPUTER");
		System.out.println("Enter the unique reference to search");
		String reference=sc.nextLine();
		String message=computers.removeComputer(reference);
		System.out.println(message);
	}

}
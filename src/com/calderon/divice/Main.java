package com.calderon.divice;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("STAR PROGRAM");
		
		Device device1 = new Device("Frigorifico" , "Fagor", 400.00);
		System.out.println(device1.toString());
		
		
		Mobile mobile1 = new Mobile("f300","Samsung", 300.00, "A1");
		System.out.println(mobile1.toString());
		
		Computer computer1 = new Computer("Olffdsun","HP", 800.00D, "Intel");
		System.out.println(computer1.toString());
		
		
		
		
		
		System.out.println("END PROGRAM");

	}

}

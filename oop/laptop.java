package oop;

public class laptop {
	//fields
	String model;
	String type;
	String cpu;
	String yom;
	String vendor;
	String ram;
	String color;
	//constructor initializes class fields
	public laptop(String model,String type,String cpu,String yom,String vendor,String ram,String color){
		this.model=model;
		this.type=type;
		this.cpu=cpu;
		this.yom=yom;
		this.vendor=vendor;
		this.ram=ram;
		this.color=color;
	}
	void showdetails() {
		System.out.println("laptop["+model+" "+type+" "+cpu+" "+cpu+" "+yom+" "+vendor+" "+ram+" "+color+"]");
	}
		
	
	

}

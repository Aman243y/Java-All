package oop;

public class order {

	public static void main(String[] args) {
		laptop l1=new laptop("macbook pro","m2","12 core","2023","apple","16gb","black");
		laptop l2=new laptop("lenovo slim 5","a2","24 core","2020","lenovo","64gb","white");
		laptop l3=new laptop("dell platinum","s2","36 core","2022","dell","128gb","black");
		
		l3.showdetails();
		l2.showdetails();
		l1.showdetails();

	}

}

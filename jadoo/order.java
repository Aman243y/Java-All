package jadoo;

import oop.laptop;

public class order {

	public static void main(String[] args) {
		laptop m1=new laptop ("macbook pro","m2","12 core","2023","apple","16gb","black");
		laptop m2=new laptop("lenovo slim 5","a2","24 core","2020","lenovo","64gb","white");
		laptop m3=new laptop("lenovo slim 5","a2","24 core","2020","lenovo","64gb","white");
		
		m1.equals(m1);
		m2.equals(m2);
		m3.equals(m3);
	}

}

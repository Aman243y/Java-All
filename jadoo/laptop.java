package jadoo;

public class laptop {
	//fields
	String model;
	String type;
	String cpu;
	String yom;
	String vendor;
	String ram;
	String color;
	/**
	 * @param model
	 * @param type
	 * @param cpu
	 * @param yom
	 * @param vendor
	 * @param ram
	 * @param color
	 */
	public laptop(String model, String type, String cpu, String yom, String vendor, String ram, String color) {
		super();
		this.model = model;
		this.type = type;
		this.cpu = cpu;
		this.yom = yom;
		this.vendor = vendor;
		this.ram = ram;
		this.color = color;
	}
	//for debugging purpose
	@Override
	public String toString() {
		return "laptop [model=" + model + ", type=" + type + ", cpu=" + cpu + ", yom=" + yom + ", vendor=" + vendor
				+ ", ram=" + ram + ", color=" + color + "]";
	}
	
	//for debugging purpose
	
	
	

}

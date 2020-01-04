package delnex4d;

public class Showroom {
	String sName;
	String location;
	String cName;
	String cMake;
	int gears;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcMake() {
		return cMake;
	}
	public void setcMake(String cMake) {
		this.cMake = cMake;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public Showroom(String sName, String location, String cName, String cMake, int gears) {
		super();
		this.sName = sName;
		this.location = location;
		this.cName = cName;
		this.cMake = cMake;
		this.gears = gears;
	}
	@Override
	public String toString() {
		return "Showroom [Showroom Name=" + sName + ", Location=" + location + ", Car=" + cName + ", Make=" + cMake
				+ ", No. of gears=" + gears + "]";
	}
	
}

package in.nit;

public class Test {
	private int sid;
	private String sname;
	private String college;
	private String location;
	
	public Test() {
		System.out.println("Test.Test()");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Test [sid=" + sid + ", sname=" + sname + ", college=" + college + ", location=" + location + "]";
	}
	
	


}

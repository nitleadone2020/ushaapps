package in.nit;

public class Test {
	private int sid;
	private String sname;
	private String scollege;
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

	public String getScollege() {
		return scollege;
	}

	public void setScollege(String scollege) {
		this.scollege = scollege;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Test [sid=" + sid + ", sname=" + sname + ", scollege=" + scollege + ", location=" + location + "]";
	}



	
	


}

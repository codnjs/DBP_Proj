package aca.mirim.domain;

public class UserVO {
	
	private int uno;
	private String userid; 
    private String userpw; 
    
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	@Override
	public String toString() {
		return "UserVO [uno=" + uno + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
    
    
}
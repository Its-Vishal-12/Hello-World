package com.MoboFlux.Binding;

public class UserInfo {
	
	
	private  int userinfo;
	
	private String username;
	
	private String useremail;

	public int getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(int userinfo) {
		this.userinfo = userinfo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public UserInfo(int userinfo, String username, String useremail) {
		super();
		this.userinfo = userinfo;
		this.username = username;
		this.useremail = useremail;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserInfo [userinfo=" + userinfo + ", username=" + username + ", useremail=" + useremail + "]";
	}
	
	

}

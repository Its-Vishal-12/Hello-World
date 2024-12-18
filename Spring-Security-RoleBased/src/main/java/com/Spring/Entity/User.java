package com.Spring.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Entity")
public class User {
	
	@Id
	@Column(name="UserId")
	private String uid;
	
	@Column(name="UserName",unique=true)
	private String username;
	
	@Column(name="UserEmail", unique=true)
	private String useremail;
	
	@ElementCollection
	@CollectionTable(name="Roles", joinColumns=@JoinColumn(name="RoleId", referencedColumnName="UserId"))
	@Column(name="role")
	 private List<String> role;
	
	@Column(name="UserPassword",  nullable=true)
	private String password;



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public User(String uid, String username, String useremail, List<String> role, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.useremail = useremail;
		this.role = role;
		this.password = password;
	}



	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
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


	public User() {
		
	}



	public User(String uid, String username, String useremail, List<String> role) {
		super();
		this.uid = uid;
		this.username = username;
		this.useremail = useremail;
		this.role = role;
	}



	public List<String> getRole() {
		return role;
	}



	public void setRole(List<String> role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", useremail=" + useremail + ", role=" + role
				+ ", password=" + password + "]";
	}



	




	





	
	

}

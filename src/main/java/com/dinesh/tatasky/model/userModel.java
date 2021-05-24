package com.dinesh.tatasky.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class userModel {
	
	@Id
	@Column(name = "id",columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "username", columnDefinition = "varchar(45) default ''")
	private String username;
	
	/*@Column(name = "firstname", columnDefinition = "varchar(45) default ''")
	private String firstname;
	
	@Column(name = "lastname", columnDefinition = "varchar(45) default ''")
	private String lastname; */
	
	@Column(name = "password", columnDefinition = "varchar(45) default ''")
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	private accountModel account;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/*public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}  */
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public Object getUsername() {
		
		return null;*/
	}
	
	
//	public accountModel getAccount() {
//		return account;
//	}
//	public void setAccount(accountModel account) {
//		this.account = account;
//	}
//	



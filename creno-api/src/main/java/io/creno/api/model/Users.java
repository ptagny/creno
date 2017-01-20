package io.creno.api.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2498374416793726377L;
	@Id
	@GeneratedValue
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	private String postalcode;
	private String postalcodesuffix;
	@OneToMany(targetEntity=Vehicle.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Set<Vehicle> vehiclelist = new HashSet<>();
	private String password;
	
	protected Users() {}

	public long getId(){
		return id;
	}

	public String getFirstName(){
		return firstname;
	}

	public String getLastName(){
		return lastname;
	}

	public String getEmail(){
		return email;
	}

	public String getZipCode(){
		return postalcode;
	}

	public Set<Vehicle> getVehicleList(){
		return vehiclelist;
	}
	
	public void setVehicleList(Set<Vehicle> vehList){
		this.vehiclelist = vehList;
	}


	public void setFirstName(String first){
		this.firstname = first;
	}

	public void setLastName(String last){
		this.lastname = last;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setZipCode(String zipcode){
		this.postalcode = zipcode;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the postalcodesuffix
	 */
	public String getPostalcodesuffix() {
		return postalcodesuffix;
	}

	/**
	 * @param postalcodesuffix the postalcodesuffix to set
	 */
	public void setPostalcodesuffix(String postalcodesuffix) {
		this.postalcodesuffix = postalcodesuffix;
	}
}
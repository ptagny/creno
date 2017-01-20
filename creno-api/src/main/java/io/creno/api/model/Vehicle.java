package io.creno.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8952059600766855072L;
	@Id
	@GeneratedValue
	private Integer id;
	private int year;
	private String make;
	private String model;
	private String adminarealevel1;
	private String adminarealevel2;
	private String country;
	private String platenumber;
	
	@OneToMany(targetEntity=Session.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Set<Session> sessionlist = new HashSet<>();
	
	@ManyToOne
    @JoinColumn(name = "userid")
	private Users user;
	
	protected Vehicle() {
		
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the adminAreaLevel2
	 */
	public String getAdminAreaLevel2() {
		return adminarealevel2;
	}

	/**
	 * @param adminAreaLevel2 the adminAreaLevel2 to set
	 */
	public void setAdminAreaLevel2(String adminAreaLevel2) {
		this.adminarealevel2 = adminAreaLevel2;
	}

	/**
	 * @return the adminAreaLevel1
	 */
	public String getAdminAreaLevel1() {
		return adminarealevel1;
	}

	/**
	 * @param adminAreaLevel1 the adminAreaLevel1 to set
	 */
	public void setAdminAreaLevel1(String adminAreaLevel1) {
		this.adminarealevel1 = adminAreaLevel1;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the plateNumber
	 */
	public String getPlateNumber() {
		return platenumber;
	}

	/**
	 * @param plateNumber the plateNumber to set
	 */
	public void setPlateNumber(String plateNumber) {
		this.platenumber = plateNumber;
	}


	/**
	 * @return the user
	 */
	public Users getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(Users user) {
		this.user = user;
	}

}
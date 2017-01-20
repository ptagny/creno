package io.creno.api.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="session")
public class Session{
	
	/**
	 * @param meterID
	 * @param vehicleID
	 * @param startTime
	 * @param endTime
	 * @param parkedAddress
	 * @param totalCost
	 *//*
	public Session(int Id,long meterID, long vehicleID, Date startTime, Date endTime, int streetNumberTo, String route, String neighborhood, String locality, String adminAreaLevel2, String adminAreaLevel1, String country, String postalCode, String postalCodeSuffix,
			Double totalCost) {
		
	}

	protected Session() {}*/
	@Id
	@GeneratedValue
	private Integer id;
	private Integer meterid;
	private long vehicleid;
	private Date starttime;
	private Date endtime;
	private int streetnumber;
	private String route;
	private String neighborhood;
	private String locality;
	private String adminarealevel2;
	private String adminarealevel1;
	private String country;
	private String postalcode;
	private String postalcodesuffix;
	private Double totalcost;
	@ManyToOne
    @JoinColumn(name = "meterid", insertable = false, updatable = false)
	private Meter meter;
	@ManyToOne
    @JoinColumn(name = "vehicleid", insertable = false, updatable = false)
	private Vehicle vehicle;
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
	 * @return the meterID
	 */
	public long getMeterID() {
		return meterid;
	}
	/**
	 * @param meterID the meterID to set
	 */
	public void setMeterID(Integer meterID) {
		this.meterid = meterID;
	}
	/**
	 * @return the vehicleID
	 */
	public long getVehicleID() {
		return vehicleid;
	}
	/**
	 * @param vehicleID the vehicleID to set
	 */
	public void setVehicleID(Integer vehicleID) {
		this.vehicleid = vehicleID;
	}
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return starttime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.starttime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endtime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endtime = endTime;
	}
	/**
	 * @return the totalCost
	 */
	public Double getTotalCost() {
		return totalcost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(Double totalCost) {
		this.totalcost = totalCost;
	}

	/**
	 * @return the streetNumber
	 */
	public int getStreetNumber() {
		return streetnumber;
	}

	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetnumber = streetNumber;
	}

	/**
	 * @return the route
	 */
	public String getRoute() {
		return route;
	}

	/**
	 * @param route the route to set
	 */
	public void setRoute(String route) {
		this.route = route;
	}

	/**
	 * @return the neighborhood
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	/**
	 * @param neighborhood the neighborhood to set
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
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
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalcode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalcode = postalCode;
	}

	/**
	 * @return the postalCodeSuffix
	 */
	public String getPostalCodeSuffix() {
		return postalcodesuffix;
	}

	/**
	 * @param postalCodeSuffix the postalCodeSuffix to set
	 */
	public void setPostalCodeSuffix(String postalCodeSuffix) {
		this.postalcodesuffix = postalCodeSuffix;
	}
}
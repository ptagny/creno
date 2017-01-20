package io.creno.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="meter")
public class Meter implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6088401015545096498L;

	@Id
	@GeneratedValue
	private Integer id;
	private String streetside;
	private Integer streetnumberfrom;
	private Integer streetnumberto;
	private String route;
	private String neighborhood;
	private String locality;
	private String adminarealevel2;
	private String adminarealevel1;
	private String country;
	private String postalcode;
	private String postalcodesuffix;
	private Double hourslimit;
	private Integer increment;
	
	@OneToMany(targetEntity=Session.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Set<Session> sessionlist = new HashSet<>();
	
	@OneToMany(targetEntity=Tarif.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="tarifid")
	private Set<Tarif> tarifslist = new HashSet<>();
	
	protected Meter() {}
	
	/**
	 * 
	 * @return the id
	 */
	public Integer getId(){
		return id;
	}
	
	/**
	 * @return the hoursLimit
	 */
	public Double getHoursLimit() {
		return hourslimit;
	}
	/**
	 * @param hoursLimit the hoursLimit to set
	 */
	public void setHoursLimit(Double hoursLimit) {
		this.hourslimit = hoursLimit;
	}
	/**
	 * @return the streetNumberFrom
	 */
	public Integer getStreetNumberFrom() {
		return streetnumberfrom;
	}

	/**
	 * @param streetNumberFrom the streetNumberFrom to set
	 */
	public void setStreetNumberFrom(Integer streetNumberFrom) {
		this.streetnumberfrom = streetNumberFrom;
	}

	/**
	 * @return the streetNumberTo
	 */
	public Integer getStreetNumberTo() {
		return streetnumberto;
	}

	/**
	 * @param streetNumberTo the streetNumberTo to set
	 */
	public void setStreetNumberTo(Integer streetNumberTo) {
		this.streetnumberto = streetNumberTo;
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

	/**
	 * @return the incrementInMinutes
	 */
	public Integer getIncrement() {
		return increment;
	}

	/**
	 * @param incrementInMinutes the incrementInMinutes to set
	 */
	public void setIncrement(Integer incrementInMinutes) {
		this.increment = incrementInMinutes;
	}

	/**
	 * @return the streetside
	 */
	public String getStreetside() {
		return streetside;
	}

	/**
	 * @param streetside the streetside to set
	 */
	public void setStreetside(String streetside) {
		this.streetside = streetside;
	}

	/**
	 * @return the tarifsAndRestrictions
	 */
	public Set<Tarif> getTarifsList() {
		return tarifslist;
	}

	/**
	 * @param tarifsAndRestrictions the tarifsAndRestrictions to set
	 */
	public void setTarifsList(Set<Tarif> tarifsList) {
		this.tarifslist = tarifsList;
	}

}
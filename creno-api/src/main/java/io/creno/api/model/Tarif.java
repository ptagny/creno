/**
 * 
 */
package io.creno.api.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;


/**
 * @author ptagny
 *
 */
@Entity
@Table(name="tarif")
public class Tarif implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6113433720311161516L;
	@Id
	@GeneratedValue
	private Integer tarifid;
	private Integer dayofweek;
	private Date fromdate;
	private Date todate;
	private Date fromtime;
	private Date totime;
	private Integer limitinhours;
	private Integer permanentflag; //1=Permanent, 0=Not Permanent
	private Double costperminute;
	private String reason;
	
	@ManyToOne
    @JoinColumn(name = "meterid")
	private Meter meter;
	
	protected Tarif(){
		
	}

	/**
	 * @return the tarifId
	 */
	public Integer getTarifId() {
		return tarifid;
	}

	/**
	 * @param tarifId the tarifId to set
	 */
	public void setTarifId(Integer tarifId) {
		this.tarifid = tarifId;
	}

	/**
	 * @return the dayOfWeek
	 */
	public Integer getDayOfWeek() {
		return dayofweek;
	}

	/**
	 * @param dayOfWeek the dayOfWeek to set
	 */
	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayofweek = dayOfWeek;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromdate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromdate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return todate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.todate = toDate;
	}

	/**
	 * @return the fromTime
	 */
	public Date getFromTime() {
		return fromtime;
	}

	/**
	 * @param fromTime the fromTime to set
	 */
	public void setFromTime(Date fromTime) {
		this.fromtime = fromTime;
	}

	/**
	 * @return the toTime
	 */
	public Date getToTime() {
		return totime;
	}

	/**
	 * @param toTime the toTime to set
	 */
	public void setToTime(Date toTime) {
		this.totime = toTime;
	}

	/**
	 * @return the limitInHours
	 */
	public Integer getLimitInHours() {
		return limitinhours;
	}

	/**
	 * @param limitInHours the limitInHours to set
	 */
	public void setLimitInHours(Integer limitInHours) {
		this.limitinhours = limitInHours;
	}

	/**
	 * @return the permanentFlag
	 */
	public Integer getPermanentFlag() {
		return permanentflag;
	}

	/**
	 * @param permanentFlag the permanentFlag to set
	 */
	public void setPermanentFlag(int permanentFlag) {
		this.permanentflag = permanentFlag;
	}

	/**
	 * @return the costPerMinute
	 */
	public Double getCostPerMinute() {
		return costperminute;
	}

	/**
	 * @param costPerMinute the costPerMinute to set
	 */
	public void setCostPerMinute(Double costPerMinute) {
		this.costperminute = costPerMinute;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the meter
	 */
	public Meter getMeter() {
		return meter;
	}

	/**
	 * @param meter the meter to set
	 */
	public void setMeter(Meter meter) {
		this.meter = meter;
	}
	

}

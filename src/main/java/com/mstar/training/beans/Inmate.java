package com.mstar.training.beans;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *	Your score: (YES is 1 point)
 *
 *	Has Jail: YES
 *	Correct Relationship w/ Jail: YES
 *	Has Type: YES (as Category)
 *	Type is Enum: YES
 *	Has Name: NO
 *	Has Control Number: YES
 *	Control Number is Unique: YES
 *	Has Commitment Date: YES (as DateArrived)
 *	Commitment Date is Timestamp: YES
 *
 *	Remarks:
 *	1. The name of an inmate was not explicitly specified but its something that's intrinsic in all human beings
 *
 *	Final Score: 8 of 9
 */

@Entity
@Table(name = "INMATE")
public class Inmate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INMATE_ID")
	private Long inmateID;
	
	@Enumerated(STRING)
	@Column(name = "INMATE_CATEGORY")
	private InmateCategory category;
	
	@Column(name = "INMATE_CONTROL_NUMBER", unique=true)
	private Integer controlNumber;
	
	@Temporal(TIMESTAMP)
	@Column(name = "DATE_ARRIVED", nullable=false)
	private Date dateArrived;
	
	@Temporal(TIMESTAMP)
	@Column(name = "DATE_RELEASE")
	private Date dateRelease;
	
	@Column(name="BUDGETED_MEAL")
	private Double meal;
	
	@ManyToOne
	@JoinColumn(name="JAIL_ID")
	private Jail jail;
	

	public Long getInmateId() {
		return inmateID;
	}

	public void setInmateId(Long inmateID) {
		this.inmateID = inmateID;
	}

	public InmateCategory getCategory() {
		return category;
	}

	public void setCategory(InmateCategory category) {
		this.category = category;
	}

	public Integer getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(Integer controlNumber) {
		this.controlNumber = controlNumber;
	}

	public Date getDateArrived() {
		return dateArrived;
	}

	public void setDateArrived(Date dateArrived) {
		this.dateArrived = dateArrived;
	}

	public Double getMeal() {
		return meal;
	}

	public void setMeal(Double meal) {
		this.meal = meal;
	}
	
}

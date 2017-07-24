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

@Entity
@Table(name = "INMATE")
public class Inmate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INMATE_ID")
	private Long inmateId;
	
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
		return inmateId;
	}

	public void setInmateId(Long inmateId) {
		this.inmateId = inmateId;
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

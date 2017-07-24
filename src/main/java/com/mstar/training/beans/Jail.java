package com.mstar.training.beans;

import static javax.persistence.GenerationType.AUTO;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JAIL")
public class Jail {

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "JAIL_ID")
	private Long jailID;
	
	@Column(name = "JAIL_NAME")
	private String name;
	
	@Column(name = "JAIL_LOCATION")
	private String location;
	
	@Column(name = "JAIL_REGION")
	private String region;
	
	@Column(name = "JAIL_CAPACITY")
	private Integer capacity;
	
	@OneToMany(mappedBy="jail")
	private List<JailOfficer> officers;
		
	@OneToMany(mappedBy="jail")
	private List<Inmate> inmates;

	public Long getJailId() {
		return jailID;
	}

	public void setJailId(Long jailID) {
		this.jailID = jailID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
}

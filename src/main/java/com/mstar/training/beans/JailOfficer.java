package com.mstar.training.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JAIL_OFFICER")
public class JailOfficer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OFFICER_ID")
	private Long officerID;
	
	@Column(name = "OFFICER_NAME")
	private String officerName;
	
	@Column(name = "OFFICER_RANK")
	private String officerRank;

	@OneToOne
	@JoinColumn(name = "INMATE_ID")
	private Inmate trustee;
	
	@ManyToOne
	@JoinColumn(name="JAIL_ID")
	private Jail jail;
	
	public Long getOfficerId() {
		return officerID;
	}

	public void setOfficerId(Long officerID) {
		this.officerID = officerID;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerRank() {
		return officerRank;
	}

	public void setOfficerRank(String officerRank) {
		this.officerRank = officerRank;
	}

	public Inmate getTrustee() {
		return trustee;
	}

	public void setTrustee(Inmate trustee) {
		this.trustee = trustee;
	}
	
}

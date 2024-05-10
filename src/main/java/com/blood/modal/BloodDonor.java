package com.blood.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BloodDonor")
public class BloodDonor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dnrId;
	@Column(name="Name")
	private String dnrName;
	@Column(name="Age")
	private String dnrAge;
	@Column(name="Weight")
	private String dnrWeight;
	@Column(name="Mobile")
	private String dnrMob;
	@Column(name="Location")
	private String dnrLocation;
	
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BloodDonor(int dnrId, String dnrName, String dnrAge, String dnrWeight, String dnrMob, String dnrLocation) {
		super();
		this.dnrId = dnrId;
		this.dnrName = dnrName;
		this.dnrAge = dnrAge;
		this.dnrWeight = dnrWeight;
		this.dnrMob = dnrMob;
		this.dnrLocation = dnrLocation;
	}

	public int getDnrId() {
		return dnrId;
	}

	public void setDnrId(int dnrId) {
		this.dnrId = dnrId;
	}

	public String getDnrName() {
		return dnrName;
	}

	public void setDnrName(String dnrName) {
		this.dnrName = dnrName;
	}

	public String getDnrAge() {
		return dnrAge;
	}

	public void setDnrAge(String dnrAge) {
		this.dnrAge = dnrAge;
	}

	public String getDnrWeight() {
		return dnrWeight;
	}

	public void setDnrWeight(String dnrWeight) {
		this.dnrWeight = dnrWeight;
	}

	public String getDnrMob() {
		return dnrMob;
	}

	public void setDnrMob(String dnrMob) {
		this.dnrMob = dnrMob;
	}

	public String getDnrLocation() {
		return dnrLocation;
	}

	public void setDnrLocation(String dnrLocation) {
		this.dnrLocation = dnrLocation;
	}
	
	
	

}

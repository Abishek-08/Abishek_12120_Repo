package com.blood.modal;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="BloodStock")
public class BloodStock {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int blId;
	@Column(name="BloodGroup")
	private String blGroup;
	@Column(name="BloodCount")
	private String blCount;
	@Column(name="RBC")
	private String blRBC;
	@Column(name="WBC")
	private String blWBC;
	
	@OneToOne(targetEntity = BloodDonor.class,cascade = CascadeType.DETACH)
	@JoinColumn(name="dnrId")
	private BloodDonor donor;

	public BloodStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BloodStock(int blId, String blGroup, String blCount, String blRBC, String blWBC, BloodDonor donor) {
		super();
		this.blId = blId;
		this.blGroup = blGroup;
		this.blCount = blCount;
		this.blRBC = blRBC;
		this.blWBC = blWBC;
		this.donor = donor;
	}

	public int getBlId() {
		return blId;
	}

	public void setBlId(int blId) {
		this.blId = blId;
	}

	public String getBlGroup() {
		return blGroup;
	}

	public void setBlGroup(String blGroup) {
		this.blGroup = blGroup;
	}

	public String getBlCount() {
		return blCount;
	}

	public void setBlCount(String blCount) {
		this.blCount = blCount;
	}

	public String getBlRBC() {
		return blRBC;
	}

	public void setBlRBC(String blRBC) {
		this.blRBC = blRBC;
	}

	public String getBlWBC() {
		return blWBC;
	}

	public void setBlWBC(String blWBC) {
		this.blWBC = blWBC;
	}

	public BloodDonor getDonor() {
		return donor;
	}

	public void setDonor(BloodDonor donor) {
		this.donor = donor;
	}
	
	
	

}

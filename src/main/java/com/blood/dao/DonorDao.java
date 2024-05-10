package com.blood.dao;

import java.util.List;

import com.blood.modal.BloodDonor;

public interface DonorDao {
	
	public String addDonor(BloodDonor bloodDonor);
	public BloodDonor findDonorById(int id);
	public String updateDonor(BloodDonor bloodDonor);
	public String deleteDonor(int id);
	public List<BloodDonor> listAllDonor();

}

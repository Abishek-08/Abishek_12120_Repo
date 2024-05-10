package com.blood.service;

import java.util.List;

import com.blood.modal.BloodDonor;

public interface DonorService {
	
	public void insertDonor(BloodDonor donor);
	public void updateDonor(BloodDonor donor);
	public void deleteDonor(int id);
	public BloodDonor findDonorById(int id);
	public List<BloodDonor> findAllDonor();

}

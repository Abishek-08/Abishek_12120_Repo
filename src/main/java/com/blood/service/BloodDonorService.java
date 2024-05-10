package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blood.dao.DonorDao;
import com.blood.modal.BloodDonor;

@Service
@Transactional
public  class BloodDonorService implements DonorService {
	
       @Autowired
        DonorDao dao;
        
        
        
		@Override
		public void insertDonor(BloodDonor donor) {
		   this.dao.addDonor(donor);
		
		}
		
		@Override
		public void updateDonor(BloodDonor donor) {
			dao.updateDonor(donor);
			
		}
		
		@Override
		public void deleteDonor(int id) {
			dao.deleteDonor(id);
			
		}
		
		@Override
		public BloodDonor findDonorById(int id) {
			return dao.findDonorById(id);
		}
		
		@Override
		public List<BloodDonor> findAllDonor() {
		
		   return this.dao.listAllDonor();
		}
        
	
}

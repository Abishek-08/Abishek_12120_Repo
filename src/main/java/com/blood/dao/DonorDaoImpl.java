package com.blood.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.blood.modal.BloodDonor;

import jakarta.persistence.EntityManager;


@Repository
public class DonorDaoImpl implements DonorDao {
	
	@Autowired
	private EntityManager ent;
	
	@Override
	public String addDonor(BloodDonor bloodDonor) {
		String msg="";
		try {
		ent.persist(bloodDonor);
		return msg="Inserted Success";
		}catch(Exception e) {
			return msg="Inserted failure";
		}
		
	}
	
	@Override
	public String updateDonor(BloodDonor bloodDonor) {
		String msg="";
		try {
			ent.persist(bloodDonor);
			return msg="updation successfull";
		}catch(Exception e) {
			return msg="updation failure";
		}
	}
	
	@Override
	public String deleteDonor(int id) {
		String msg="";
		BloodDonor dr = ent.find(BloodDonor.class, id);
		try {
			ent.remove(dr);
			return msg="deletion success";
		}catch(Exception e) {
			return msg="deletion failure";
		}
		
	}
	
	@Override
	public BloodDonor findDonorById(int dnrId) {
		Query<BloodDonor> qr = (Query<BloodDonor>) ent.createQuery("from BloodDonor where dnrId=:id");
		qr.setParameter("id", dnrId);
		return qr.getSingleResult();
	}
	
	@Override
	public List<BloodDonor> listAllDonor() {
		
		List<BloodDonor> donorList =  ent.createQuery("from BloodDonor").getResultList();
		return donorList;
	}
	
	
	

}

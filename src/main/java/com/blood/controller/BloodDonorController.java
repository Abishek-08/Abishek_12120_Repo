package com.blood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.modal.BloodDonor;
import com.blood.service.BloodDonorService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/donor")
public  class BloodDonorController {

	@Autowired
	BloodDonorService serv;

	@PostMapping("/insertDonor")
	public ResponseEntity<String> doInsertDonor(@RequestBody BloodDonor donor) {
		try {
			serv.insertDonor(donor);
			return ResponseEntity.ok("Inserted Success");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Insertion Failure");
		}
	}
	
	@PutMapping("/updateDonor")
	public ResponseEntity<String> doUpdateDonor(@RequestBody BloodDonor donor){
		try {
			serv.updateDonor(donor);
			return ResponseEntity.ok("Updation Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Updation Failure");
		}
	}
	
	@DeleteMapping("/deleteDonor/{dnrId}")
	public ResponseEntity<String> doDeleteBlood(@PathVariable("dnrId")int dnrId){
		try {
			serv.deleteDonor(dnrId);
			return ResponseEntity.ok("Deletion Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Deletion Failure");
		}
	}
	
	@GetMapping("/findByIdDonor/{dnrId}")
	public BloodDonor doFindByDonor(@PathVariable("dnrId")int dnrId) {
		return serv.findDonorById(dnrId);
	}

	@GetMapping("/findAllDonor")
	public List<BloodDonor> doFindAllBlood() {
		return serv.findAllDonor();
	}

}

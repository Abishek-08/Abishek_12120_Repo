package com.blood.controller;

import java.util.List;

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

import com.blood.modal.BloodStock;
import com.blood.service.StockServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/stock")
public class BloodStockController {
	
	@Autowired
	StockServiceImpl serv;
	
	@PostMapping("/insertBlood")
	public ResponseEntity<String> doInsertBlood(@RequestBody BloodStock blood){
		try {
			serv.addStock(blood);
			return ResponseEntity.ok("Inserted Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Insertion Failure");
		}
	}
	
	@PutMapping("/updateBlood")
	public ResponseEntity<String> doUpdateBlood(@RequestBody BloodStock blood){
		try {
			serv.updateStock(blood);
			return ResponseEntity.ok("Updation Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Updation Failure");
		}
	}
	
	@DeleteMapping("/deleteBlood/{blId}")
	public ResponseEntity<String> doDeleteBlood(@PathVariable("blId")int blId){
		try {
			serv.deleteStock(blId);
			return ResponseEntity.ok("Deletion Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Deletion Failure");
		}
	}
	
	@GetMapping("/findByBlood/{blGroup}")
	public List<BloodStock> doFindByBlood(@PathVariable("blGroup")String blGroup){
		return serv.findByStockName(blGroup);
	}
	
	@GetMapping("/findAllBlood")
	public List<BloodStock> doFindAllBlood(){
		return serv.findAllStock();
	}
	

}

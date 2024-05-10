package com.blood.service;

import java.util.List;

import com.blood.modal.BloodStock;

public interface StockService {
	
	public void addStock(BloodStock stock);
	public void updateStock(BloodStock stock);
	public void deleteStock(int id);
	public List<BloodStock> findByStockName(String blGrp);
	public List<BloodStock> findAllStock();

}

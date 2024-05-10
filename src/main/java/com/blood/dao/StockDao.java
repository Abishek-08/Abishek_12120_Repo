package com.blood.dao;

import java.util.List;

import com.blood.modal.BloodStock;

public interface StockDao {
	
	public String addStock(BloodStock stock);
	public List<BloodStock> findByStockName(String blGrp);
	public String updateStock(BloodStock stock);
	public String deleteStock(int id);
	public List<BloodStock> listAllStock();

}

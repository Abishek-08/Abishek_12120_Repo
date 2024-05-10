package com.blood.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.blood.modal.BloodStock;
import jakarta.persistence.EntityManager;

@Repository
public class StockDaoImpl implements StockDao {

	@Autowired
	private EntityManager ent;

	@Override
	public String addStock(BloodStock stock) {
		String msg;

		try {
			ent.persist(stock);
			return msg = "Insertion failure";
		} catch (Exception e) {
			return msg = "Insertion failure";
		}

	}

	@Override
	public String updateStock(BloodStock stock) {
		String msg = "";
		try {
			ent.persist(stock);
			return msg = "updation success";
		} catch (Exception e) {
			return msg = "";
		}
	}

	@Override
	public String deleteStock(int id) {
		String msg = "";
		BloodStock stk = ent.find(BloodStock.class, id);
		try {
			ent.remove(stk);
			return msg = "deletion success";
		} catch (Exception e) {
			return msg = "deletion failure";
		}
	}

	@Override
	public List<BloodStock> findByStockName(String blGrp) {
		Query<BloodStock> qr = (Query<BloodStock>) ent.createQuery("from BloodStock where blGroup=:name");
		qr.setParameter("name", blGrp);
		return qr.getResultList();
	}

	@Override
	public List<BloodStock> listAllStock() {

		List<BloodStock> stockList = ent.createQuery("from BloodStock").getResultList();
		return stockList;
	}

}

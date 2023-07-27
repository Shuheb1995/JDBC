package com.xworkz.vehicle.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.xworks.vehicle.dto.VehicleDto;

public class VehicleRepoImpl implements VehicleRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicleConnection");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(VehicleDto dto) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		
		em.persist(dto);
		
		transact.commit();
				
		return true;
	}

	@Override
	public VehicleDto findByName(String name) {
		Query query = em.createNamedQuery("findByName");
		Query query1 = query.setParameter("nm", name);
		return (VehicleDto) query1.getSingleResult();
		 
	}

	@Override
	public VehicleDto findByConsumeAndPower(String consume, String power) {
	   
		Query query = em.createNamedQuery("findByConsumeAndPower");
		query.setParameter("cnm", consume);
		query.setParameter("pwr", power);
		return (VehicleDto) query.getSingleResult();
		
		
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		
		
		EntityTransaction tarnsact = em.getTransaction();
		tarnsact.begin();
		
		Query query = em.createNamedQuery("updateTypeByName");
		query.setParameter("tp", type);
		query.setParameter("nms", name);
		query.executeUpdate();
		
		tarnsact.commit();
		
		return true;
	}

	@Override
	public boolean updateLaunchAndPowerByid(String launchedIn, String power, int id) {
		
		EntityTransaction tarnsact = em.getTransaction();
		tarnsact.begin();
		
		Query query = em.createNamedQuery("updateLaunchAndPowerByid");
		query.setParameter("li", launchedIn);
		query.setParameter("pr", power);
		query.setParameter("i", id);
		query.executeUpdate();
		tarnsact.commit();
		
		return true;
	}

	@Override
	public boolean deleteByLauncheIn(String launchedIn) {
		
		EntityTransaction tarnsact = em.getTransaction();
		tarnsact.begin();
		Query query = em.createNamedQuery("deleteByLauncheIn");
		query.setParameter("lnin", launchedIn);
		query.executeUpdate();
		tarnsact.commit();
		return true;
	}

}

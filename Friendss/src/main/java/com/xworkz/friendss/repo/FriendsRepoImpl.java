package com.xworkz.friendss.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.friendss.dto.FriendsDto;

public class FriendsRepoImpl implements FriendsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("friendssConnection");

	EntityManager manager = emf.createEntityManager();

	@Override
	public boolean save(FriendsDto dto) {

		EntityTransaction transact = manager.getTransaction();
		transact.begin();
		manager.persist(dto);
		transact.commit();

		return true;
	}

	@Override
	public FriendsDto findByName(String name) {

		Query query = manager.createNamedQuery("findByName");
		Query query1 = query.setParameter("nm", name);
		FriendsDto dto = (FriendsDto) query1.getSingleResult();
		
		return dto;

	}

	@Override
	public boolean updateMobNumberByName(long mobNumber, String name) {

		EntityTransaction transact = manager.getTransaction();

		transact.begin();

		Query query = manager.createNamedQuery("updateMobNumberByName");
		query.setParameter("mn", mobNumber);
		query.setParameter("fnm", name);
		query.executeUpdate();
		

		transact.commit();

		return true;
	}

	@Override
	public boolean deleteByProfession(String profession) {

		EntityTransaction transact = manager.getTransaction();

		transact.begin();

	    Query query = manager.createNamedQuery("deleteByProfession");
	    query.setParameter("pf", profession);
	    query.executeUpdate();
		

		transact.commit();

		return true;
	}

	@Override
	public List<FriendsDto> readAll() {
		
		Query query = manager.createNamedQuery("readAll");
		return query.getResultList();
	}

}

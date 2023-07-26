package com.xworkz.village.repo;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



import com.xworkz.village.dto.VillageDto;

public class VillageRepoImpl implements VillageRepo{
	
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("villageConnection");
    
    EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(VillageDto dto) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		
		em.persist(dto);
		
		transact.commit();
		
		return true;
	}

	@Override
	public List<VillageDto> readAll() {
		
		TypedQuery<VillageDto> query = em.createQuery("from VillageDto", VillageDto.class);
		
		List<VillageDto> list = query.getResultList();
		
		return list;
	}

	@Override
	public VillageDto findById(int id) {
		
		TypedQuery<VillageDto> query = em.createQuery("from VillageDto" , VillageDto.class);
		
		VillageDto dto = em.find(VillageDto.class, id);
		
		return dto;
	}

	@Override
	public VillageDto findByName(String villageName) {
		
		String query = "from VillageDto where villageName = "+ villageName;
		
		TypedQuery<VillageDto> find = em.createQuery(query, VillageDto.class);
		
		VillageDto dto = find.getSingleResult();
		
		return dto;
	}

	@Override
	public boolean updateById(String headOfVillage , int id) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		
		VillageDto find = findById(id);
		find.setHeadOfVillage(headOfVillage);
		
		em.merge(find);
		
		transact.commit();
		
		return true;
	}

	@Override
	public boolean updateNameById(String villageName, int id) {
		
		EntityTransaction transact = em.getTransaction();
		transact.begin();
		
		VillageDto find = findById(id);
		find.setHeadOfVillage(villageName);
		
		em.merge(find);
		
		transact.commit();
		
		
		return true;
	}

	@Override
	public boolean deleteById(int id) {

		EntityTransaction transact = em.getTransaction();
		transact.begin();
		
		VillageDto find = findById(id);
		em.remove(find);
		
		transact.commit();
		
		return true;
	}

}

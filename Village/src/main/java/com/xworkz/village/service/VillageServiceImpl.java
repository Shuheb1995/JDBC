package com.xworkz.village.service;

import java.util.List;

import com.xworkz.village.dto.VillageDto;
import com.xworkz.village.repo.VillageRepo;
import com.xworkz.village.repo.VillageRepoImpl;

public class VillageServiceImpl implements VillageService {
	
	VillageRepo repo = new VillageRepoImpl();

	@Override
	public boolean save(VillageDto dto) {
		
		if(dto!=null) {
			if(dto.getVillageName()!=null) {
				return repo.save(dto);
			}
		}
		return false;
	}

	@Override
	public List<VillageDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public VillageDto findById(int id) {
		if(id>0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public VillageDto findByName(String villageName) {
		if(villageName!=null) {
			return repo.findByName(villageName);
		}
		return null;
	}

	@Override
	public boolean updateById(String headOfVillage,int id) {
		if(headOfVillage!=null) {
			if(id>0) {
				return repo.updateById(headOfVillage, id);
			}
		}
		return false;
	}

	@Override
	public boolean updateNameById(String villageName, int id) {
		
		if(villageName!=null) {
			if(id>0) {
				return repo.updateNameById(villageName, id);
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			return repo.deleteById(id);
		}
		return false;
	}

}

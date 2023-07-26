package com.xworkz.village.repo;

import java.util.List;

import com.xworkz.village.dto.VillageDto;

public interface VillageRepo {

	public boolean save(VillageDto dto);

	public List<VillageDto> readAll();

	public VillageDto findById(int id);

	public VillageDto findByName(String villageName);

	public boolean updateById(String headOfVillage,int id);

	public boolean updateNameById(String villageName, int id);

	public boolean deleteById(int id);

}

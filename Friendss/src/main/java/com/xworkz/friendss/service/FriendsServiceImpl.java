package com.xworkz.friendss.service;

import java.util.List;

import com.xworkz.friendss.dto.FriendsDto;
import com.xworkz.friendss.repo.FriendsRepo;
import com.xworkz.friendss.repo.FriendsRepoImpl;

public class FriendsServiceImpl implements FriendsService {

	FriendsRepo repo = new FriendsRepoImpl();
	
	@Override
	public boolean save(FriendsDto dto) {
		if(dto!=null) {
			if(dto.getFrndName()!=null && dto.getMobNumber()>=10) {
				System.out.println("Dto is Validated");
				return repo.save(dto);
			}
		}
		return false;
	}

	@Override
	public FriendsDto findByName(String name) {
		
		if(name!=null) {
			System.out.println("name is validated");
			return repo.findByName(name);
		}
		
		return null;
	}

	@Override
	public boolean updateMobNumberByName(long mobNumber, String name) {
		
		if(name!=null) {
			if(mobNumber>=10) {
				System.out.println("dto is validated for update");
				return repo.updateMobNumberByName(mobNumber, name);
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteByProfession(String profession) {
		if(profession!=null) {
			System.out.println("dto validated for deletion");
			return repo.deleteByProfession(profession);
		}
		return false;
	}

	@Override
	public List<FriendsDto> readAll() {
		
		return repo.readAll();
	}

}

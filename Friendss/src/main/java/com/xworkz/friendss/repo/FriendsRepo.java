package com.xworkz.friendss.repo;

import java.util.List;

import com.xworkz.friendss.dto.FriendsDto;

public interface FriendsRepo {
	
	public boolean save(FriendsDto dto);
	
	public FriendsDto findByName(String name);
	
	public boolean updateMobNumberByName(long mobNumber,String name);
	
	public boolean deleteByProfession(String profession);
	
	public List<FriendsDto> readAll();

}

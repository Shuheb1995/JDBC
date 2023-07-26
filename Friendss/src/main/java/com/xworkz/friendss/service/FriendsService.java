package com.xworkz.friendss.service;

import java.util.List;

import com.xworkz.friendss.dto.FriendsDto;

public interface FriendsService {
	
	public boolean save(FriendsDto dto);
	
	public FriendsDto findByName(String name);
	
	public boolean updateMobNumberByName(long mobNumber,String name);
	
	public boolean deleteByProfession(String profession);
	
	public List<FriendsDto> readAll();

}

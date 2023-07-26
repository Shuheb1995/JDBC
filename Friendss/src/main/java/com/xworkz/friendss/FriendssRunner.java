package com.xworkz.friendss;

import java.util.List;

import com.xworkz.friendss.dto.FriendsDto;
import com.xworkz.friendss.service.FriendsService;
import com.xworkz.friendss.service.FriendsServiceImpl;

public class FriendssRunner {

	public static void main(String[] args) {
		
		FriendsService service = new FriendsServiceImpl();
		
//		FriendsDto dto = new FriendsDto(1,"Zayed",27,"Buisiness Man",8974563258L,"Muslim");
//		FriendsDto dto1= new FriendsDto(2,"Hida",28,"Swiggy Manager",6985478965L,"Muslim");
//		FriendsDto dto2 = new FriendsDto(3,"Saad",24,"Software Testing",698763258L,"Muslim");
//		FriendsDto dto3 = new FriendsDto(4,"Mukabbir",24,"Cashier",9874563258L,"Muslim");
//		FriendsDto dto4 = new FriendsDto(5,"Faizan",27,"Pharmaceutical",8569874563L,"Muslim");
		FriendsDto dto5 = new FriendsDto(6,"Bilal",22,"Student",7896541236L,"Muslim");
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		
//		FriendsDto find = service.findByName("Mukabbir");
//		System.out.println(find);
		
//		service.updateMobNumberByName(7338050050L, "Mukabbir");
		
		service.deleteByProfession("Student");
		
//		List<FriendsDto> list = service.readAll();
//		
//		for (FriendsDto dtos : list) {
//			System.out.println(dtos);
//		}
		
		
		
	}

}

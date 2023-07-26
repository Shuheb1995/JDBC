package com.xworkz.village;

import java.util.List;

import com.xworkz.village.dto.VillageDto;
import com.xworkz.village.service.VillageService;
import com.xworkz.village.service.VillageServiceImpl;

public class VillageRunner {

	public static void main(String[] args) {
		
		VillageService service = new VillageServiceImpl();
		
		VillageDto dto = new VillageDto(1,"KoodRaste","Kowshik","Cardemom","Sakleshpur","Hassan");
		VillageDto dto1 = new VillageDto(2,"Goddu","Shanmuka","Pepper","Sakleshpur","Hassan");
		VillageDto dto2 = new VillageDto(3,"Madsagara","Parveez","Coffee","Holenarsipura","Madikeri");
		VillageDto dto3 = new VillageDto(4,"Ossoor","Rayan","Coffee","Sakleshpur","Hassan");
		VillageDto dto4 = new VillageDto(5,"Sea Samundar","Zayed","Fish","Maddur","Mandya");
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
//		VillageDto find = service.findById(3);
//		System.out.println(find);
		
//		VillageDto findByName = service.findByName("'Ossoor'");
//		System.out.println(findByName);
		
//		service.updateById("Taaha", 3);
		
//		service.updateById("Shaniwar Santhe", 3);
		
		service.deleteById(1);
		
//		List<VillageDto> read = service.readAll();
//		
//		for(VillageDto returnDto : read) {
//			System.out.println(returnDto);
//		}

	}

}

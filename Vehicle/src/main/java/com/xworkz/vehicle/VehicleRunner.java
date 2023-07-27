package com.xworkz.vehicle;

import com.xworks.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		
		VehicleService srevice = new VehicleServiceImpl();
		
		VehicleDto dto = new VehicleDto(1,"Fartuner","SUV","10kmpl","3000cc","2018");
		VehicleDto dto1= new VehicleDto(2,"i20","Hatchback","20kmpl","1200cc","2005");
		VehicleDto dto2 = new VehicleDto(3,"Thar","Jeep","14kmpl","2400cc","2018");
		VehicleDto dto3 = new VehicleDto(4,"Innova Crysta","SUV","13kmpl","2700cc","2016");
		VehicleDto dto4 = new VehicleDto(5,"Honda Civic","Sidan","15kmpl","1700cc","2000");
		VehicleDto dto5 = new VehicleDto(6,"Swift","Hatchback","25kmpl","1200cc","2004");

//		srevice.save(dto);
//		srevice.save(dto1);
//		srevice.save(dto2);
//		srevice.save(dto3);
//		srevice.save(dto4);
//		srevice.save(dto5);
		
//		VehicleDto find = srevice.findByName("i20");
//		System.out.println(find);
		
//		VehicleDto find1 = srevice.findByConsumeAndPower("13kmpl", "2700cc");
//		System.out.println(find1);
		
//		srevice.updateTypeByName("Suv", "Thar");
		
//		srevice.updateLaunchAndPowerByid("2001", "1750cc", 5);
		
		srevice.deleteByLauncheIn("2004");
		
	}

}

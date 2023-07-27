package com.xworkz.vehicle.service;

import com.xworks.vehicle.dto.VehicleDto;

public interface VehicleService {
	
	boolean save(VehicleDto dto);
	
	VehicleDto findByName(String name);
	
	VehicleDto findByConsumeAndPower(String consume,String power);
	
	boolean updateTypeByName(String type, String name);
	
	boolean updateLaunchAndPowerByid(String launchedIn, String power,int id);
	
	boolean deleteByLauncheIn(String launchedIn);
	

}

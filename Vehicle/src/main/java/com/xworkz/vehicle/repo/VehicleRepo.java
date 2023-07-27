package com.xworkz.vehicle.repo;

import com.xworks.vehicle.dto.VehicleDto;

public interface VehicleRepo {

	boolean save(VehicleDto dto);

	VehicleDto findByName(String name);

	VehicleDto findByConsumeAndPower(String consume, String power);

	boolean updateTypeByName(String type, String name);

	boolean updateLaunchAndPowerByid(String launchedIn, String power, int id);

	boolean deleteByLauncheIn(String launchedIn);

}

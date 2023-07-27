package com.xworkz.vehicle.service;

import com.xworks.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repo.VehicleRepo;
import com.xworkz.vehicle.repo.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {
	
	VehicleRepo repo = new VehicleRepoImpl();

	@Override
	public boolean save(VehicleDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null) {
				if(dto.getType()!=null) {
					System.out.println("Dto is Validated");
					return repo.save(dto);
				}
				return false;
			}
			return false;
		}
		return false;
	}

	@Override
	public VehicleDto findByName(String name) {
		if(name!=null) {
			System.out.println("name is valid for finding");
			return repo.findByName(name);
		}
		return null;
	}

	@Override
	public VehicleDto findByConsumeAndPower(String consume, String power) {
		if(consume!=null) {
			if(power!=null) {
				System.out.println("dto is valid for finding");
				return repo.findByConsumeAndPower(consume, power);
			}
		}
		return null;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		if(type!=null) {
			if(name!=null) {
				System.out.println("dto is valid for update");
				return repo.updateTypeByName(type, name);
			}
		}
		return false;
	}

	@Override
	public boolean updateLaunchAndPowerByid(String launchedIn, String power, int id) {

		if(launchedIn!=null) {
			if(power!=null) {
				if(id>0) {
					System.out.println("dto is valid for updation");
					return repo.updateLaunchAndPowerByid(launchedIn, power, id);
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteByLauncheIn(String launchedIn) {
		if(launchedIn!=null) {
			System.out.println("valid for delete");
			return repo.deleteByLauncheIn(launchedIn);
		}
		return false;
	}

}

package com.xworks.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "vehicle_details")
@Entity
@NamedQuery(name = "findByName" , query = "select dto from VehicleDto dto where dto.name=:nm")
@NamedQuery(name = "findByConsumeAndPower" , query = "select dto from VehicleDto dto where dto.consumes=:cnm and dto.power=:pwr")
@NamedQuery(name = "updateTypeByName" , query = "update VehicleDto dto set dto.type=:tp where name=:nms")
@NamedQuery(name = "updateLaunchAndPowerByid" , query = "update VehicleDto dto set dto.launchedIn =: li, dto.power =: pr where dto.id =: i")
@NamedQuery(name = "deleteByLauncheIn" , query = "delete VehicleDto dto where dto.launchedIn =: lnin")
public class VehicleDto {
	
	@Id
	private int id;
	private String name;
	private String type;
	private String consumes;
	private String power;
	private String launchedIn;
	
	public VehicleDto() {
		super();
	}
	
	public VehicleDto(int id, String name, String type, String consumes, String power, String launchedIn) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.consumes = consumes;
		this.power = power;
		this.launchedIn = launchedIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConsumes() {
		return consumes;
	}

	public void setConsumes(String consumes) {
		this.consumes = consumes;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getLaunchedIn() {
		return launchedIn;
	}

	public void setLaunchedIn(String launchedIn) {
		this.launchedIn = launchedIn;
	}

	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", name=" + name + ", type=" + type + ", consumes=" + consumes + ", power="
				+ power + ", launchedIn=" + launchedIn + "]";
	}
	
	
	
	

}

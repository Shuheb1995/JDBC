package com.xworkz.village.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Village_table")
@Entity

public class VillageDto {
	
	@Id
	private int id;
	private String villageName;
	private String headOfVillage;
	private String famousFor;
	private String talluk;
	private String district;
	
	public VillageDto() {
		super();
	}
	
	public VillageDto(int id, String villageName, String headOfVillage, String famousFor, String talluk,
			String district) {
		super();
		this.id = id;
		this.villageName = villageName;
		this.headOfVillage = headOfVillage;
		this.famousFor = famousFor;
		this.talluk = talluk;
		this.district = district;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getHeadOfVillage() {
		return headOfVillage;
	}

	public void setHeadOfVillage(String headOfVillage) {
		this.headOfVillage = headOfVillage;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getTalluk() {
		return talluk;
	}

	public void setTalluk(String talluk) {
		this.talluk = talluk;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "VillageDto [id=" + id + ", villageName=" + villageName + ", headOfVillage=" + headOfVillage
				+ ", famousFor=" + famousFor + ", talluk=" + talluk + ", district=" + district + "]";
	}
	
	
	
	
	
	

}

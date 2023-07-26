package com.xworkz.friendss.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "Friends_table")
@Entity
@NamedQuery(name = "readAll" , query = "select dto from FriendsDto dto")
@NamedQuery(name = "findByName" , query = "select dto from FriendsDto dto where dto.frndName=:nm")
@NamedQuery(name = "updateMobNumberByName" , query = "update FriendsDto dto set dto.mobNumber =: mn where dto.frndName =: fnm")
@NamedQuery(name = "deleteByProfession" , query = "delete from FriendsDto dto where dto.profession =: pf")
public class FriendsDto {
	
	@Id
	private int id;
	private String frndName;
	private int age;
	private String profession;
	private long mobNumber;
	private String relegion;
	
	public FriendsDto() {
		super();
	}
	
	public FriendsDto(int id, String frndName, int age, String profession, long mobNumber, String relegion) {
		super();
		this.id = id;
		this.frndName = frndName;
		this.age = age;
		this.profession = profession;
		this.mobNumber = mobNumber;
		this.relegion = relegion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrndName() {
		return frndName;
	}

	public void setFrndName(String frndName) {
		this.frndName = frndName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getRelegion() {
		return relegion;
	}

	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

	@Override
	public String toString() {
		return "FriendssDto [id=" + id + ", frndName=" + frndName + ", age=" + age + ", profession=" + profession
				+ ", mobNumber=" + mobNumber + ", relegion=" + relegion + "]";
	}

	
	
	
	

}

package com.test.userservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Dept {

	private int id;

	private String dept;

	private String headOfdept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getHeadOfdept() {
		return headOfdept;
	}

	public void setHeadOfdept(String headOfdept) {
		this.headOfdept = headOfdept;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", dept=" + dept + ", headOfdept=" + headOfdept + "]";
	}

}

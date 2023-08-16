package com.hibernateMethods;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table
public class CarInformation {
	
	@Id
	@Column
	int entry_no;
	@Column
	String name;
	@Column
	String model;
	@Column
	boolean suerpcar;
	
	public CarInformation() {
		super();
		
	}

	public CarInformation(int entry_no, String name, String model, boolean suerpcar) {
		super();
		this.entry_no = entry_no;
		this.name = name;
		this.model = model;
		this.suerpcar = suerpcar;
	}

	public int getEntry_no() {
		return entry_no;
	}

	public void setEntry_no(int entry_no) {
		this.entry_no = entry_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isSuerpcar() {
		return suerpcar;
	}

	public void setSuerpcar(boolean suerpcar) {
		this.suerpcar = suerpcar;
	}

	@Override
	public String toString() {
		return "CarInformation [entry_no=" + entry_no + ", name=" + name + ", model=" + model + ", suerpcar=" + suerpcar
				+ "]";
	}
	
	

}

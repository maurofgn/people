package org.mf.util.people;

import java.util.Arrays;

import org.mf.util.Utility;

public class Address {

	String typeList[] = {"via", "b.go", "c.so", "piazza", "viale", "largo", "vicolo", "c.da"}; 
	
	private String name;
	private String civico;
	private String type;
	
	public Address(String name) {
		this.name = name;
		this.civico = "" + Utility.randInt(1, 150);
		this.type = typeList[Utility.randInt(0, typeList.length-1)];
	}

	public String getName() {
		return name;
	}

	public String getCivico() {
		return civico;
	}

	public String getType() {
		return type;
	}
	
	public String getAddress() {
		return type + " " + name + ", " + civico;
	}

	@Override
	public String toString() {
		return getAddress();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((civico == null) ? 0 : civico.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + Arrays.hashCode(typeList);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (civico == null) {
			if (other.civico != null)
				return false;
		} else if (!civico.equals(other.civico))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (!Arrays.equals(typeList, other.typeList))
			return false;
		return true;
	}
	
	
}

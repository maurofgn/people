package org.mf.util.people;

import java.util.ArrayList;
import java.util.List;

public class Regione {
	
	private String name;
	private Nose nose;
	
	private List<Provincia> provincie = new ArrayList<Provincia>();

	public Regione(String name, Nose nose) {
		super();
		this.name = name;
		this.nose = nose;
	}

	public String getName() {
		return name;
	}
	
	public Nose getNose() {
		return nose;
	}
	
	public void add(Provincia provincia) {
		provincie.add(provincia);
	}
	
	public List<Provincia> getProvincie() {
		return provincie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Regione other = (Regione) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + name + "]" + nose.getValue();
	}

}

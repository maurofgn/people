package org.mf.util.people;

import org.mf.util.Utility;


public class FirstName implements Comparable<FirstName>{
	
	
	private String name;
	private Sex gender;
	
	public FirstName(String name, Sex gender) {
		super();
		this.name = Utility.toCamelCase(name, " ");
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public Sex getGender() {
		return gender;
	}
	
	public boolean isMale() {
		return Sex.MALE.equals(gender);
	}
	
	public boolean isFeMale() {
		return Sex.FEMALE.equals(gender);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
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
		FirstName other = (FirstName) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(FirstName o) {
		int c = name.compareTo(o.getName());
		if (c != 0)
			return c;
		
		c = gender.compareTo(o.getGender());
		if (c != 0)
			return c;
		
		return 0;
	}
	
}

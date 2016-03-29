package org.mf.util.people;

public enum Sex {
	MALE("M"), FEMALE("F");
	
	private String value;
	
	private Sex(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static Sex getSex(String s) {
		if (s.equalsIgnoreCase(MALE.getValue()))
			return MALE;
		else if (s.equalsIgnoreCase(FEMALE.getValue()))
			return FEMALE;
		else 
			return null;
	}

}

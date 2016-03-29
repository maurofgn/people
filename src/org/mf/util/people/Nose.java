package org.mf.util.people;

public enum Nose {
	
	Centro("Centro"), Isole("Isole"), Nord_est("Nord-est"), Nord_ovest("Nord-ovest"), Sud("Sud");
	
	private String value;
	
	private Nose(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static Nose getNose(String s) {
		if (s.equalsIgnoreCase(Centro.getValue()))
			return Centro;
		else if (s.equalsIgnoreCase(Isole.getValue()))
			return Isole;
		else if (s.equalsIgnoreCase(Nord_est.getValue()))
			return Nord_est;
		else if (s.equalsIgnoreCase(Nord_ovest.getValue()))
			return Nord_ovest;
		else if (s.equalsIgnoreCase(Sud.getValue()))
			return Sud;
		else 
			return null;
	}
	
}

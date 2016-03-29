package org.mf.util.people;

public class Comune {
//	new Comune("Chieti","Abruzzo","Chieti",1,"CH","C632",51484);
	
	private String name;
	private int abitanti;
	private String codiceCatastale;
	private Provincia provincia;
	private boolean capoLuogo;
	
	public Comune(String name, int abitanti, String codiceCatastale, Provincia provincia, boolean capoLuogo) {
		super();
		this.name = name;
		this.abitanti = abitanti;
		this.codiceCatastale = codiceCatastale;
		this.provincia = provincia;
		this.capoLuogo = capoLuogo;
		provincia.add(this);
	}

	public String getName() {
		return name;
	}

	public int getAbitanti() {
		return abitanti;
	}

	public String getCodiceCatastale() {
		return codiceCatastale;
	}

	public Provincia getProvincia() {
		return provincia;
	}
	
	public boolean isCapoLuogo() {
		return capoLuogo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abitanti;
		result = prime * result
				+ ((codiceCatastale == null) ? 0 : codiceCatastale.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((provincia == null) ? 0 : provincia.hashCode());
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
		Comune other = (Comune) obj;
		if (abitanti != other.abitanti)
			return false;
		if (codiceCatastale == null) {
			if (other.codiceCatastale != null)
				return false;
		} else if (!codiceCatastale.equals(other.codiceCatastale))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " " + provincia;
	}
	
}

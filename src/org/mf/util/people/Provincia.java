package org.mf.util.people;

import java.util.ArrayList;
import java.util.List;

public class Provincia {

	private String name;
	private String sigla;
	private Regione regione;
	private List<Comune> comuni = new ArrayList<Comune>();
	private Comune capoluogo;
	
	public Provincia(String name, String sigla, Regione regione) {
		super();
		this.name = name;
		this.sigla = sigla;
		this.regione = regione;
		regione.add(this);
	}

	public String getName() {
		return name;
	}
	
	public String getSigla() {
		return sigla;
	}

	public Regione getRegione() {
		return regione;
	}
	
	public void add(Comune comune) {
		comuni.add(comune);
		if (comune.isCapoLuogo())
			capoluogo = comune;
	}
	
	public Comune getCapoluogo() {
		return capoluogo;
	}

	public List<Comune> getComuni() {
		return comuni;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regione == null) ? 0 : regione.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		Provincia other = (Provincia) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regione == null) {
			if (other.regione != null)
				return false;
		} else if (!regione.equals(other.regione))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  name + " (" + sigla + ")" + " " + regione;
	}

}

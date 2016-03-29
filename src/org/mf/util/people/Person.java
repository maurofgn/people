package org.mf.util.people;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.mf.util.Utility;

public class Person {
	
	private int id;
	private String codice;
	private String cognome;
	private FirstName nome;
	private Date dataNascita;
	private Comune comune;
	private String codFiscale;
	private Address address;
	
	private static final SimpleDateFormat dfIt = new SimpleDateFormat("dd/MM/yyyy");
	private static final int YEAR_MAX = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)-1;
	private static final int YEAR_MIN = YEAR_MAX - 90;

	public Person() {
	}
	
	public Person(Person person) {
		this(person.getId(), person.getCodice(),  person.getCognome(),  person.getNome(), person.getComune(), person.getAddress());
	}
	
	public Person(int id, String codice, String cognome, FirstName nome, Comune comune, Address address) {
		this.id = id;
		this.codice = codice == null ? ""+id : codice;
		this.cognome = cognome;
		this.nome = nome;
		this.comune = comune;
		this.dataNascita = Utility.randDate(YEAR_MIN, YEAR_MAX);
		this.codFiscale = Utility.calcoloCodiceFiscale(cognome, nome.getName(), dataNascita, comune.getCodiceCatastale(), nome.isMale());
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public FirstName getNome() {
		return nome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + cognome;
	}


	public void setNome(FirstName nome) {
		this.nome = nome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Sex getSesso() {
		return nome.getGender();
	}
	
	public String getCodFiscale() {
		return codFiscale;
	}

	public Comune getComune() {
		return comune;
	}

	public void setComune(Comune comune) {
		this.comune = comune;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}
	

	public Address getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFiscale == null) ? 0 : codFiscale.hashCode());
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
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
		Person other = (Person) obj;
		if (codFiscale == null) {
			if (other.codFiscale != null)
				return false;
		} else if (!codFiscale.equals(other.codFiscale))
			return false;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataNascita == null) {
			if (other.dataNascita != null)
				return false;
		} else if (!dataNascita.equals(other.dataNascita))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "["
//				+ "id=" + id + ", codice=" + codice 
				+ getNomeCompleto()
				+ " " + getAddress()
				+ " " + getComune().getName()
				+ " nat" + (nome.isMale() ? "o" : "a" ) + " il " + dfIt.format(dataNascita)
				+ " cf: " + codFiscale 
				+ "]";
	}

}


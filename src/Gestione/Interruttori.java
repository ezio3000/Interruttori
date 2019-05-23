package Gestione;

public class Interruttori {
	private int matricola;
	private int correnteIntervento;	
	private String posizione;
	private String marca;
	
	
	public int getMatricola() {
		return matricola;
	}
	public Interruttori(int matricola, int amperaggio, String posizione, String marca) {
		super();
		this.matricola = matricola;
		this.correnteIntervento = amperaggio;
		this.posizione = posizione;
		this.marca = marca;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public int getAmperaggio() {
		return correnteIntervento;
	}
	public void setAmperaggio(int amperaggio) {
		this.correnteIntervento = amperaggio;
	}
	public String getPosizione() {
		return posizione;
	}
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return String.format("Interruttori [matricola=%s, CorrenteIntervento=%s, posizione=%s, marca=%s]", matricola,
				correnteIntervento, posizione, marca);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + correnteIntervento;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + matricola;
		result = prime * result + ((posizione == null) ? 0 : posizione.hashCode());
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
		Interruttori other = (Interruttori) obj;
		if (correnteIntervento != other.correnteIntervento)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (matricola != other.matricola)
			return false;
		if (posizione == null) {
			if (other.posizione != null)
				return false;
		} else if (!posizione.equals(other.posizione))
			return false;
		return true;
	}

}

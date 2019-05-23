package Gestione;

import java.util.HashMap;


public class Organizzazione {
	private HashMap<Interruttori,Usura> componente;
	
	public Organizzazione() {
		this.componente= new HashMap<Interruttori,Usura>();
	}
	
	public boolean add(Interruttori I, Usura U) {
		if (!this.esisteGiaInterruttore(I)) {
			voti.add(I);
			return true;
		} else {
			return false;
		}
	}
}

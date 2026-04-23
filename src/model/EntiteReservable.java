package model;

public class EntiteReservable <T extends Formulaire>{
	
	protected CalendrierAnnuel calendrier = new CalendrierAnnuel();
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public boolean compatible(T formulaire) {
		return false;
	}
	
	public Reservation reserver(T formulaire) {
		return null;
	}
	
}

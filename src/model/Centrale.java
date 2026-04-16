package model;

public class Centrale <T extends Formulaire>{

	EntiteReservable<T>[] entites; 
	int nbEntite = 0;
	
	public Centrale(EntiteReservable<T>[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(EntiteReservable<T> entite) throws IndexOutOfBoundsException {
		if(nbEntite>=entites.length)
			throw new IndexOutOfBoundsException();
		entites[nbEntite++] = entite;
		entite.setId(nbEntite);
		return nbEntite;
	}
	
	public int[] donnerPossibilites(T formulaire) {
		int[] res = new int[nbEntite];
		for(int i=0; i<nbEntite; i++) {
			res[i] = (entites[i].compatible(formulaire)?entites[i].getId():0);
		}
		return res;
	}
	
	public Reservation reserver(int entiteId, T formulaire) {
		return null;
	}
}

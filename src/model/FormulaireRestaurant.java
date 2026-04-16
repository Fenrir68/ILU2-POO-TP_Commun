package model;

public class FormulaireRestaurant extends Formulaire{

	private int nbPers, numServ;

	public FormulaireRestaurant(int numJ, int numM, int nbPers, int numServ) {
		super(numJ, numM);
		this.nbPers = nbPers;
		this.numServ = numServ;
	}

	public int getNombrePersonnes() {
		return nbPers;
	}
	
	public int getNumService() {
		return numServ;
	}
}

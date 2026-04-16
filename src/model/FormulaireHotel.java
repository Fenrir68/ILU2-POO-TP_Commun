package model;

public class FormulaireHotel extends Formulaire{

	private int nbLitSimple, nbLitDouble;

	public FormulaireHotel(int numJ, int numM, int nbLitSimple, int nbLitDouble) {
		super(numJ, numM);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}
	
}

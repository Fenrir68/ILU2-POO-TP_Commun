package model;

public class FormulaireSpectacle extends Formulaire{

	private int numZone;

	public FormulaireSpectacle(int numJ, int numM, int numZone) {
		super(numJ, numM);
		this.numZone = numZone;
	}

	public int getNumZone() {
		return numZone;
	}
	
}

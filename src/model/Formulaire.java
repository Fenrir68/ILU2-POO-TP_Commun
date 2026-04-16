package model;

public abstract class Formulaire {
	
	private int numJ, numM, identificationEntite;

	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}

	public Formulaire(int numJ, int numM) {
		this.numJ = numJ;
		this.numM = numM;
	}

	public int getJour() {
		return numJ;
	}

	public int getMois() {
		return numM;
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}
	
	
}

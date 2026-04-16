package model;

public abstract class Reservation {
	
	private int numJ, numM;
	
	public Reservation(int numJ, int numM) {
		this.numJ = numJ;
		this.numM = numM;
	}
	
	public String toString() {
		return String.format("Le %d/%d\n", numJ, numM);
	}
}

package model;

public class ReservationHotel extends Reservation{
	
	int nbLitSimple, nbLitDouble, numChambre;
	
	public ReservationHotel(int numJ, int numM, int nbLitSimple, int nbLitDouble, int numChambre) {
		super(numJ, numM);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format("chambre n° %d avec %d lit(s) simple(s) et %d lit(s) double(s).", numChambre, nbLitSimple, nbLitDouble);
	}

}

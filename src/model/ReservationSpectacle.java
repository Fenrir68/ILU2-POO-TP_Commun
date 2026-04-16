package model;

public class ReservationSpectacle extends Reservation{
	
	int numZone, numChaise;
	
	public ReservationSpectacle(int numJ, int numM, int numZone, int numChaise) {
		super(numJ, numM);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format("zone n°%d à la chaise n°%d.", numZone, numChaise);
	}

}

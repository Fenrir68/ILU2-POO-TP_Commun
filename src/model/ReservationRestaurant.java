package model;

public class ReservationRestaurant extends Reservation{
	
	int numService, numTable;
	
	public ReservationRestaurant(int numJ, int numM, int numService, int numTable) {
		super(numJ, numM);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format(": Table %d pour le %s service.", numTable, (numService==1?"premier":"deuxième"));
	}

}

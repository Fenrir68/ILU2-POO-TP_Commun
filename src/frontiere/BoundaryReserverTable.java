package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	ControlReserverTable controlReserverTable;
	private Scanner scanner = new Scanner(System.in);
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public void reververTable(int numClient) {
		System.out.println("Quand souhaitez vous reserver?");
		int mois = 0, jour = 0, nbPersonnes = 0, numServ = 0;
		while(mois<1 || mois >12) {
			System.out.println("Pour quel mois ?");
			mois = scanner.nextInt();
		}
		while(jour<1||jour>31) {
			System.out.println("Pour quel jour ?");
			jour = scanner.nextInt();
		}
		while(nbPersonnes<1) {
			System.out.println("Pour combien de personnes ?");
			nbPersonnes = scanner.nextInt();
		}
		while(numServ!=1 && numClient!=2) {
			System.out.println("Pour quel service ?");
			numServ = scanner.nextInt();
		}
		int possibilites[] = this.controlReserverTable.trouverPossibilite(jour, mois, nbPersonnes, numServ);
		for(int i=1; i<possibilites.length; i++) {
			if(possibilites[i]!=0)
				System.out.println("numéro de table : "+possibilites[i]);
		}
		System.out.println("Choisissez votre table");
		int numTable = scanner.nextInt();
		this.controlReserverTable.reserver(numClient, numTable, possibilites[0]);
	}
}

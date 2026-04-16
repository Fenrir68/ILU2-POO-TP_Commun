package model;

public class CalendrierAnnuel {

	private class Mois{
		private String nom;
		private boolean[] jour;
		
		public Mois(String nom, int nbJour) {
			this.nom = nom;
			this.jour = new boolean[nbJour];
			for(int i=0; i<nbJour; i++) this.jour[i] = false;
		}
		public boolean estLibre(int numJ) { return !this.jour[numJ];}
		public void reserver(int numJ) {
			if(this.jour[numJ]) 
				throw new IllegalStateException();
			else
				this.jour[numJ] = true;
		}
	}
	
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		String[] noms = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
		int[] nbJ = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<12; i++) {
			this.calendrier[i] = new Mois(noms[i], nbJ[i]);
		}
	}
	
	public boolean estLibre(int numJ, int numM) {
		return this.calendrier[numM-1].estLibre(numJ-1);
	}
	
	public boolean reserver(int numJ, int numM) {
		try {
			this.calendrier[numM-1].reserver(numJ-1);
		}catch(IllegalStateException e) {
			//e.printStackTrace();
			return false;
		}
		return true;
	}
	
}

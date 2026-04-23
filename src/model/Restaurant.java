package model;

public class Restaurant {
	
	private Centrale<FormulaireRestaurant> centrale;
	
	class Table extends EntiteReservable<FormulaireRestaurant>{
		private int nbChaise;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
		
		Table(int nbChaise){
			super();
			this.nbChaise = nbChaise;
		}
		
		@Override
		public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
			CalendrierAnnuel calend = (formulaire.getNumService()==1?super.calendrier:this.calendrierDeuxiemeService);
			if(calend.reserver(formulaire.getJour(), formulaire.getMois())) {
				return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), super.getId());
			}
			return null;
			
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			int nbConvives = formulaire.getNombrePersonnes();
			return this.estTableLibre(formulaire) && (nbConvives==this.nbChaise || nbConvives+1==this.nbChaise);
		}
		
		private boolean estTableLibre(FormulaireRestaurant formulaire) {
			return (formulaire.getNumService()==1? this.estLibre(formulaire) : this.calendrierDeuxiemeService.estLibre(formulaire.getJour(), formulaire.getMois()));
		}
	}
	
	public Restaurant() {
		this.centrale = new Centrale<FormulaireRestaurant>(new Table[100]);
	}

	public void ajouterTable(int nbChaise) {
		centrale.ajouterEntite(new Table(nbChaise));
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public ReservationRestaurant reserver(int numEntite, FormulaireRestaurant formulaire) {
		return (ReservationRestaurant) centrale.reserver(numEntite-1, formulaire);
	}
}

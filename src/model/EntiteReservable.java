package model;

public class EntiteReservable<T extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int numIdentification;

	public EntiteReservable(CalendrierAnnuel calendrier, int numIdentification) {
		super();
		this.calendrier = calendrier;
		this.numIdentification = numIdentification;
	}

	public boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}

	public boolean compatible(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.reserver(jour, mois);
	}

	public Reservation reserver(T formulaire) {
		if (!compatible(formulaire)) {
			return null;
		} else {
			return formulaire.traduireReservation();
		}
	}
}

package model;

public abstract class Reservation {
	protected int jour;
	protected int mois;
	protected CalendrierAnnuel calendrier;

	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
		calendrier = new CalendrierAnnuel();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Le " + jour + "/" + mois + "\n");
		return builder.toString();
	}

}

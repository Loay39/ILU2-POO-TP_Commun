package model;

public class ReservationHotel extends Reservation {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numChambre;

	public ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int numChambre) {
		super(jour, mois);
		this.nbLitsDoubles = nbLitsDoubles;
		this.nbLitsSimples = nbLitsSimples;
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + "Chambre num " + numChambre + " Avec " + nbLitsSimples + " lits simples et "
				+ nbLitsDoubles + " lits doubles ");
		return builder.toString();
	}

}

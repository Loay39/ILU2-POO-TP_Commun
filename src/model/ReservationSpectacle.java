package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;

	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + "Chaise numéro " + numChaise + " et zone numéro " + numZone);
		return builder.toString();
	}

}

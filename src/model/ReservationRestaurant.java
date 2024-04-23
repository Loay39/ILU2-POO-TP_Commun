package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTableReservée;

	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		numTableReservée = numTable;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String serviceFr = "";
		switch (numService) {
		case 1:
			serviceFr = " premier ";
		case 2:
			serviceFr = " deuxième ";
		}
		builder.append(super.toString() + "Table " + numTableReservée + " pour le" + serviceFr + "service");
		return builder.toString();
	}

}

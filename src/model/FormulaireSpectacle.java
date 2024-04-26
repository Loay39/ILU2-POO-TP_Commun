package model;

public class FormulaireSpectacle extends Formulaire {
	private int nombreZone;

	public FormulaireSpectacle(int jour, int mois, int nombreZone) {
		super(jour, mois);
		this.nombreZone = nombreZone;
	}

	public int getNombreZone() {
		return nombreZone;
	}

	@Override
	public ReservationSpectacle traduireReservation() {
		return new ReservationSpectacle(super.getJour(), super.getMois(), nombreZone, super.getIdentificationEntite());
	}
}

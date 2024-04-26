package model;

public class CalendrierAnnuel {
	Mois[] calendrier;

	public CalendrierAnnuel() {
		calendrier = new Mois[] { new Mois("Janvier"), new Mois("Février"), new Mois("Mars"), new Mois("Avril"),
				new Mois("Mai"), new Mois("Juin"), new Mois("Juillet"), new Mois("Août"), new Mois("Septembre"),
				new Mois("Octobre"), new Mois("Novembre"), new Mois("Décembre") };

	}

	private static class Mois {
		String nom;
		int nbJours;
		boolean[] jours;

		private Mois(String nom) {
			this.nom = nom;
			switch (nom) {
			case "Janvier", "Mars", "Mai", "Juillet", "Août", "Octobre", "Décembre":
				nbJours = 31;
				break;
			case "Avril", "Juin", "Septembre", "Novembre":
				nbJours = 30;
				break;
			default:
				nbJours = 28;
				break;
			}
			jours = new boolean[nbJours];

			for (int i = 0; i < nbJours; i++) {
				jours[i] = true;
			}
		}

		private boolean estLibre(int jour) {
			return jours[jour];
		}

		private void reserver(int jour) {
			jours[jour] = false;
		}
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour - 1);
	}

	public boolean reserver(int jour, int mois) {
		if (!calendrier[mois - 1].estLibre(jour - 1)) {
			return false;
		} else {
			calendrier[mois - 1].reserver(jour - 1);
			return true;
		}
	}
}

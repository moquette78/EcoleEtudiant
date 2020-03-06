package dao;

import interfaces.Igestion;
import metier.Etudiant;
import gestion.Gestion;

public class GestionDao implements Igestion{
	
			public Etudiant creerEtudiant (Etudiant etudiant) {
				
				return Gestion.creerEtudiant(etudiant);
			}
			
			public void lireEtudiant(String email) {
				Gestion.lireEtudiant(email);
			}
			
			public void supprimerEtudiant(String email) {
				Gestion.supprimerEtudiant(email);
			}
			
			public void modifierAdresseEtudiant(String email,String nouvelleAdresse) {
				Gestion.modifierAdresseEtudiant(email, nouvelleAdresse);
			}
			
			public void associerCoursEtudiant(int idEtudiant,String theme) {
				Gestion.associerCoursEtudiant(idEtudiant, theme);
			}
			
			public void listerEtudiants() {
				Gestion.listerEtudiants();
			}

}

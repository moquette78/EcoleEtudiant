package dao;

import interfaces.Igestion;
import metier.Etudiant;
import gestion.Gestion;

public class GestionDao implements Igestion{
	
			public Etudiant creerEtudiant (int idEtudiant, String nomEtudiant, String prenomEtudiant, String mailEtudiant,
			String adresseEtudiant, String telephoneEtudiant, String dateNaissanceEtudiant) {
				
				return Gestion.creerEtudiant(idEtudiant, nomEtudiant, prenomEtudiant, mailEtudiant, adresseEtudiant, telephoneEtudiant, dateNaissanceEtudiant);
				
			}
			
			public void lireEtudiant(int idEtudiant) {
				Gestion.lireEtudiant(idEtudiant);
			}
			
			public void supprimerEtudiant(int idEtudiant) {
				Gestion.supprimerEtudiant(idEtudiant);
			}
			
			public void modifierAdresseEtudiant(int idEtudiant,String nouvelleAdresse) {
				Gestion.modifierAdresseEtudiant(idEtudiant, nouvelleAdresse);
			}
			
			public void associerCoursEtudiant(int idEtudiant,String theme) {
				Gestion.associerCoursEtudiant(idEtudiant, theme);
			}
			
			public void listerEtudiants() {
				Gestion.listerEtudiants();
			}

}

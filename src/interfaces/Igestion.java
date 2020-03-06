package interfaces;

import metier.Etudiant;

public interface Igestion {

	abstract Etudiant creerEtudiant (int idEtudiant, String nomEtudiant, String prenomEtudiant, String mailEtudiant,
	String adresseEtudiant, String telephoneEtudiant, String dateNaissanceEtudiant);
	
	abstract void lireEtudiant(String emai);
	
	abstract void supprimerEtudiant(String email);
	
	abstract void modifierAdresseEtudiant(String email,String nouvelleAdresse);
	
	abstract void associerCoursEtudiant(int idEtudiant,String theme);
	
	abstract void listerEtudiants();
	
}

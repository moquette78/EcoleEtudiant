package interfaces;

import metier.Etudiant;

public interface Igestion {

	abstract Etudiant creerEtudiant (int idEtudiant, String nomEtudiant, String prenomEtudiant, String mailEtudiant,
	String adresseEtudiant, String telephoneEtudiant, String dateNaissanceEtudiant);
	
	abstract void lireEtudiant(int idEtudiant);
	
	abstract void supprimerEtudiant(int idEtudiant);
	
	abstract void modifierAdresseEtudiant(int idEtudiant,String nouvelleAdresse);
	
	abstract void associerCoursEtudiant(int idEtudiant,String theme);
	
	abstract void listerEtudiants();
	
}

package interfaces;

import metier.Etudiant;

public interface Igestion {

	abstract Etudiant creerEtudiant (Etudiant email);
	
	abstract void lireEtudiant(String email);
	
	abstract String connexion(String email, String mdp);
	
	abstract void supprimerEtudiant(String email);
	
	abstract void modifierAdresseEtudiant(String email,String nouvelleAdresse);
	
	abstract void associerCoursEtudiant(String mailEtudiant,String theme);
	
	abstract void listerEtudiants();
	
}

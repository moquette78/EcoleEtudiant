package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.GestionDao;
import interfaces.Igestion;
import metier.Etudiant;


public class Gestion implements Igestion {
	

	@Override
	public String  connexion(String email, String mdp) {
		return GestionDao.connexion(email, mdp);
	}
	
	public Etudiant creerEtudiant (Etudiant etudiant) {
		
		return GestionDao.creerEtudiant(etudiant);
	}
	
	public void lireEtudiant(String email) {
		GestionDao.lireEtudiant(email);
	}
	
	public void supprimerEtudiant(String email) {
		GestionDao.supprimerEtudiant(email);
	}
	
	public void modifierAdresseEtudiant(String email,String nouvelleAdresse) {
		GestionDao.modifierAdresseEtudiant(email, nouvelleAdresse);
	}
	
	public void associerCoursEtudiant(int idEtudiant,String theme) {
		GestionDao.associerCoursEtudiant(idEtudiant, theme);
	}
	
	public void listerEtudiants() {
		GestionDao.listerEtudiants();
	}

}

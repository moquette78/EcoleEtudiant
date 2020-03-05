package lanceur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import gestion.*;

public class Lanceur {

	public static void main(String[] args) {
		int idConnexion;
		String nom="";
		String prenom="";
		String mail="";
		String adresse="";
		int id;
		String numero;
		String dateNaissance="";
		String cours="";
		
		
		int directeur = 666;
		int responsable = 555;
		boolean connexion = false;
		
		Scanner sc = new Scanner(System.in);
		char requete='!';
		/**
		 * 
		 * phase de connexion , si vous n'etes ni responsable ni directeur vous ne passez pas
		 *
		 */
		
		System.out.println("Tapez votre id pour vous connecter");
		idConnexion=sc.nextInt();
		if(idConnexion==directeur) {
			System.out.println("Bienvenue monsieur le directeur");
			connexion = true;
		}else if(idConnexion==responsable) {
			System.out.println("Bienvenue monsieur le responsable");
			connexion = true;
		}else {
			System.out.println("Vous n'avez pas les droits");
		}
		/**
		 * 
		 * tant que la personne ne quitte pas on reste dans le menu
		 */
		while(requete !='Q' && connexion==true) {
			System.out.println("MENU PRINCIPAL - Cliquez sur la touche associée pour effectuer une action");
			System.out.println("-------------------------------------------------\n");
			System.out.println("A. Créer un étudiant");
			System.out.println("B. Associer un cours a un etudiant");
			System.out.println("C. Lire les infos d'un étudiant");
			System.out.println("D. Modifier l'adresse d'un etudiant");
			System.out.println("E. Supprimer un etudiant");
			System.out.println("F. Lister l'ensemble des etudiants");
			System.out.println("Q. Quitter le menu");
		
			requete = sc.next().charAt(0);
			sc.nextLine();
			if(requete=='A') {
				System.out.println("Id de l'etudiant ?");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Nom de l'etudiant ?");
				nom = sc.nextLine();
				System.out.println("Prenom de l'etudiant ?");
				prenom = sc.nextLine();
				System.out.println("Mail de l'etudiant ?");
				mail = sc.nextLine();
				System.out.println("Adresse de l'etudiant ?");
				adresse = sc.nextLine();
				System.out.println("Telephone de l'etudiant ?");
				numero = sc.nextLine();
				System.out.println("Date de naissance de l'etudiant ?");
				dateNaissance = sc.nextLine();
				Gestion.creerEtudiant(id, nom, prenom, mail, adresse, numero,dateNaissance);
			}
			if(requete=='B') {
				System.out.println("Id de l'etudiant ?");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Cours de l'etudiant ?");
				cours = sc.nextLine();
				Gestion.associerCoursEtudiant(id,cours);
			}
			
			if(requete=='C') {
				System.out.println("Id de l'etudiant ?");
				id = sc.nextInt();
				sc.nextLine();
				Gestion.lireEtudiant(id);
			}
			
			if(requete=='D') {
				System.out.println("Id de l'etudiant ?");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Adresse de l'etudiant ?");
				adresse = sc.nextLine();
				Gestion.modifierAdresseEtudiant(id,adresse);
			}
			if(requete=='F') {
				if(idConnexion==directeur) {
					Gestion.listerEtudiants();
				}else {
					System.out.println("Vous n'avez pas les droits");
				}
			}
			if(requete=='Q') {
				System.out.println("A bientot");
			}
		}
		
		// TODO Auto-generated method stub
/*
		System.out.println("ok");
		//Gestion.creerEtudiant(10, "Eric", "Simon", "jjjj", "kkkkk", 12,"12 janvier");
		Gestion.lireEtudiant(1);
		Gestion.supprimerEtudiant(3);
		Gestion.listerEtudiants();
		Gestion.modifierAdresseEtudiant(4,"1 rue charles de gaulle");
*/
	}

}

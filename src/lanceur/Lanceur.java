package lanceur;

import java.util.Scanner;

import dao.GestionDao;
import metier.Etudiant;
import service.*;

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
		String mdp="";
		Gestion gestion =  new Gestion();
		
		boolean connexion = false;
		
		Scanner sc = new Scanner(System.in);
		String requete="-1";
		/**
		 * 
		 * phase de connexion , si vous n'etes ni responsable ni directeur vous ne passez pas
		 *
		 */
		
		System.out.println("Tapez votre email pour vous connecter");
		mail=sc.nextLine();
		
		System.out.println("Tapez votre mot de passe pour vous connecter");
		mdp=sc.nextLine();
		
		String role = gestion.connexion(mail, mdp);
		
		if(role.equals("directeur")) {
			System.out.println("Bienvenue monsieur le directeur");
			connexion = true;
		}
		
		else if(role.equals("responsable")) {
			System.out.println("Bienvenue monsieur le responsable");
			connexion = true;
		}else {
			System.out.println("");
		}
		/**
		 * 
		 * tant que la personne ne quitte pas on reste dans le menu
		 */
		while(requete.toUpperCase()!="Q" && connexion==true) {
			System.out.println("MENU PRINCIPAL - Cliquez sur la touche associée pour effectuer une action");
			System.out.println("-------------------------------------------------\n");
			System.out.println("A. Créer un étudiant");
			System.out.println("B. Associer un cours a un etudiant");
			System.out.println("C. Lire les infos d'un étudiant");
			System.out.println("D. Modifier l'adresse d'un etudiant");
			System.out.println("E. Supprimer un etudiant");
			System.out.println("F. Lister l'ensemble des etudiants");
			System.out.println("Q. Quitter le menu");
		
			requete = sc.nextLine();
			switch(requete.toUpperCase()) {
			case "A":
				
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
				Etudiant etudiant=new Etudiant();
				etudiant.setNom(nom);
				etudiant.setPrenom(prenom);
				etudiant.setAdresse(adresse);
				etudiant.setMail(mail);
				etudiant.setDateNaissanceEtudiant(dateNaissance);
				etudiant.setTelephone(numero);

				gestion.creerEtudiant(etudiant);

				break;
			
			case "B":
				System.out.println("Entrer l'email de l'etudiant ?");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Cours de l'etudiant ?");
				cours = sc.nextLine();
				gestion.associerCoursEtudiant(id,cours);
				break;
			
			case "C":
				System.out.println("Entrer l'email  de l'etudiant ?");
				mail = sc.nextLine();
				gestion.lireEtudiant(mail);
				break;
			
			case "D":
				System.out.println("Entrer l'email  de l'etudiant ?");
				mail = sc.nextLine();
				System.out.println("Adresse de l'etudiant ?");
				adresse = sc.nextLine();
				gestion.modifierAdresseEtudiant(mail,adresse);
				break;
				
			case "E":
				System.out.println("Entrer l'email de l'etudiant ?");
				mail = sc.nextLine();
				gestion.supprimerEtudiant(mail);
				break;
				
			case "F":
				if(role.equals("directeur")) {
					gestion.listerEtudiants();
				}else {
					System.out.println("Vous n'avez pas les droits");
				}
				break;
			
			case "Q":
				System.out.println("A bientot");
				System.exit(0);
				break;
			default:
			    System.out.println("");
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
		sc.close();
	}

}

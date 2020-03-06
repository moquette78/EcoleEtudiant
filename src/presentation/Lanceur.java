package presentation;

import java.util.Scanner;

import metier.Etudiant;
import service.*;

/**
 * Classe Lanceur : représente le point d'entrée du programme.
 *
 */
public class Lanceur {

	/**
	 * Méthode principale et point d'entrée du programme.
	 * @param args Arguments passés au programme.
	 */
	public static void main(String[] args) {
		
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

		// Phase de connexion, nécessite d'être responsable ou directeur
		System.out.println("Tapez votre email pour vous connecter");
		mail=sc.nextLine();
		
		System.out.println("Tapez votre mot de passe pour vous connecter");
		mdp=sc.nextLine();
		
		String role = gestion.connecter(mail, mdp);
		
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
		
		// Tant que la personne ne quitte pas on continue
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
				mail = sc.nextLine();
				System.out.println("Cours de l'etudiant ?");
				cours = sc.nextLine();
				gestion.associerCoursEtudiant(mail,cours);
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
		sc.close();
	}

}

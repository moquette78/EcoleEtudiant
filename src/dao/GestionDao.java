package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import metier.Etudiant;


public class GestionDao {
	

			// Information d'acc�s � la base de donn�es
					static String url = "jdbc:mysql://localhost:8889/Projet";
					static String login = "root";
					static String password = "root";
					
					static Connection connection = null;
					static Statement statement = null;
					static ResultSet rs=null;
					
					
					
					/***
					 * Connexion 		
					 */
							
					public static String connexion(String email , String mdp) {
						
						String role ="";
						
						try
						{
							
							
							// Etape 1 : Chargement du driver
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							// Etape 2 : R�cup�ration de la connexion
							connection = DriverManager.getConnection(url, login, password);
							
							// Etape 3 : Cr�ation d'un statement
							statement = connection.createStatement();
							
							String sql ="Select * from Enseignant  WHERE mail ='"+email+"' and mdp ='"+mdp+"'";
							
							// Etape 4 : Ex�cution requ�te
							rs = statement.executeQuery(sql);
								if(rs.next()) {
								role = rs.getString("role");
								}
								else {
									System.out.println("Email ou mot de passe incorrect");
								}
							
						}
						catch (SQLException e)
						{
							e.printStackTrace();
						}
						catch (ClassNotFoundException e)
						{
							e.printStackTrace();
						}
						finally
						{
							try
							{
								// Etape 5 : Lib�rer ressources de la m�moire
								connection.close();
								statement.close();
							}
							catch (SQLException e)
							{
								e.printStackTrace();
							}
						}
						
					return role;
					}
					
					
			
			/***
			 * 
			 * @param idEtudiant identifiant de l'etudiant
			 * @param nomEtudiant nom de l'etudiant
			 * @param prenomEtudiant prenom de l'etudiant 
			 * @param mailEtudiant mail de l'etudiant
			 * @param adresseEtudiant adresse de l'etudiant
			 * @param telephoneEtudiant telephone de l'etudiant
			 * @param dateNaissanceEtudiant date de naissance de l'etudiant
			 * @return l'etudiant cr�� en question
			 */
					
					
					
			public static Etudiant creerEtudiant(Etudiant etudiant)
			{
				
				
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					//String sql = "INSERT INTO 'Etudiant' VALUES ("+idEtudiant+","+nomEtudiant+","+prenomEtudiant+","+mailEtudiant+","+adresseEtudiant+","+telephoneEtudiant+","+dateNaissanceEtudiant+")\"";
					//String sql ="INSERT INTO Etudiant(nom,prenom,mail,adresse,numero,dateNaissance) " + "VALUES ('"+etudiant.getNom()+"','"+etudiant.getPrenom()+"','"+etudiant.getMail()+"','"+etudiant.getAdresse()+"',"+etudiant.getTelephone()+",'"+etudiant.getDateNaissanceEtudiant()+"')";
					String sql ="INSERT INTO Etudiant(nom,prenom,mail,adresse,numero,dateNaissance) " + "VALUES ('"+etudiant.getNom()+"','"+etudiant.getPrenom()+"','"+etudiant.getMail()+"','"+etudiant.getAdresse()+"','"+etudiant.getTelephone()+"','"+etudiant.getDateNaissanceEtudiant()+"')";

					// Etape 4 : Ex�cution requ�te
					statement.executeUpdate(sql);
					
					System.out.println("L'etudiant " + etudiant.getNom() + " " + etudiant.getPrenom() + " a ete cree.\n");
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
				return new Etudiant();
			}
			
			/***
			 * 
			 * @param idEtudiant identifiant de l'etudiant
			 * 
			 * retourne les informations concernant l'etudiant
			 */
			public static void lireEtudiant(String email)
			{
				
				
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					//String sql = "INSERT INTO 'Etudiant' VALUES ("+idEtudiant+","+nomEtudiant+","+prenomEtudiant+","+mailEtudiant+","+adresseEtudiant+","+telephoneEtudiant+","+dateNaissanceEtudiant+")\"";
					String sql ="Select * FROM Etudiant WHERE mail ='"+email+"'";
					
					// Etape 4 : Ex�cution requ�te
					rs=statement.executeQuery(sql);
					if(rs.next()) {
					System.out.println("Nom : "+ rs.getString("nom"));
					System.out.println("Prenom : "+ rs.getString("prenom"));
					System.out.println("Mail : "+ rs.getString("mail"));
					System.out.println("Adresse : "+ rs.getString("adresse"));
					System.out.println("Numero : "+ rs.getString("numero"));
					System.out.println("dateNaissance : "+ rs.getString("dateNaissance"));
					}else {
						System.out.println("Aucun etudiant n'a cet id \n");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
			/**
			 * 
			 * @param idEtudiant identifiant
			 * 
			 * supprime un etudiant de la base
			 */
			public static void supprimerEtudiant(String email)
			{
				
				
				int resultat;
				
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					String sql = "delete from Etudiant where mail ='"+email+"'";
					
					// Etape 4 : Ex�cution requ�te
					resultat= statement.executeUpdate(sql);
					
					if(resultat==0) {
						System.out.println("Aucun etudiant ne possede cet id \n");
					}else {
						System.out.println("L'etudiant a bien ete supprime \n");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
			/**
			 * 
			 * liste l'ensemble des etudiants de la base
			 * 
			 */
			public static void listerEtudiants()
			{
				
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					//String sql = "INSERT INTO 'Etudiant' VALUES ("+idEtudiant+","+nomEtudiant+","+prenomEtudiant+","+mailEtudiant+","+adresseEtudiant+","+telephoneEtudiant+","+dateNaissanceEtudiant+")\"";
					String sql ="Select * FROM Etudiant order by nom";
					
					// Etape 4 : Ex�cution requ�te
					rs=statement.executeQuery(sql);
					System.out.println("Voici l'ensemble des etudiants : \n");
					System.out.println("Nom "+"Prenom \n");
					System.out.println("----------------------");
					while(rs.next()) {
					System.out.println(rs.getString("nom") + " " + rs.getString("prenom"));
					}
					System.out.println("\n");
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			/**
			 * 
			 * @param idEtudiant identifiant de l'etudiant
			 * 
			 * @param nouvelleAdresse nouvelle adresse de l'etudiant
			 * 
			 * met a jour l'adresse de l'etudiant
			 */
			public static void modifierAdresseEtudiant(String email,String nouvelleAdresse)
			{
				
				int resultat;
			
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					String sql = "Update Etudiant Set adresse= '"+nouvelleAdresse+"'where mail ='"+email+"'";
					
					// Etape 4 : Ex�cution requ�te
					resultat= statement.executeUpdate(sql);
					
					if(resultat==0) {
						System.out.println("Aucun etudiant ne poss�de cet id \n");
					}else {
						System.out.println("Nouvelle adresse mise a jour \n");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			/**
			 * 
			 * @param idEtudiant identifiant de l'etudiant
			 * @param theme le theme du cours suivi
			 * 
			 * cr�e une association en l'etudiant et le cours
			 */
			public static void associerCoursEtudiant(String mailEtudiant,String theme)
			{
				
				int resultat;
			
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					
					String sql ="INSERT INTO CoursEtudiant " + "VALUES ('"+theme+"', "+mailEtudiant+")";
					
					// Etape 4 : Ex�cution requ�te
					resultat= statement.executeUpdate(sql);
					
					if(resultat==0) {
						System.out.println("Aucun etudiant ne poss�de cet id \n");
					}else {
						System.out.println("Cours associ� � l'etudiant \n");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
			}


}

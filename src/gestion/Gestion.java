package gestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import metier.Etudiant;

public class Gestion {
	
	
	
	
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
			String sql ="INSERT INTO Etudiant " + "VALUES ('"+etudiant.getNomEtudiant()+"','"+etudiant.getPrenomEtudiant()+"','"+etudiant.getMailEtudiant()+"','"+etudiant.getAdresseEtudiant()+"',"+etudiant.getTelephoneEtudiant()+",'"+etudiant.getDateNaissanceEtudiant()+"')";
			
			// Etape 4 : Ex�cution requ�te
			statement.executeUpdate(sql);
			
			System.out.println("L'etudiant " + etudiant.getNomEtudiant() + " " + etudiant.getPrenomEtudiant() + " a �t� cr��.\n");
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
		
		
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/Projet";
		String login = "root";
		String password = "root";
		ResultSet rs=null;
		
		Connection connection = null;
		Statement statement = null;
		
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
			System.out.println(rs.getString("nom"));
			System.out.println(rs.getString("prenom"));
			System.out.println(rs.getString("mail"));
			System.out.println(rs.getString("adresse"));
			System.out.println(rs.getInt("numero"));
			System.out.println(rs.getString("dateNaissance \n"));
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
		
		
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/Projet";
		String login = "root";
		String password = "root";
		int resultat;
		
		Connection connection = null;
		Statement statement = null;
		
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
				System.out.println("Aucun etudiant ne possède cet id \n");
			}else {
				System.out.println("L'etudiant a bien été supprimé \n");
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
		
		
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/Projet";
		String login = "root";
		String password = "root";
		ResultSet rs=null;
		
		Connection connection = null;
		Statement statement = null;
		
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
		
		
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/Projet";
		String login = "root";
		String password = "root";
		int resultat;
		
		Connection connection = null;
		Statement statement = null;
		
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
	public static void associerCoursEtudiant(int idEtudiant,String theme)
	{
		
		
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/Projet";
		String login = "root";
		String password = "root";
		int resultat;
		
		Connection connection = null;
		Statement statement = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String sql ="INSERT INTO CoursEtudiant " + "VALUES ('"+theme+"', "+idEtudiant+")";
			
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


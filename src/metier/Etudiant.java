package metier;

import java.util.Date;

public class Etudiant extends Personne {

	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String telephone;
	private String dateNaissanceEtudiant;
	
	
	
	public Etudiant() {}
	
	public Etudiant(int id, String nom, String prenom, String mail,
			String adresse, String telephone, String dateNaissanceEtudiant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	
	public String getDateNaissanceEtudiant() {
		return dateNaissanceEtudiant;
	}
	public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", dateNaissanceEtudiant=" + dateNaissanceEtudiant + "]";
	}
	
	
}

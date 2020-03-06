package metier;

import java.util.Date;

public class Etudiant {

	private int idEtudiant;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String telephone;
	private String dateNaissanceEtudiant;
	
	
	
	
	
	public Etudiant(int idEtudiant, String nom, String prenom, String mail, String adresse, String telephone,
			String dateNaissanceEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}

	public Etudiant() {}
	
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDateNaissanceEtudiant() {
		return dateNaissanceEtudiant;
	}

	public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", dateNaissanceEtudiant="
				+ dateNaissanceEtudiant + "]";
	}
	
	
	
}

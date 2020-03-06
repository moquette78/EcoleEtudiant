package metier;

import java.util.Date;

public class Etudiant {

	private int idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	private String mailEtudiant;
	private String adresseEtudiant;
	private String telephoneEtudiant;
	private String dateNaissanceEtudiant;
	
	
	
	
	public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String mailEtudiant,
			String adresseEtudiant, String telephoneEtudiant, String dateNaissanceEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.mailEtudiant = mailEtudiant;
		this.adresseEtudiant = adresseEtudiant;
		this.telephoneEtudiant = telephoneEtudiant;
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	
	public Etudiant() {}
	
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public String getMailEtudiant() {
		return mailEtudiant;
	}
	public void setMailEtudiant(String mailEtudiant) {
		this.mailEtudiant = mailEtudiant;
	}
	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}
	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}
	public String getTelephoneEtudiant() {
		return telephoneEtudiant;
	}
	public void setTelephoneEtudiant(String telephoneEtudiant) {
		this.telephoneEtudiant = telephoneEtudiant;
	}
	public String getDateNaissanceEtudiant() {
		return dateNaissanceEtudiant;
	}
	public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", mailEtudiant=" + mailEtudiant + ", adresseEtudiant=" + adresseEtudiant
				+ ", telephoneEtudiant=" + telephoneEtudiant + ", dateNaissanceEtudiant=" + dateNaissanceEtudiant + "]";
	}
	
	
}

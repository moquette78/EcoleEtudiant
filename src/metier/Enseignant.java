package metier;

public class Enseignant {
	
	private int idEnseignant;
	private String nomEnseignant;
	private String prenomEnseignant;
	private String mailEnseignant;
	private String adresseEnseignant;
	private String telephoneEnseignant;
	private String matiere;
	
	
	public Enseignant(int idEnseignant, String nomEnseignant, String prenomEnseignant, String mailEnseignant,
			String adresseEnseignant, String telephoneEnseignant, String matiere) {
		super();
		this.idEnseignant = idEnseignant;
		this.nomEnseignant = nomEnseignant;
		this.prenomEnseignant = prenomEnseignant;
		this.mailEnseignant = mailEnseignant;
		this.adresseEnseignant = adresseEnseignant;
		this.telephoneEnseignant = telephoneEnseignant;
		this.matiere = matiere;
	}
	public int getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	public String getNomEnseignant() {
		return nomEnseignant;
	}
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}
	public String getPrenomEnseignant() {
		return prenomEnseignant;
	}
	public void setPrenomEnseignant(String prenomEnseignant) {
		this.prenomEnseignant = prenomEnseignant;
	}
	public String getMailEnseignant() {
		return mailEnseignant;
	}
	public void setMailEnseignant(String mailEnseignant) {
		this.mailEnseignant = mailEnseignant;
	}
	public String getAdresseEnseignant() {
		return adresseEnseignant;
	}
	public void setAdresseEnseignant(String adresseEnseignant) {
		this.adresseEnseignant = adresseEnseignant;
	}
	public String getTelephoneEnseignant() {
		return telephoneEnseignant;
	}
	public void setTelephoneEnseignant(String telephoneEnseignant) {
		this.telephoneEnseignant = telephoneEnseignant;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", prenomEnseignant="
				+ prenomEnseignant + ", mailEnseignant=" + mailEnseignant + ", adresseEnseignant=" + adresseEnseignant
				+ ", telephoneEnseignant=" + telephoneEnseignant + ", matiere=" + matiere + "]";
	}
	
	

}

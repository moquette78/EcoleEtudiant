package metier;

public class Enseignant extends Personne{
	
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String telephone;
	private String matiere;
	
	
	public Enseignant(int id, String nom, String prenom, String mail,
			String adresse, String telephone, String matiere) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.matiere = matiere;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", matiere=" + matiere + "]";
	}
	
	

}

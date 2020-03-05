package metier;

public class Ecole {
	
	private String nomEcole;
	private String mailEcole;
	private String adresseEcole;
	private String telephoneEcole;
	private String directeurEcole;
	
	public Ecole(String nomEcole, String mailEcole, String adresseEcole, String telephoneEcole, String directeurEcole) {
		super();
		this.nomEcole = nomEcole;
		this.mailEcole = mailEcole;
		this.adresseEcole = adresseEcole;
		this.telephoneEcole = telephoneEcole;
		this.directeurEcole = directeurEcole;
	}

	public String getNomEcole() {
		return nomEcole;
	}

	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	public String getMailEcole() {
		return mailEcole;
	}

	public void setMailEcole(String mailEcole) {
		this.mailEcole = mailEcole;
	}

	public String getAdresseEcole() {
		return adresseEcole;
	}

	public void setAdresseEcole(String adresseEcole) {
		this.adresseEcole = adresseEcole;
	}

	public String getTelephoneEcole() {
		return telephoneEcole;
	}

	public void setTelephoneEcole(String telephoneEcole) {
		this.telephoneEcole = telephoneEcole;
	}

	public String getDirecteurEcole() {
		return directeurEcole;
	}

	public void setDirecteurEcole(String directeurEcole) {
		this.directeurEcole = directeurEcole;
	}

	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", mailEcole=" + mailEcole + ", adresseEcole=" + adresseEcole
				+ ", telephoneEcole=" + telephoneEcole + ", directeurEcole=" + directeurEcole + "]";
	}
	
	
	
}

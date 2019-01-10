package mr.iscae.modeles;

public class D_etudes {
	private String ID;
	private String nom;
	private String prenom;
	private int Tel;
	public D_etudes(){}
	
	public D_etudes(String nom, String prenom, int tel) {
		this.nom = nom;
		this.prenom = prenom;
		Tel = tel;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	
}

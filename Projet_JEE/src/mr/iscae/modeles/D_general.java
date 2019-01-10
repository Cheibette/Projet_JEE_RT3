package mr.iscae.modeles;

public class D_general {

	private String id;
	private String nom;
	private String prenom;
	private int tel;
	
	public D_general(){}
	
	public D_general(String nom, String prenom, int tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
}

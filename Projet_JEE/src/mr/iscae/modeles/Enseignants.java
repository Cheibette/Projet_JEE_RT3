package mr.iscae.modeles;

public class Enseignants {
	private String id;
	private String nom;
	private String prenom;
	private int tel;
	private String matiere;
	private int creneau;
	
	public Enseignants(){}
	
	public Enseignants(String nom, String prenom, int tel, String matiere) {
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.matiere = matiere;
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
	public int getCreneau() {
		return creneau;
	}
	public void setCreneau(int creneau) {
		this.creneau = creneau;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
}

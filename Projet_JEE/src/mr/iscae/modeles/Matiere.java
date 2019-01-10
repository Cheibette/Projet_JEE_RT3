package mr.iscae.modeles;

public class Matiere {
	private String nom;
	private int credit;
	
	public Matiere(){}
	public Matiere(String nom, int credit) {
		this.nom = nom;
		this.credit = credit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
}

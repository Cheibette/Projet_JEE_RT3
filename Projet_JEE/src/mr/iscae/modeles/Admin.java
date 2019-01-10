package mr.iscae.modeles;
//Administrateur
public class Admin {
	private String login;
	private String motpasse;
	public Admin() {
		
	}
	public Admin(String login, String motpasse) {
		this.login = login;
		this.motpasse = motpasse;
	}
	public String getLogin(){
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotpasse() {
		return motpasse;
	}
	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}
}

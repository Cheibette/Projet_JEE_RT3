package mr.iscae.services;

import java.util.Map;

import mr.iscae.bd.BaseDeDonnees;
import mr.iscae.modeles.Admin;

public class ServiceAdmin {
	private Map<String,Admin> Admins = BaseDeDonnees.getBdAdmin();
	public ServiceAdmin(){
		Admins.put("admin", new Admin("admin","admin"));
	}
	//Fonction pour GET
	public String getAdmin(String login, String motpass){
		Admin adm = Admins.get(login);
		if(adm==null){
			return "Admin n'existe pas !!";
		}else {
			if(!motpass.equals(adm.getMotpasse())){
				return "Mot de passe incorrecte !!";
			}
		}
		return "Bienvenu Admin !!!";
	}
}

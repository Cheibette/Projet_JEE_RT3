package mr.iscae.services;

import java.util.Map;

import mr.iscae.bd.BaseDeDonnees;
import mr.iscae.modeles.D_etudes;

public class ServiceD_etudes {
	private Map<String,D_etudes> d_etudes = BaseDeDonnees.getBdD_etudes();
	
	//Si on veut creer un directeur d'etudes par defaut :
	public ServiceD_etudes(){
		D_etudes D_etu = new D_etudes("MedMahmoud","Kedda",41570757);
		//Les IDs des directeurs d'etudes sont sous forme I164XX 
		D_etu.setID("I"+(16400+d_etudes.size()+1)+"");
		d_etudes.put(D_etu.getID(), D_etu);
	}
	
	//Fonction de GET, pour chercher un directeur d'etdudes
	public D_etudes getD_etudes(String idD_etudes){
		D_etudes D_etud=d_etudes.get(idD_etudes);
		if(D_etud==null){
			D_etudes d_etud = new D_etudes("null","null",0);
			return d_etud;
		}
		return D_etud;
	}
	
	//Fonction pour POST, ajout d'un directeur d'etdudes
	
	public D_etudes ajoutD_etudes(D_etudes d_etud){
		d_etud.setID("I"+(16400+d_etudes.size()+1)+"");
		d_etudes.put(d_etud.getID(), d_etud);
		return d_etud;
	}
	

}

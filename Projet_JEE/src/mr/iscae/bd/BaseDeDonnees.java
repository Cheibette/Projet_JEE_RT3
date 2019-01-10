package mr.iscae.bd;

import java.util.HashMap;
import java.util.Map;

import mr.iscae.modeles.Admin;
import mr.iscae.modeles.D_etudes;
import mr.iscae.modeles.D_general;
import mr.iscae.modeles.Enseignants;
import mr.iscae.modeles.Matiere;

public class BaseDeDonnees {
	private static Map<String,Admin> bdAdmin= new HashMap<>();
	private static Map<String,D_general> bdD_general= new HashMap<>();
	private static Map<String,D_etudes> bdD_etudes= new HashMap<>();
	private static Map<String,Enseignants> bdEnseignants= new HashMap<>();
	private static Map<String,Matiere> bdMatiere= new HashMap<>();
	
	public static Map<String, Admin> getBdAdmin() {
		return bdAdmin;
	}
	public static Map<String, D_general> getBdD_general() {
		return bdD_general;
	}
	public static Map<String, D_etudes> getBdD_etudes() {
		return bdD_etudes;
	}
	public static Map<String, Enseignants> getBdEnseignants() {
		return bdEnseignants;
	}
	public static Map<String, Matiere> getBdMatiere() {
		return bdMatiere;
	}
	
}

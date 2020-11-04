package atelier1de;

//  Zone des imports
import java.util.*;

public class De {
	//constantes de classe
	//static: "de classe", champs rattaché à la classe
	//final : "constant"
	//static final: constanmte de classe
	public static final int NB_MIN_FACES = 3;
	public static final int NB_MAX_FACES = 124;
	public static final int NB_DEFAUT_FACES = 6;
	public static final String NOM_DEFAUT = "Dé n°+";
	
	
	// Variables de classe, elles sont rattachées à la classe, un seul espace mémoire
	public static Random rand = new Random(); // on souhaite utiliser le même génrateur pour tous les dés
	private static int nbDesCrees = 0;
	
	//Définition attributs d'instance = valeur, variable qui définit un objet
	private int nbFaces; //variables d'instance
							// private: concept d'encapsulation, le rendre privé
	private String nom; // on le déclare privé pour le protéger
	// on aurait pu aussi déclarer le nom
	//public final nom; auquel cas on a pas besoin de méthode getNom()
	
	// Méthodes de classe
	//static = méthode de classe
	public static int getNbDesCrees() {
		return nbDesCrees;
	}
	
	//constructeurs : initialiser l'état d'un objet en lui passant des informations
	public De (int nFaces, String pnom) {
		this.setNbFaces(nFaces);
		nbDesCrees ++;
		if ((pnom != null) && (pnom !="")) {
			nom = pnom;
			
		}else {
			nom = NOM_DEFAUT+nbDesCrees;
			System.err.println("Attention le nom doit être non null et non vide");
		}
	}
	//On appelle le constructeur le plus complet pour définir les constructeurs
	public De() {
		this(NB_DEFAUT_FACES,null); //appeler une constance, avant null -> NOM_DEFAUT
	
	}
	// Accesseurs et modificateurs : getter et setter
	//Accesseurs
	public int getNbFaces() {
		return nbFaces;
	}
	public String getNom() {
		return nom;
	}
	//Méthodes d'instances
	//Question 5: lancé de dé
	public int lancer() {
		int result;
		result = 1+rand.nextInt();
		return result;
	}
	// Question 7: Lancers successifs
	//Surcharge de la méthode lancer
	public int lancer(int nbLancer) {
		int maxDeLancers = 0; //Variable locale à la méthode lancer(int)
		int valLancer;
		for (int i =0;i<nbLancer;i++) {
			valLancer = this.lancer();
			if (valLancer>maxDeLancers) {
				maxDeLancers = valLancer;
			}
		}
		return maxDeLancers;
	}
	
	//Modificateurs
	public void setNbFaces(int nvNbFaces){
		if ((nvNbFaces >= NB_MIN_FACES) && (nvNbFaces<= NB_MAX_FACES)) {
			nbFaces = nvNbFaces;
	} else {
		System.err.println("Attention le nbre de faces doit être compris entre:"+NB_MIN_FACES + "et" + "NB_MAX_FACES");
	}
	}
	
	
	//Methodes héritées de la classe Object
	//Redéfinition de la méthode toString
	public String toString() { //afficher l'adresse mémoire 
		return ("un Dé nommé "  + nom + " à " + nbFaces + " Faces");
	}
	

}

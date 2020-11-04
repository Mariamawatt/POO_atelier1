package atelier1de;

//  Zone des imports
import java.util.*;

public class De {
	//constantes de classe
	//static: "de classe", champs rattach� � la classe
	//final : "constant"
	//static final: constanmte de classe
	public static final int NB_MIN_FACES = 3;
	public static final int NB_MAX_FACES = 124;
	public static final int NB_DEFAUT_FACES = 6;
	public static final String NOM_DEFAUT = "D� n�+";
	
	
	// Variables de classe, elles sont rattach�es � la classe, un seul espace m�moire
	public static Random rand = new Random(); // on souhaite utiliser le m�me g�nrateur pour tous les d�s
	private static int nbDesCrees = 0;
	
	//D�finition attributs d'instance = valeur, variable qui d�finit un objet
	private int nbFaces; //variables d'instance
							// private: concept d'encapsulation, le rendre priv�
	private String nom; // on le d�clare priv� pour le prot�ger
	// on aurait pu aussi d�clarer le nom
	//public final nom; auquel cas on a pas besoin de m�thode getNom()
	
	// M�thodes de classe
	//static = m�thode de classe
	public static int getNbDesCrees() {
		return nbDesCrees;
	}
	
	//constructeurs : initialiser l'�tat d'un objet en lui passant des informations
	public De (int nFaces, String pnom) {
		this.setNbFaces(nFaces);
		nbDesCrees ++;
		if ((pnom != null) && (pnom !="")) {
			nom = pnom;
			
		}else {
			nom = NOM_DEFAUT+nbDesCrees;
			System.err.println("Attention le nom doit �tre non null et non vide");
		}
	}
	//On appelle le constructeur le plus complet pour d�finir les constructeurs
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
	//M�thodes d'instances
	//Question 5: lanc� de d�
	public int lancer() {
		int result;
		result = 1+rand.nextInt();
		return result;
	}
	// Question 7: Lancers successifs
	//Surcharge de la m�thode lancer
	public int lancer(int nbLancer) {
		int maxDeLancers = 0; //Variable locale � la m�thode lancer(int)
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
		System.err.println("Attention le nbre de faces doit �tre compris entre:"+NB_MIN_FACES + "et" + "NB_MAX_FACES");
	}
	}
	
	
	//Methodes h�rit�es de la classe Object
	//Red�finition de la m�thode toString
	public String toString() { //afficher l'adresse m�moire 
		return ("un D� nomm� "  + nom + " � " + nbFaces + " Faces");
	}
	

}

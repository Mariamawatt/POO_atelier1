package atelier1de;

public class TestDe {

	public static void main(String[] args) {
		System.out.println("le nombre de dés crées est:"+De.getNbDesCrees());
		De monDe = new De(12, "De1"); //construction d'une nvelle instance monDe de la classe De
									 // De = constructeur vide
		De autreDe = new De(20, "De2");
		De encoreUn = new De();
		System.out.println("le nombre de dés crées est:"+De.getNbDesCrees());
		//De.nbDesCrees=130;
		/*System.out.println(monDe.nbFaces);
		monDe.nbFaces = 240;
		System.out.println(monDe.nbFaces);*/
		// Tentative d'accès à la constante de classe
		System.out.println("Mon dé est  " + monDe); //on aurait pu ecrire "monDe.toString()"
		System.out.println("Son nombre de faces est" +monDe.getNbFaces());
		System.out.println("L'autre dé est " + encoreUn);
		System.out.println("L'autre dé est " + autreDe.toString());
		System.out.println("La valeur min du nb_faces est: " +De.NB_MIN_FACES);
		//Test du lancer de dé:
		System.out.println("Le lancé du donne:" + monDe.getNbFaces() );

	}

}

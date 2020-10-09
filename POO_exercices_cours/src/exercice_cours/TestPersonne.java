package poo_tp;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Personne p = new Personne("toto", "corse", 1233);
		//Personne pv = new Personne ("tata", "bastia", 5200);
		//Personne nvlle = new Personne ("personne2", "corte", 2000);
		Personne etudiant = new Etudiant ("toutou", "corte", 2500, " etu2020");
		Personne enseignant = new Enseignant ("monsieur", "corte", 3500,  43);
		Universite membres = new Universite	("enseignant");
		//p.nom = "Titi"
		/*p.setNom( "Titi");//p.nom="Titi";
		//p.adresse = "Corte";
		p.setAdresse("Corte");
		//p.salaire = 2000;
		
		
		p.setSalaire(2000);
		p.afficher();
		p.changerAdresse("Ajaccio");
		p.salaireAnnuel();
		p.salaireEstsup1000();
		
		System.out.println("le nom est:" +p.getNom() + "\nl'adresse est:" +p.getAdresse() + "\nle salaire est :" +p.getSalaire());
		System.out.println();
		System.out.println(p.salaireAnnuel());
		System.out.println(p.salaireEstsup1000());
		System.out.println("la masse salariale est: " +p.masseSalariale + " euros");
		//System.out.println("le salaire moyen est : " + p.salairemoyen + " euros");
		System.out.println("résultat = " +nvlle.toString()); //ça marche avec le sans .toString()*/
		System.out.println("nouveau étudiant =" +etudiant.toString());
		System.out.println("nouveau enseignant =" +enseignant);
		System.out.println("nouveau enseignant =" +membres.toString());
		
	}

}

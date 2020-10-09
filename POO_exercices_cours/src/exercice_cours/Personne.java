package poo_tp;

public abstract class Personne {
	private String nom;
	private String adresse;
	private double salaire; 
	static final double SMIC = 1219;
	static double masseSalariale=0;
	static int nbPersonne = 0;
	static double salairemoyen = 0;
	
	
//constructeur
	public Personne(String nom, String adresse, double salaire) {
		this.nom = nom;
		this.adresse = adresse;
		this.salaire = salaire;
		masseSalariale = masseSalariale + salaire;
		salairemoyen = masseSalariale / nbPersonne;
}
	
	//6
	/*public Personne(String nom, double salaire) {
		this.nom = " ";
		this.salaire =salaire;
	}*/
	public String toString() {    //pour afficher l'adresse
	
		return (this.getNom() + ", " + this.getAdresse() + ", " + this.getSalaire());
	}
	
	public void setNom(String nom) {
		this.nom = nom;
		
	}
	public String getNom()  {
		return nom;
		
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
		
	}
	public String getAdresse() {
		return adresse;
		
	}
	public void setSalaire(double salaire) {
		if (salaire < SMIC) {
			this.salaire = SMIC;}
		else {
			this.salaire = salaire;
			System.out.println("le salaire est sup au smic");
		}
		}
		
		
	
	public double getSalaire() {
		return salaire;
		
	}
	
		
	
	public void afficher(){	
		System.out.println(nom + " habite "+ adresse + " et son salaire est "+  salaire);
	
	}
	public void changerAdresse(String nvadresse) {
		adresse = nvadresse;
		
	}
	public double salaireAnnuel() {
		return salaire*12;
	}
	public boolean salaireEstsup1000(){
		if (salaire>1000) {
			System.out.println("Le salaire de Titi est sup à 1000");
		}
		return (this.salaire>1000);
		
	}
	public abstract void sePresenter();

	
	
}

package poo_tp;

public class Enseignant extends Personne {
	private int nbHeures;
	
	
	public Enseignant(String nom, String adresse, double salaire, int nbHeures) {
		super(nom, adresse, salaire);
		this.nbHeures=nbHeures;
	}
	public String toString()
	{
		return super.toString()+
				nbHeures;
		}
	public void sePresenter() {
		System.out.println(this.getNom() + " est un enseignant et il effectue " + this.nbHeures + " de cours");
		
		
	}
	

}

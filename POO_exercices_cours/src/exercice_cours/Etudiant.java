package poo_tp;

public class Etudiant extends Personne{
	String numeroEtudiant;
	public Etudiant(String nom, String adresse, double salaire, String numeroEtudiant) {
		super(nom,adresse,salaire);
		this.numeroEtudiant=numeroEtudiant;
		
		
	}
	//pour afficher le numéro etudiant
	public String toString()
	{
		return super.toString()+
				numeroEtudiant;
		}

	public void sePresenter() {
		System.out.println("je suis " + this.getNom() + " et mon numéro est " + numeroEtudiant);
		
	}
}

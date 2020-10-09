package poo_tp;

import java.util.ArrayList;

public class Universite {
	private String titre;
	private ArrayList<Personne> membres; 
	
	public Universite( String titre) {
		this.titre =titre;
		membres = new ArrayList<Personne>();
	}
	public void ajouterPersonne(Personne p) {
		membres.add(p);
	}
	public String toString()
	{
		return super.toString()+
				titre;
		}
	public void afficherMembres() {
		for (Personne p:membres) {
			p.afficher();
		}
		
	}

}

package atelier3;

import java.util.GregorianCalendar;

public class Manager extends Employe {
	protected Secretaire secretaire;
	
	public Manager (String nom, String prenom, GregorianCalendar dateNaissance, Adresse lAdresse, double salaire, GregorianCalendar dateEmbauche, Secretaire laSecretaire) {
		super(nom, prenom, dateNaissance, lAdresse, salaire, dateEmbauche);
		secretaire = laSecretaire;
	}
	public double augmenterLeSalaire(double pourcentage) {
		this.augmenterLeSalaire(pourcentage +0.5*this.calculAnnuite());
		return salaireEmploye;
	} 
	public void setSecretaire(Secretaire uneSecretaire) {
		secretaire = uneSecretaire;
	}

}
	

package atelier3;
import java.util.*;

public class Employe extends Personne{
	protected final GregorianCalendar dateEmbauche;
	protected double salaireEmploye;
	
	
//constructeurs
	public Employe(String nom, String prenom, GregorianCalendar dateNaissance, Adresse lAdresse, double salaire, GregorianCalendar dateEmbauche) {
		super(nom, prenom, dateNaissance, lAdresse);
		this.salaireEmploye = salaire;
		this.dateEmbauche = dateEmbauche;
		
	}
	public static Employe createEmploye(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse ,float leSalaire, GregorianCalendar laDateembauche) {
		Calendar maintenant = new GregorianCalendar();

		int age = maintenant.get(Calendar.YEAR) - laDate.get(Calendar.YEAR);
		if ((laDate.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))||
				(laDate.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)&&
				laDate.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))){
			age--;
			}
		if(age>=16 && age <=65) {
    		Employe e = new Employe(leNom, lePrenom, laDate, lAdresse , leSalaire, laDateembauche);
    		return e;
    	}
    	
    	else
    		return null;
		

	}
		public double augmenterLeSalaire(double pourcentage) {
			if (pourcentage>0){
			salaireEmploye  = (salaireEmploye * pourcentage)/100;
			}
			
				return salaireEmploye;
			
		}
		public int calculAnnuite () {
			Calendar maintenant = new GregorianCalendar();
			int nombreAnnee = dateEmbauche.get(Calendar.YEAR) - maintenant.get(Calendar.YEAR);
			if ((dateEmbauche.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))||
					(dateEmbauche.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)&&
					dateEmbauche.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH))){
				nombreAnnee--; //décrémentation
			}
			return nombreAnnee;
				
		}

	

}

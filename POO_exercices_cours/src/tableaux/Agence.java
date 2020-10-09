package tableaux;

public class Agence {

	
	String directeur;
	String adresse;
	int nbClients = 0 ;
	Client[] lesClients;
	
	public Agence( String directeur, String adresse) {
	this.directeur= directeur;
	this.adresse=adresse;
	lesClients = new Client[500];
	}
	void ajouterUnClient(Client unClient) {
	lesClients[nbClients] = unClient;
	nbClients ++ ;
	}


}

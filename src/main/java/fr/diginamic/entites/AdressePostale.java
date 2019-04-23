package fr.diginamic.entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostale;
	String ville;
	public int nbDepartements = 103;

	public AdressePostale(int numeroRue, String libelleRue, int codePostale, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostale = codePostale;
		this.ville = ville;
		System.out.println(this.nbDepartements);
	}

}

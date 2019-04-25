package fr.diginamic.TP5.immobilier;

public abstract class Piece {
	int superficie = 0;
	int numEtage = 0;

	public Piece(int superficie, int etage) {
		this.superficie = superficie;
		this.numEtage = etage;
	}

}

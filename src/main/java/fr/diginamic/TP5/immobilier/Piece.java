package fr.diginamic.TP5.immobilier;

public abstract class Piece {

	public Piece(int superficie, int etage) {
		this.superficie = superficie;
		this.numEtage = etage;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

	private int superficie = 0;
	private int numEtage = 0;

}

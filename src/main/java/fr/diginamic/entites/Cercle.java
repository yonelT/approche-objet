package fr.diginamic.entites;

public class Cercle {

	double rayon;

	public Cercle(double pRayon) {
		this.rayon = pRayon;
	}

	public double perimetre() {
		return (2 * Math.PI * rayon);
	}

	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}

}

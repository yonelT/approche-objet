package fr.diginamic.essais;

import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {
		Client cli1 = new Client(1000,"Jack","Joe");
		Client cli2 = new Client(1000,"Johannesson","Bella");
		
		System.out.println(cli1);
		System.out.println(cli2);
		

	}

}

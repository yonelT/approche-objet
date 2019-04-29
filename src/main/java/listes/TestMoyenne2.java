package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMoyenne2 {

	public static void main(String[] args) {
		Moyenne note = new Moyenne();
		List<Double> list = new ArrayList<Double>();
		double somme = 0, n = 0;

		list.add(new Double(5));
		list.add(new Double(7));

		Iterator<Double> iter = list.iterator();

		while (iter.hasNext()) {
			int i = 0;
			Double num = iter.next();
			somme = somme + list.get(i);
			i++;

		}

		System.out.println(somme);

	}

}

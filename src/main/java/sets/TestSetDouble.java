package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Set<Double> set = new HashSet<Double>();

		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		set.add(13.3);

		for (Double index : set) {
			System.out.println(index);
		}
	}
}

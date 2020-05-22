package CZ.Tidrich.C2a.HaldyFinal;

import java.util.Random;

import cz.tidrich.c2a.haldy.halda;

public class Main {

	public static void main(String[] args) {
		Random R = new Random();
		halda h = new halda();
		for (int i = 0; i < 100; i++) {
			int rnd = R.nextInt(100);
			h.insert(rnd);
		}
		System.out.println(h);
		System.out.println("Poèet Prvkù v haldì: " + h.size());
		System.out.println("nejmenší prvek v haldì: " + h.nejmensi());
		System.out.println("odstranìný nejmenší prvek haldy:" + h.odstranitMin());
		System.out.println(h);

	}

}

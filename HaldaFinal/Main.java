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
		System.out.println("Po�et Prvk� v hald�: " + h.size());
		System.out.println("nejmen�� prvek v hald�: " + h.nejmensi());
		System.out.println("odstran�n� nejmen�� prvek haldy:" + h.odstranitMin());
		System.out.println(h);

	}

}

package cz.tidrich.c2a.haldy;

public class Main {

	public static void main(String[] args) {
		halda h = new halda();
		h.insert(5);
		System.out.println(h);
		h.insert(3);
		System.out.println(h);
		h.insert(9);
		System.out.println(h);
		h.insert(8);
		System.out.println(h);
		h.insert(6);
		System.out.println(h);
		h.insert(2);
		System.out.println(h);
		h.insert(4);
		System.out.println(h);
		System.out.println("Poèet prvkù v haldì: " + h.size());
		System.out.println("Nejmenší prvek v haldì: " + h.nejmensi());
		System.out.println("odstraòený prvek z haldy: " + h.odstranitMin());
		System.out.println(h);
	}

}

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
		System.out.println("Po�et prvk� v hald�: " + h.size());
		System.out.println("Nejmen�� prvek v hald�: " + h.nejmensi());
		System.out.println("odstra�en� prvek z haldy: " + h.odstranitMin());
		System.out.println(h);
	}

}

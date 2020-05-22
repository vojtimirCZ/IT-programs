package cz.tidrich.c2a.haldy;

import java.util.Arrays;

public class halda {
	int[] pole;
	int velikost = 0;

	public int getParent(int i) {
		if (i % 2 == 0)
			return (i - 1) / 2;
		return i / 2;
	}

	public int getLeftChild(int i) {
		return 2 * i + 1;
	}

	public int getRightChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int v) {
		if (velikost <= 0) {
			velikost = 1;
			pole = new int[16];
			pole[velikost - 1] = v;
		} else {
			if (velikost >= pole.length) {
				int[] pole2 = new int[pole.length * 2];
				for (int i = 0; i < pole.length; i++)
					pole2[i] = pole[i];
				pole = pole2;
			}
			pole[velikost] = v;
			int Sindex = velikost;
			velikost++;
			while (Sindex != 0 && pole[Sindex] < pole[getParent(Sindex)]) {
				int temp = pole[getParent(Sindex)];
				pole[getParent(Sindex)] = pole[Sindex];
				pole[Sindex] = temp;
				Sindex = getParent(Sindex);
			}
		}

	}

	public int nejmensi() {

		return pole[0];
	}

	public int odstranitMin() {
		int min = nejmensi();

		for (int n = 0; n < velikost - 1; n++) {
			pole[n] = pole[n + 1];
		}
		velikost--;
		pole[velikost] = 0;
		int Sindex = velikost - 1;
		for (int n = 0; n < velikost; n++) {
			if (pole[n] < pole[getParent(n)]) {
				int temp = pole[getParent(n)];
				pole[getParent(n)] = pole[n];
				pole[n] = temp;
			}
		}

		return min;
	}

	public int size() {
		return velikost;
	}

	public String toString() {
		String s = "";
		s += "[";
		for (int i = 0; i < velikost; i++)
			s += pole[i] + (i < velikost - 1 ? "," : "");
		s += "]";
		return s;

	}

}

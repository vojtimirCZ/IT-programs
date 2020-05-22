import java.util.Scanner;

/*zapojen� internet?
 zapojen� monitor?
 nainstalovan� syst�m?
 dostupn� server?
 voln� m�sto v �lo�isti?
 dostate�n� v�kon?
  */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String odpoved = "";
		boolean opak = true;
		System.out.println("Dobr� den,");
		System.out.println("ChatBot V��a IT poradny k va�im slu�b�m");

		while (opak) {
			System.out.println();
			System.out.println("M�te za��zen� zapojen� v proudu?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("T�m to bude, zapojte za��zen� a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("zkusili jste to vypnout a zapnout?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("T�m to bude, restartujte za��zen� a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te nainstalovan� opera�n� syst�m?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, nainstalujte opera�n� syst�m a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te P�ipojen� monitor?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("T�m to bude, p�ipojte monitor a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te monitor zapojen� do grafik� karty?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, p�ipojte monitor do grafick� karty a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te za��zen� p�ipojen� k internetu?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, p�ipojte za��zen� k internetu a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te dostatek voln�ho m�sta v �lo�i�ti?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, uvoln�te m�sto v �lo�i�ti, pop��pad� zvy�te kapacitu �lo�i�t� a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Je voln� m�sto na serveru?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("T�m to bude, je zde n�kolik �e�en�.");
				System.out.println("1) po�kejte ne� se n�jak� m�sto uvoln�");
				System.out.println("2) po��dejte o zv�t�en� kapacity");
				System.out.println("3) najd�te jin� server kde je von� m�sto");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M� v� po��ta� dostate�n� v�kon??");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("T�m to bude, bohu�el, zde je �e�en�m pouze upgrade va�eho PC.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M�te s�r�vn� a aktu�l� ovlada�e CPU a grafick� karty?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, st�hn�te si spr�vn� nebo nejnov�j�� ovlada�e a v�e bude fungovat. Pokud ne p�ij�t� znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("M� tato aplikace podporu pro v� opera�n� syst�m?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme d�l . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"T�m to bude, bu� je v� opera�n� syst�m zastaral� a pot�ebuje upgrade nebo je zastaral� aplikace a v tom p��pad� ji� nen� mo�n� j� pou��t");
				System.exit(0);
			} else {
				System.err.println("Idiote, m� napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // �ek� to 10 milisekund, aby se nebugovali errorov� v�pisy s norm�ln�mi
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		System.out.println("pokud v�m ani jedno �e�en� nepomohlo obrat�� se na na�e IT specialisty:");
		System.out.println("1) 751 658 126");
		System.out.println("2) itporadna@volnz.cz");
		System.out.println("3) P�ij�te osobn� na adresu: mrdn�kova 12");
		System.out.println("hezk� den p�eje ChatBot V��a z IT poradny");

	}
}
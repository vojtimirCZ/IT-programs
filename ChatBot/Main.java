import java.util.Scanner;

/*zapojenı internet?
 zapojenı monitor?
 nainstalovanı systém?
 dostupnı server?
 volné místo v úloisti?
 dostateènı vıkon?
  */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String odpoved = "";
		boolean opak = true;
		System.out.println("Dobrı den,");
		System.out.println("ChatBot Váòa IT poradny k vašim slubám");

		while (opak) {
			System.out.println();
			System.out.println("Máte zaøízení zapojené v proudu?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("Tím to bude, zapojte zaøízení a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
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
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("Tím to bude, restartujte zaøízení a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte nainstalovanı operaèní systém?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, nainstalujte operaèní systém a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte Pøipojenı monitor?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("Tím to bude, pøipojte monitor a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte monitor zapojenı do grafiké karty?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, pøipojte monitor do grafické karty a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte zaøízení pøipojené k internetu?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, pøipojte zaøízení k internetu a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte dostatek volného místa v úloišti?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, uvolnìte místo v úloišti, popøípadì zvyšte kapacitu úloištì a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Je volné místo na serveru?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("Tím to bude, je zde nìkolik øešení.");
				System.out.println("1) poèkejte ne se nìjaké místo uvolní");
				System.out.println("2) poádejte o zvìtšení kapacity");
				System.out.println("3) najdìte jinı server kde je voné místo");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Má váš poèítaè dostateènı vıkon??");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println("Tím to bude, bohuel, zde je øešením pouze upgrade vašeho PC.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Máte súrávné a aktuálí ovladaèe CPU a grafické karty?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, stáhnìte si správné nebo nejnovìjší ovladaèe a vše bude fungovat. Pokud ne pøijïtì znovu.");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		while (opak) {
			System.out.println();
			System.out.println("Má tato aplikace podporu pro váš operaèní systém?");
			System.out.println("ano/ne");
			odpoved = sc.nextLine();

			if (odpoved.equalsIgnoreCase("ano")) {
				System.out.println("Tak se posuneme dál . . .");
				opak = false;
			} else if (odpoved.equalsIgnoreCase("ne")) {
				System.out.println(
						"Tím to bude, buï je váš operaèní systém zastaralı a potøebuje upgrade nebo je zastaralá aplikace a v tom pøípadì ji není moné jí pouít");
				System.exit(0);
			} else {
				System.err.println("Idiote, máš napsat ANO nebo NE.");
				try {
					Thread.sleep(10); // èeká to 10 milisekund, aby se nebugovali errorové vıpisy s normálními
				} catch (InterruptedException e) {
				}
			}
		}

		odpoved = "";
		opak = true;

		System.out.println("pokud vám ani jedno øešení nepomohlo obratì se na naše IT specialisty:");
		System.out.println("1) 751 658 126");
		System.out.println("2) itporadna@volnz.cz");
		System.out.println("3) Pøijïte osobnì na adresu: mrdníkova 12");
		System.out.println("hezkı den pøeje ChatBot Váòa z IT poradny");

	}
}
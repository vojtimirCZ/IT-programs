import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int kon = 1;
		while (kon == 1) {

			double c1 = 0;
			int try1 = 1;
			while (try1 == 1) {
			
				try {
					System.out.print("Zadejte prví èíslo: ");
					Scanner scan1 = new Scanner(System.in);
					c1 = scan1.nextDouble();
					try1 = 2;
				} catch (Exception e) {
					try1 = 1;
				}

			}

			System.out.println(" ");

			int try3 = 1;
			String o1 = "+";
			while (try3 == 1) {

				System.out.print("Zadejte operátor (+, -, *, /, m mocnina, o odmocnina): ");
				Scanner scan2 = new Scanner(System.in);
				o1 = scan2.nextLine();

				switch (o1) {

				case "+":
					try3 = 2;
					break;

				case "-":
					try3 = 2;
					break;

				case "*":
					try3 = 2;
					break;

				case "/":
					try3 = 2;
					break;

				case "m":
					try3 = 2;
					break;

				case "o":
					try3 = 2;
					break;

				default:
					try3 = 1;
				}

			}

			System.out.println(" ");

			switch (o1) {
			case "m":
				System.out.print("Zadejte exponent: ");
				break;

			case "o":
				System.out.print("Zadejte kolikátou odmocninu chcete: ");
				break;

			default:
				System.out.print("Zadejte druhé èíslo: ");
				break;
			}

			double c2 = 0;
			int try2 = 1;
			while (try2 == 1) {

				try {

					Scanner scan3 = new Scanner(System.in);
					c2 = scan3.nextDouble();
					try2 = 2;
				} catch (Exception e) {
					try2 = 1;
				}

			}

			System.out.println(" ");
			System.out.print(c1 + " " + o1 + " " + c2 + " = ");

			switch (o1) {
			case "+":
				System.out.println(c1 + c2);
				break;

			case "-":
				System.out.println(c1 - c2);
				break;

			case "*":
				System.out.println(c1 * c2);
				break;

			case "/":
				if (c2 == 0) {
					System.out.println("Nelze dìlit nulou!");
					break;
				} else {
					System.out.println(c1 / c2);
					break;
				}
			case "m":
				if (c2 == 0) {
					System.out.println("1");
					break;
				} else {
					double moc = Math.pow(c1, c2);
					System.out.println(moc);
					break;
				}
			case "o":
				if (c2 <= 0) {
					System.out.println("Nelze mít nultou èi menší odmocninu!");
					break;
				} else {
					double odm = Math.pow(c1, 1 / c2);
					System.out.println(odm);
					break;
				}

			}

			System.out.println(" ");
			int k1 = 0;
			int try4 = 1;
			while (try4 == 1) {

				try {

					System.out.print("Opakovat? (Ano = 1, Ne = 2): ");
					Scanner scan4 = new Scanner(System.in);
					k1 = scan4.nextInt();
					try4 = 2;
				} catch (Exception e) {
					try4 = 1;
				}

			}

			if (k1 != 1) {

				System.out.println(" ");
				System.out.println("Nashledanou...");
				kon = 2;
			} else if (k1 == 1) {

				System.out.println(" ");
				System.out.println("A znovu...");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}

		}

	}

}
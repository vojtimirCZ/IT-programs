import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String volba = "";

		Scanner sc = new Scanner(System.in);

		Queue<String> Q = new Queue<String>();
		Stack<String> S = new Stack<String>();

		while (volba.equalsIgnoreCase("KONEC") != true) {
			System.out.println("OBJEDNAT/ZADAT/ODEBRAT ÚKOL/ODEBRAT OBJEDNÁVKU");
			System.out.println("Pro ukonèení zadejte KONEC");
			volba = sc.nextLine();

			if (volba.equalsIgnoreCase("OBJEDNAT")) {
				System.out.println("co chcete objednat?");
				String obj = sc.nextLine();
				Q.push(obj);
			} else if (volba.equalsIgnoreCase("ZADAT")) {
				System.out.println("zadejte úkol");
				String uk = sc.nextLine();
				S.push(uk);
			} else if (volba.equalsIgnoreCase("ODEBRATU")) {
				S.pop();
				System.out.println(S);
			} else if (volba.equalsIgnoreCase("ODEBRATO")) {
				Q.pop();
				System.out.println(Q);
			} else if (volba.equalsIgnoreCase("KONEC")) {
				System.out.println(Q);
				System.out.println(S);
			}

		}

	}

}

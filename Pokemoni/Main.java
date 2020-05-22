import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static double[] getDifference(String bigger, String smaller) {
		int [] dnyVMesicich = new int[12];
		dnyVMesicich[0] = 31;
		dnyVMesicich[1] = 28;
		dnyVMesicich[2] = 31;
		dnyVMesicich[3] = 30;
		dnyVMesicich[4] = 31;
		dnyVMesicich[5] = 30;
		dnyVMesicich[6] = 31;
		dnyVMesicich[7] = 31;
		dnyVMesicich[8] = 30;
		dnyVMesicich[9] = 31;
		dnyVMesicich[10] = 30;
		dnyVMesicich[11] = 31;
		int [] cInfo= new int[6];
		int [] pInfo= new int[6];
		double [] vysledky= new double[8];
		boolean prestupny = false;
	
		try {
		Pattern p = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Matcher m = p.matcher(bigger);
		while (m.find()) {
			String pom = m.group();
			String[] pole =  pom.split("/");
			cInfo[0] = Integer.valueOf(pole[2]);
			cInfo[1] = Integer.valueOf(pole[1]);
			cInfo[2] = Integer.valueOf(pole[0]);
		}
		
		Pattern p2 = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
		Matcher m2 = p2.matcher(bigger);
		while (m2.find()) {
			String pom = m2.group();
			String[] pole =  pom.split(":");
			cInfo[3] = Integer.valueOf(pole[0]);
			cInfo[4] = Integer.valueOf(pole[1]);
			cInfo[5] = Integer.valueOf(pole[2]);
		}
		Pattern p3 = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Matcher m3 = p3.matcher(smaller);
		while (m3.find()) {
			String pom = m3.group();
			String[] pole =  pom.split("/");
			pInfo[0] = Integer.valueOf(pole[2]);
			pInfo[1] = Integer.valueOf(pole[1]);
			pInfo[2] = Integer.valueOf(pole[0]);
		}
		
		Pattern p4 = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
		Matcher m4 = p4.matcher(smaller);
		while (m4.find()) {
			String pom = m4.group();
			String[] pole =  pom.split(":");
			pInfo[3] = Integer.valueOf(pole[0]);
			pInfo[4] = Integer.valueOf(pole[1]);
			pInfo[5] = Integer.valueOf(pole[2]);
		}
		FileOutputStream fos2 = new FileOutputStream("Date.dat");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(bigger);
		}
		catch (IOException e) {
		}
		if (cInfo[0] % 4 == 0) {
			prestupny = true;
		}
		vysledky[0] = cInfo[0] - pInfo[0];
		vysledky[1] = cInfo[1] - pInfo[1];
		vysledky[2] = cInfo[2] - pInfo[2];
		vysledky[3] = cInfo[3] - pInfo[3];
		vysledky[4] = cInfo[4] - pInfo[4];
		vysledky[5] = cInfo[5] - pInfo[5];
		for (int i = 5; i >= 1; i--) {
			if (vysledky[i] < 0) {
				if (i == 5 || i == 4) {
					vysledky[i] = vysledky[i] + 60;
					vysledky[i - 1]--;
				}
				else if (i == 3) {
					vysledky[i] = vysledky[i] + 24;
					vysledky[i - 1]--;
				}
				else if (i == 2) {
					if (pInfo[1] - 1 == 1 && prestupny && pInfo[2] != 29) {
						vysledky[i] = vysledky[i] + dnyVMesicich[pInfo[1] - 1] + 1;
					}
					else {
						vysledky[i] = vysledky[i] + dnyVMesicich[pInfo[1] - 1];
					}
					vysledky[i - 1]--;
				}
				else if (i == 1) {
					vysledky[i] = vysledky[i] + 12;
					vysledky[i - 1]--;
				}
			}
		}
		for (int i = pInfo[0]; i <= cInfo[0]; i++) {
			if (i % 4 == 0) {
				vysledky[6]++;
			}
		}
		return vysledky;
		
	}
			
	public static void setRunTime(int mnozstvi) {
		try {
			FileOutputStream fos2 = new FileOutputStream("RunTime.dat");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(mnozstvi);
		}
		catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		String currentDate = "";
		String previousDate = "";
		double[] rozdily = new double[8];
		int runTime = 0;
		TreeSet<Pokemon> kolekce = new TreeSet<Pokemon>();
		TreeSet<Pokemon> kolekce2 = new TreeSet<Pokemon>();
		kolekce.add(new Pokemon("MEWTWO","Genetický Pokémon"));
		kolekce.add(new Pokemon("REGIGIGAS","Colossal Pokémon"));
		kolekce.add(new Pokemon("GARCHOMP","Mach Pokémon"));
		for(Pokemon p2 : kolekce) {
			System.out.println(p2.jmeno+" / "+p2.druh);
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("Pokemons.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(kolekce);
			
			FileInputStream fis = new FileInputStream("Pokemons.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			kolekce2 = (TreeSet<Pokemon>) ois.readObject();
			
			
			FileInputStream fis2 = new FileInputStream("RunTime.dat");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			runTime = (int)ois2.readObject();
			runTime++;
			
			FileOutputStream fos2 = new FileOutputStream("RunTime.dat");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(runTime);
		}
		catch (Exception e) {
		}
		System.out.println();
		for(Pokemon p2 : kolekce2) {
			System.out.println(p2.jmeno+" / "+p2.druh);
		}
		//setRunTime(-1);
		System.out.println();
		System.out.println("Poèet pøedchozích spuštìní: " + runTime);
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			currentDate = format.format(date);
			
			FileInputStream fis2 = new FileInputStream("Date.dat");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			previousDate = (String)ois2.readObject();
			
			//rozdily = getDifference(currentDate, previousDate);
			rozdily = getDifference(currentDate, "23/02/1600 12:36:57");
		}
		catch (IOException | ClassNotFoundException e) {
		}
		System.out.println();
		System.out.print("Program naposledy spuštìn pøed ");
		if (rozdily[0] != 0) {
			System.out.print((int)rozdily[0] + " lety (z toho " + (int)rozdily[6] + " pøestupnými), ");
		}
		if (rozdily[1] != 0) {
			System.out.print((int)rozdily[1] + " mìsíci, ");
		}
		if (rozdily[2] != 0) {
			System.out.print((int)rozdily[2] + " dny, ");
		}
		if (rozdily[3] != 0) {
			System.out.print((int)rozdily[3] + " hodinami, ");
		}
		if (rozdily[4] != 0) {
			System.out.print((int)rozdily[4] + " minutami, ");
		}
		System.out.print((int)rozdily[5] + " sekundami. ");
		
	}

}
 	
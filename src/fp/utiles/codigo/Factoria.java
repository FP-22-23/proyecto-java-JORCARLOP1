package fp.utiles.codigo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Factoria {
	
	static List<GoldDigger> goldDiggers;
	public static void main(String[] args) {
		goldDiggers = leerData("data/data.csv");
		for (GoldDigger goldDigger : goldDiggers) {
			System.out.println(goldDigger);
		}
	}

	public static int numElementos() {
		return goldDiggers.size();
	}
	
	public static List<GoldDigger> leerData(String nombreFichero) {
		List<GoldDigger> res = new ArrayList<GoldDigger>();
		try {
			List<String> lineas = Files.readAllLines(Paths.get(nombreFichero));
			for (String linea : lineas) {
				
				String[] partes = linea.split(",");
				if (partes[0].equals("num")) {
					continue;
				}
				
				// parsear linea
				Integer num = Integer.parseInt(partes[0].trim());
				LocalDate date = LocalDate.parse(partes[1].trim());
				Pelo cheveux = Pelo.valueOf(partes[2].trim().toUpperCase());
				Integer age = (int) Double.parseDouble(partes[3].trim());
				Integer exp = (int) Double.parseDouble(partes[4].trim());
				Double salaire = Double.parseDouble(partes[5].trim());
				Sexo sexe = Sexo.valueOf(partes[6]);
				String diplome = partes[7].trim();
				String specialite = partes[8].trim();
				Double note = Double.parseDouble(partes[9].trim());
				String dispo =  partes[10].trim();
				String embauche = partes[11].trim();
				String paises = partes[12].trim();

				res.add(new GoldDigger(num, date, cheveux, age, exp, salaire, sexe, diplome, specialite, note, dispo, embauche, paises)); // Constructor a partir de String
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
}

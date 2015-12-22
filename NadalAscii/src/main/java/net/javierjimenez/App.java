package net.javierjimenez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author alumne1daw
 *
 */
public class App {

	/**
	 * Variable que ens enllaça a l'arxiu de text a llegir.
	 */
	private static String NOM_FITXER = "/visites.txt";

	/**
	 * Metode principal del programa, on llegirem l'arxiu de text
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = null;
		Comprobar casas;

		/**
		 * Creem un bloq try/catch/finally per capturar les excepcions a l'hora
		 * de llegir el fitxer.
		 */
		try {

			String casa;

			br = new BufferedReader(new InputStreamReader(App.class.getResource(NOM_FITXER).openStream()));

			while ((casa = br.readLine()) != null) {

				casas = new Comprobar(casa);

				System.out.println(casas.visitasCasas());
			}

		} catch (IOException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null) br.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}

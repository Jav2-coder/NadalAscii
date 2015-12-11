package net.javierjimenez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {

	private static String NOMBRE_FICHERO = "/visitas.txt";
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		Comprobar casas = new Comprobar();

		try {

			String casa;

			br = new BufferedReader(new InputStreamReader(App.class.getResourceAsStream(NOMBRE_FICHERO)));

			while ((casa = br.readLine()) != null) {

				System.out.println(casas.visitasCasas(casa));
			}

		} catch (IOException e) {

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

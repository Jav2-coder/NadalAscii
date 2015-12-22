package net.javierjimenez;

/**
 * 
 * @author alumne1daw
 *
 */
public class Comprobar {

	private String Noel = "*<]:-DOo";
	private String Ren = ">:o)";
	private String Elf = "<]:-D";
	private String casa;

	/**
	 * Constructor principal de l'objecte Comprobar
	 * 
	 * @param c String que conte una linia del fitxer llegit
	 */
	public Comprobar(String c) {

		casa = c;

	}

	/**
	 * Metode per comprobar qui visita cada casa i quantes vegades
	 * 
	 * @return String que conté la informació de qui visita 
	 * i quantes vegades ho fa.
	 */
	public String visitasCasas() {

		String quiVisita = "";

		int pareNoel = busquedaNavidad(Noel);
		int rens = busquedaNavidad(Ren);
		int elfs = busquedaNavidad(Elf);

		if (pareNoel == 0 && rens == 0 && elfs == 0) {

			return "-";

		} else {

			if (pareNoel > 0) {

				quiVisita = "Pare Noel(" + pareNoel + ") ";
				elfs = elfs - pareNoel;

			}
			if (rens > 0) {

				quiVisita = quiVisita + "Ren(" + rens + ") ";

			}
			if (elfs > 0) {

				quiVisita = quiVisita + "Elf(" + elfs + ") ";

			}
		}

		return quiVisita;
	}

	/**
	 * Metode per buscar en cada linia del fitxer si hi ha
	 * alguna de les cadenes Ascii que busquem.
	 * 
	 * @param busqueda String que conté la cadena Ascii
	 * per buscar en el fitxer.
	 * 
	 * @return Int que conté el total de vegades que hi ha
	 * la cadena Ascii dins de la linia llegida del fitxer.
	 */
	private int busquedaNavidad(String busqueda) {

		int contador = 0;
		int posicio = 0;
		int pos = 0;

		while (pos >= 0) {
			pos = casa.indexOf(busqueda, posicio);
			posicio = pos + busqueda.length();

			if (pos > 0)
				contador++;
		}
		return contador;
	}
}

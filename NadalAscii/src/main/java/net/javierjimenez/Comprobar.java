package net.javierjimenez;

public class Comprobar {

	private String Noel = "*<]:-DOo";
	private String Reno = ">:o)";
	private String Elfo = "<]:-D";
	private String casa;

	public Comprobar(String c) {

		casa = c;
		
	}

	public String visitasCasas() {

		String quienVisita = "";

		int papaNoel = busquedaNavidad(Noel);
		int renos = busquedaNavidad(Reno);
		int elfos = busquedaNavidad(Elfo);
		
		if (papaNoel == 0 && renos == 0 && elfos == 0) {
			
			return "-";
			
		} else {

			if (papaNoel > 0) {

				quienVisita = "Papa Noel(" + papaNoel + ") ";
				elfos = elfos - papaNoel;

			}
			if (renos > 0) {

				quienVisita = quienVisita + "Reno(" + renos + ") ";

			}
			if (elfos > 0) {

				quienVisita = quienVisita + "Elfo(" + elfos + ") ";

			}
		}
		
		return quienVisita;
	}

	private int busquedaNavidad(String busqueda) {
		
		int contador = 0;
		int posicio = 0;
		int pos = 0;
		
		while(pos >= 0){
			pos = casa.indexOf(busqueda, posicio);
			posicio = pos + busqueda.length();
			
			if(pos > 0) contador++;
		}
		return contador;
	}
}

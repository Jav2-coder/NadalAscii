package net.javierjimenez;

public class Comprobar {

	private CharSequence Noel = "*<]:-DOo";
	private CharSequence Reno = ">:o)";
	private CharSequence Elfo = "<]:-D";

	public Comprobar() {

	}

	public String visitasCasas(String casa) {

		String quienVisita = "";
		int papaNoel = 0;
		int renos = 0;
		int elfos = 0;

		
		
		if (papaNoel == 0 && renos == 0 && elfos == 0) {
			
			return "-";
			
		} else {

			if (papaNoel > 0) {

				quienVisita = "Papa Noel(" + papaNoel + ") ";

			}
			if (renos > 0) {

				quienVisita = quienVisita + "Reno(" + renos + ") ";

			}
			if (elfos > 0) {

				quienVisita = quienVisita + "Elfo(" + elfos + ") ";

			}
		}
		
		System.out.println(papaNoel + " " + renos + " " + elfos);
		return quienVisita;
	}
}

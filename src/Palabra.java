public class Palabra {

	private char[] PalabraEscondida;

	private String Palabra;

	public Palabra(String p) {
		this.Palabra = p;
		this.PalabraEscondida = new char[p.length()];

		for (int i = 0; i < p.length(); i++) {
			this.PalabraEscondida[i] = '_';

		}
	}

	public boolean PalabraDescubierta() {
		boolean gano = true;
		for (int i = 0; i < PalabraEscondida.length; i++) {
			if (PalabraEscondida[i] == '_') {
				gano = false;
			}
		}
		return gano;
	}

	public boolean ValidarLetra(char l) {
		boolean letraExiste = false;
		char[] PalabraChar = this.Palabra.toCharArray();

		for (int i = 0; i < PalabraChar.length; i++) {

			if (PalabraChar[i] == l) {
				letraExiste = true;
				this.PalabraEscondida[i] = l;

			}

		}
		return letraExiste;

	}

	public String toString() {
		String palabraFinal = "";

		for (int i = 0; i < this.PalabraEscondida.length; i++) {
			palabraFinal += this.PalabraEscondida[i] + " ";

		}

		return palabraFinal;

	}

}

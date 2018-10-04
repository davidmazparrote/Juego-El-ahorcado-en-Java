


public class GeneradordePalabras {
	
	private static String[] palabras = { "hola", "auto", "casa", 
			"moto", "computadora", "celular", "mesa", "murcielago",
			"perro", "gato","lobo","muerte","teclado","equipo"};

	public static Palabra devolverPalabra() {

		int num = (int) (Math.random() * 10);

		String p = palabras[num];
		return new Palabra(p);

	}

}




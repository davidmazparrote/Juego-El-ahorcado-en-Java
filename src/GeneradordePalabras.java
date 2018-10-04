


public class GeneradordePalabras {
	
	private static String[] palabras = { "hola", "auto", "casa", 
			"moto", "computadora", "celular", "mesa", "murcielago",
			"perro", "gato"};

	public static Palabra devolverPalabra() {

		int num = (int) (Math.random() * 10);

		String p = palabras[num];
		return new Palabra(p);

	}

}





import java.util.Scanner;

public class program {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("******¡¡¡Bienvenido al ahorcado!!!*****");
		System.out.println("Ingrese su nombre:");
		String user = s.nextLine();

		System.out.println("Hola" + " " + user + " " + "Comenzemos!!");
		String salir;
		do {
			Palabra p = GeneradordePalabras.devolverPalabra();

			int vidas = 6;
			while (vidas > 0) {
				System.out.println("Ingrese una letra");
				char l = s.nextLine().toCharArray()[0];
				boolean b = p.ValidarLetra(l);
				if (!b)
					vidas--;
				System.out.println(p);
				if (p.PalabraDescubierta()) {
					break;
				}
			}

			if (vidas == 0) {
				System.out.println("Fin de la partida");

			} else {
				System.out.println("Bien hecho!! Ganaste!!");
			}

			System.out.println("Para salir presiona la letra s /// o una tecla cualquiera para seguir Jugando");
			salir = s.nextLine();
		} while (!(salir.equals("s")));

	}

}
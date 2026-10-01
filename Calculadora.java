package miprimerprograma;

import java.util.Scanner;

public class calculadoranotas {

	public static void main(String[] args) {
		PedirNotas();
	}

	public static void PedirNotas() {
		System.out.println("Introduce tu nombre");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();

		System.out.println("Introduce una nota entre 0 y 10");
		int numero1 = teclado.nextInt();

		while (numero1 < 0 || numero1 > 10) {
			System.out.println("el numero no es correcto, tiene que estar entre 0 y 10");
			numero1 = teclado.nextInt();
		}

		System.out.println("Introduce la siguiente nota entre 0 y 10");
		int numero2 = teclado.nextInt();

		while (numero2 < 0 || numero2 > 10) {
			System.out.println("el numero no es correcto, tiene que estar entre 0 y 10");
			numero2 = teclado.nextInt();
		}
		System.out.println("Introduce la ultima nota entre 0 y 10");
		int numero3 = teclado.nextInt();

		while (numero3 < 0 || numero3 > 10) {
			System.out.println("el numero no es correcto, tiene que estar entre 0 y 10");
			numero3 = teclado.nextInt();
		}
		int num4 = (numero1 + numero2 + numero3);
		double media = (num4 / 3);
		if (media < 5) {
			System.out.println("tu media da suspenso deberias estudiar mas");
		} else if (media < 6) {
			System.out.println("tu media da un bien, se podria decir que esta bien");
		} else if (media < 9) {
			System.out.println("tu media es un notable, te haces notar en la clase enorabuena");
		} else {
			System.out.println("ENORABUENA TU MEDIA ES DE SOBRESALIENTE :)!!!! ");
		}

	}
}
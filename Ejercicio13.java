import java.util.*;

public class Ejercicio13 {

	public static void main(String args[]) {
		int opc;
		opc = 0;
		Scanner scanner = new Scanner(System.in);

		while (opc!=3) {
			System.out.println("*** Menú de opciones posibles *** ");
			System.out.println("1. Sumar");
			System.out.println("2. Dividir");
			System.out.println("3. Salir");
			System.out.println("\n");
			System.out.print("Ingrese el numero de la  opcion a selecionar: ");
			opc = scanner.nextInt();

			if (opc==1) {
				//Variables locales de Opcion 2
				double suma;
				double n1, n2;

				System.out.print("Ingrese el Primer número de la suma: ");
				n1 = scanner.nextDouble();
				System.out.print("Ingrese el Segundo numero de la suma: ");
				n2 = scanner.nextDouble();

				suma = n1+n2;
				System.out.println("La suma es: "+suma+".");
				System.out.println("\n");
			} 
			else {
				if (opc==2) {
					//Variables locales de Opcion 2
					double div;
					double dividendo, divisor;

					System.out.print("Ingrese el Dividendo de la división: ");
					dividendo = scanner.nextDouble();
					System.out.print("Ingrese el Divisior de la división: ");
					divisor = scanner.nextDouble();
					if (divisor==0) {
						System.out.println("No se puede dividir entre 0.");
						System.out.println("\n");
					} 
					else {
						div = dividendo/divisor;
						System.out.println("El cociente de la división es: "+div+".");
						System.out.println("\n");
					}
				} else {
					System.out.println("*** Algoritmo terminado ***");
				}
			}
		}
	}


}


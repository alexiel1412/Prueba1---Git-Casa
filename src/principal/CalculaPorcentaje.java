package principal;
import java.util.Scanner;

public class CalculaPorcentaje
{

	public static void main(String[] args)
	{
		// TODO Esbozo de método generado automáticamente
		
		Scanner teclado = new Scanner (System.in);
		String nombre;
		float precio;
		int descuento;
		float res;
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce el precio: ");
		precio = teclado.nextFloat();
		System.out.println("Introduce el descuento (entero): ");
		descuento = teclado.nextInt();
		
		res = precio - precio * descuento / 100;
		
		System.out.println("A " + nombre + " se le hace un descuento de " + descuento
				+ " % quedando " + res + ".");
		System.out.printf("A %s se le hace un descuento de %d %% quedando %.2f€.\n",
				nombre, descuento, res);
		// %% ---> %  - \% ---> %
		teclado.close();
	}

}

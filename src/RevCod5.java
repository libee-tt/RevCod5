import java.util.Scanner;

/**
 * Este codigo determina si un número es afortunado o no.
 * Un número se considera afortunado si tiene más dígitos de 3, 7, 8 o 9
 * que otros números
 */

public class RevCod5 {
	
	public static void main (String[]args) {
	Scanner s = new Scanner(System.in);
	
    System.out.print("Introduzca un número: ");
    String ni = s.nextLine();
    
    int c = Integer.parseInt(ni);
    
    int afo = 0;
    int noAfo = 0;
    
    int numero = c;
    
    while (numero > 0) {
	  int digito = numero % 10;
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }//else 
      numero /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }//else 
    
    s.close();
	}//main
}//RevCod5

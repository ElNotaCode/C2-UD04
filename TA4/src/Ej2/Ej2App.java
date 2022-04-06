package Ej2;
//Autor Eloi Martorell Martin 06/04/2022

public class Ej2App {

	public static void main(String[] args) {

		//declaramos
		int n;
		double a;
		char c;
		
		//asignamos valor
		n = 2;
		a = 1.2;
		c = 'C';
		
		//mostramos en pantalla
		System.out.println("Variable N = " + n);
		System.out.println("Variable A = " + a);
		System.out.println("Variable C = " + c);
		
		System.out.println(n + " + " + a + " = " + (n+a) );
		System.out.println(n + " - " + a + " = " + (n-a) );
		
		int cValue = c;
		
		System.out.println("Valor numérico del carácter a = " + cValue);
		
	}

}

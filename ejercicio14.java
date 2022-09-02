package tarea2;
import java.util.Scanner;
public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double VD1, VD2, VD3 ;
		System.out.println("Escriba las ventas de los departamentos");
		VD1 = entrada.nextDouble();
		VD2 = entrada.nextDouble();
		VD3 = entrada.nextDouble();
		double PORVEN, SALAR;
		System.out.println("Escriba el salario");
		SALAR = entrada.nextInt();
		double SALAR1, SALAR2, SALAR3;
		double TOTVEN = VD1 + VD2 + VD3;
		PORVEN = TOTVEN * 0.33 ;
		if (VD1 > PORVEN) {
			SALAR1 = SALAR + (SALAR *(20.0/100.0));
		}else {
			SALAR1 = SALAR;
		}		
		if (VD2>PORVEN) {
			SALAR2 = SALAR + (SALAR *(20.0/100.0));
		}else {
			SALAR2 = SALAR;
		}
		if (VD3>PORVEN) {
			SALAR3 =  SALAR + (SALAR *(20.0/100.0));
		}else {
			SALAR3 = SALAR;
		}
		System.out.println(" Ventas del departamento 1: " + VD1 );
		System.out.println(" Ventas del departamento 2: " + VD2 );
		System.out.println(" Ventas del departamento 3: " + VD3 );
		System.out.println(" Salario: " + SALAR );
		System.out.println(" Total de ventas: " + TOTVEN );
		System.out.println(" Porcentaje de ventas equivalente al 33% " + PORVEN );
		System.out.println(" Salario departamento 1: " + SALAR1 );
		System.out.println(" Salario departamento 2: " + SALAR2);
		System.out.println(" Salario departamento 3: " + SALAR3 );
	}

}
//melo
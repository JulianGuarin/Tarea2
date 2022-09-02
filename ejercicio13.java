package tarea2;
import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
		Scanner compraycolor = new Scanner(System.in);
		double VALCOMP;
		String COLOR;
		double VALPAG;
		double PDES;
		VALCOMP = compraycolor.nextDouble();
		COLOR = compraycolor.next();
		if (COLOR.equals("BLANCO")){
			PDES = 0;
		}
		else if (COLOR.equals("VERDE")){
			PDES = 10;
		}
		else if (COLOR.equals("AMARILLO")){
			PDES = 25;
		}
		else if (COLOR.equals("AZUL")){
			PDES = 50;
		}
		else {
			PDES = 100;
		}
		VALPAG = VALCOMP -((PDES/100)*VALCOMP);
		System.out.println("EL CLIENTE DEBE PAGAR:$ " + VALPAG);
		System.out.println(" VALCOMP: " + VALCOMP + " COLOR: " + COLOR + " PDES: " + PDES + " VALPAG: " + VALPAG);
		
		
	}
	
}
//melo


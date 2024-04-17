//------------------------Calculadora Simple 8----------------------\\
// 19/09/2021
// Santiago, Chile
// Eddie Casañas
//------------------------------------------------------------------\\

import java.util.*;
public class CalculadoraFull {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		PlantillaCalculadora2 c = new PlantillaCalculadora2();
		String opcion;
		int parseOpcion, repetir, salida = 0;
		
		while(salida == 0) {
			while(true) {
				System.out.println("(1): Suma");
				System.out.println("(2): Resta");
				System.out.println("(3): Multiplicacion");
				System.out.println("(4): Division");
				System.out.println("(5): Potencia");
				System.out.println("(6): Raiz cuadrada");
				System.out.println("(7): Salir");
				try {
					opcion = obj.nextLine();
					parseOpcion = Integer.parseInt(opcion);
					if(parseOpcion < 1 || parseOpcion > 7) {
						System.out.println("Ingrese una opcion valida\n");
						continue;
					}else {
						break;
					}
				}catch(Throwable exc) {
					System.out.println("Ingrese una opcion valida\n");
					continue;
				}
			}
			switch(parseOpcion) {
			case 1:
				repetir = 1;
				while(repetir == 1) {
					c.suma();
					repetir = c.repetir();
				}
				break;
			case 2:
				repetir = 1;
				while(repetir == 1) {
					c.resta();
					repetir = c.repetir();
				}
				break;
			case 3:
				repetir = 1;
				while(repetir == 1) {
					c.multiplicacion();
					repetir = c.repetir();
				}
				break;
			case 4:
				repetir = 1;
				while(repetir == 1) {
					c.division();
					repetir = c.repetir();
				}
				break;
			case 5:
				repetir = 1;
				while(repetir == 1) {
					c.potencia();
					repetir = c.repetir();
				}
				break;
			case 6:
				repetir = 1;
				while(repetir == 1) {
					c.raizCuadrada();
					repetir = c.repetir();
				}
				break;
			case 7:
				salida = 1;
				obj.close();
				break;
			}
			
		}
		
		
	} 

}

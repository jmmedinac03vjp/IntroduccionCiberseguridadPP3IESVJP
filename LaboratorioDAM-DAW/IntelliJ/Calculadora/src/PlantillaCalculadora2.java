//------------------------Plantilla Calculadora 2----------------------\\
// 19/09/2021
// Santiago, Chile
// Eddie Casañas
//------------------------------------------------------------------\\

import java.util.*;
public class PlantillaCalculadora2 {
	Scanner obj = new Scanner(System.in);
	GenerarArrayInt arrayObj = new GenerarArrayInt();
	double[] numeros;
	String numero1, numero2, opcion;
	double parseNumero1, parseNumero2;
	int parseOpcion;
	
	public void suma() {
		double suma = 0;
		System.out.println("SUMA");
		numeros = arrayObj.devuelveArray();
		for(int i = 0; i < numeros.length; i++) {
			if(i == numeros.length - 1) {
				System.out.print(numeros[i] + " = ");
				suma += numeros[i];
			}else {
				System.out.print(numeros[i] + " + ");
				suma += numeros[i];
			}
			
		}
		System.out.println(suma);

	}
	public void resta() {
		double resta;
		System.out.println("RESTA");
		numeros = arrayObj.devuelveArray();
		resta = numeros[0];
		System.out.print(numeros[0] + " - ");
		for(int i = 1; i < numeros.length; i++) {
			
			if(i == numeros.length - 1) {
				System.out.print(numeros[i] + " = ");
				resta -= numeros[i];
			}else {
				System.out.print(numeros[i] + " - ");
				resta -= numeros[i];
			}
		}
		System.out.println(resta);
	}
	public void multiplicacion() {
		double multiplicacion = 1;
		numeros = arrayObj.devuelveArray();
		System.out.println("MULTIPLICACION");
		for(int i = 0; i < numeros.length; i++) {
			if(i == numeros.length - 1) {
				System.out.print(numeros[i] + " = ");
				multiplicacion *= numeros[i];
			}else {
				System.out.print(numeros[i] + " * ");
				multiplicacion *= numeros[i];
			}
		}
		System.out.println(multiplicacion);
	}
	public void division() {
		double division;
		System.out.println("DIVISION");
		//UTILIZAR devuelveArray2. ESPECIFICO PARA DIVISIONES
		numeros = arrayObj.devuelveArray2();
		division = numeros[0];
		System.out.print(numeros[0] + " / ");
		for(int i = 1; i < numeros.length; i++) {
			if(i == numeros.length - 1) {
				System.out.print(numeros[i] + " = ");
				division /= numeros[i];
			}else {
				System.out.print(numeros[i] + " / ");
				division /= numeros[i];
			}
		}
		System.out.println(division);
	}
	public void potencia() {
		while(true) {
			System.out.println("POTENCIA/EXPONENTE DE UN NUMERO");
			System.out.println("Ingrese el primer numero: ");
			try {
				numero1 = obj.nextLine();
				parseNumero1 = Double.parseDouble(numero1);
			}catch(Throwable exc) {
				System.out.println("Ingrese un numero valido\n");
				continue;
			}
			System.out.println("Ingrese el segundo numero: ");
			try {
				numero2 = obj.nextLine();
				parseNumero2 = Double.parseDouble(numero2);
				System.out.println(parseNumero1 + " ^ " 
				+ parseNumero2 + " = " + (Math.pow(parseNumero1, parseNumero2)));
			}catch(Throwable exc) {
				System.out.println("Ingrese un numero valido\n");
				continue;
			}
			break;
		}
	}
	public void raizCuadrada() {
		while(true) {
			System.out.println("RAIZ CUADRADA");
			System.out.println("Ingrese el numero: ");
			try {
				numero1 = obj.nextLine();
				parseNumero1 = Double.parseDouble(numero1);
				System.out.println("Raiz cuadrada de " + parseNumero1 
						+ " = " + Math.sqrt(parseNumero1));
			}catch(Throwable exc) {
				System.out.println("Ingrese un numero valido\n");
				continue;
			}
			break;
		}
	}
	public int repetir() {
		while(true) {
			System.out.println("(1): Repetir el programa");
			System.out.println("(2): Volver al menu principal");
			try {
				opcion = obj.nextLine();
				parseOpcion = Integer.parseInt(opcion);
				if(parseOpcion != 1 && parseOpcion != 2) {
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
		return parseOpcion;
	}
}

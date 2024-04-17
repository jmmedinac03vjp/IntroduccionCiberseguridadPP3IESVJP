//------------------------Generar Array double----------------------\\
// 19/09/2021
// Santiago, Chile
// Eddie Casañas
// Usado con las calculadoras
//------------------------------------------------------------------\\


import java.util.*;
public class GenerarArrayInt {
	Scanner obj = new Scanner(System.in);
	String cantidad, numero;
	int parseCantidad; 
	double parseNumero;
	public double[] devuelveArray() {
		while (true) {
			System.out.println("Ingrese la cantidad con la que desea trabajar");
			try {
				cantidad = obj.nextLine();
				parseCantidad = Integer.parseInt(cantidad);
				if(parseCantidad < 0) {
					System.out.println("Ingrese una cantidad valida");
					continue;
				}
				if(parseCantidad < 2) {
					System.out.println("Ingrese un minimo de dos numeros para poder trabajar");
					continue;
				}
			}catch(Throwable exc) {
				System.out.println("Ingrese un valor apropiado");
				continue;
			}
			double[] array = new double[parseCantidad];
			
			int i = 0;
			while(i < array.length) {
				System.out.println("Ingrese un numero (" + (i+1) + ")");
				try {
					numero = obj.nextLine();
					parseNumero = Double.parseDouble(numero);
					array[i] = parseNumero;
				}catch(Throwable exc) {
					System.out.println("Ingrese un numero valido");
					continue;
				}
				i++;
			}
			return array;
		}
	}
	
	//USADO PARA OBTENER UN ARRAY AL TRABAJAR CON DIVISIONES
	public double[] devuelveArray2() {
		while (true) {
			System.out.println("Ingrese la cantidad con la que desea trabajar");
			try {
				cantidad = obj.nextLine();
				parseCantidad = Integer.parseInt(cantidad);
				if(parseCantidad < 0) {
					System.out.println("Ingrese una cantidad valida");
					continue;
				}
				if(parseCantidad < 2) {
					System.out.println("Ingrese un minimo de dos numeros para poder trabajar");
					continue;
				}
			}catch(Throwable exc) {
				System.out.println("Ingrese un valor apropiado");
				continue;
			}
			double[] array = new double[parseCantidad];
			
			
			while(true) {
				System.out.println("Ingrese el primer numero: ");
				try {
					numero = obj.nextLine();
					parseNumero = Double.parseDouble(numero);
					array[0] = parseNumero;
				}catch(Throwable exc) {
					System.out.println("Ingrese un numero valido");
					continue;
				}
				break;
				
			}
			int i = 1;
			while(i < array.length) {
				System.out.println("Ingrese un numero: (" + (i+1) + ")");
				try {
					numero = obj.nextLine();
					parseNumero = Double.parseDouble(numero);
					if(parseNumero == 0) {
						System.out.println("Ingrese numeros distintos a 0");
						continue;
					}else {
						array[i] = parseNumero;
					}
				}catch(Throwable exc) {
					System.out.println("Ingrese un numero valido");
					continue;
				}
				i++;
				
			}
			return array;
	}
	
	
}
}


package parking;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Parking
 * 
 * @author Usuario
 */
public class Parking {

    //Pide el titular del coche
    public static String pedirTitular(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el titular:");
        return entrada.nextLine();
    }
    
    //Pide la matrícula del coche
    public static String pedirMatricula(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la matrícula:");
        return entrada.nextLine();
    }
    
    //Guarda un coche en la posición del vector que indique el usuario
    public static void aparcarCoche(Coche[] vCoches){
        Scanner entrada = new Scanner(System.in);
        int pos;
        boolean posicionValida = false;   
        
        Coche cAux = new Coche(pedirTitular(), pedirMatricula());       
        do {         
            
            try {
                System.out.println("Introduzca la posición: ");
                pos = entrada.nextInt();

                if(vCoches[pos] != null) {
                    System.out.println("La plaza está ocupada. Por favor, introduzca una posición válida.");
                } else {
                    vCoches[pos] = cAux;
                    System.out.println("Coche aparcado en la plaza: " + pos);
                    posicionValida = true;
                }
            } catch(InputMismatchException e) {
                System.out.println("Error. Ha introducido una letra -> " + e);
                System.out.println("Por favor, introduzca una posición válida");     
                entrada.next();
            
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Error: No existe esa plaza de garaje -> " + e);
                System.out.println("Por favor, introduzca una posición válida");       
            }   
            
        } while(!posicionValida);  
    }
    
    //Muestra la posición de las plazas libres que hay en el vector
    public static void mostrarPlazasLibres(Coche[] vCoches) {
        for(int i=0; i<vCoches.length; i++) {
            if(vCoches[i] == null) {
                System.out.print("[" + i + "]");
            }
        }
        System.out.println("\n");   
    }
    
    //Copia en un ArrayList los coches cuyo titular empieza por el texto que indica el usuario
    public static void copiarCochesPorTitular(Coche[] vCoches) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Introduzca el texto a buscar: ");
        String texto = entrada.nextLine();
        
        ArrayList<Coche> listadoCoches = new ArrayList<>();
            
        //Volcamos coches en el arrayList
        for(Coche c: vCoches) {
            if(c != null && c.getTitular().startsWith(texto)) {
                listadoCoches.add(c);
            }
        }
        
        //Mostramos el arrayList de coches
        if(listadoCoches.isEmpty()) {
            System.out.println("No hay coches cuyo titular empiece por el texto indicado");
        } else {
            for(Coche c: listadoCoches) {
                c.mostrarCoche();
            }
        }    
    }
    
    //Busca un coche por matrícula
    public static int buscarPorMatricula(Coche[] vCoches) {
        Scanner entrada = new Scanner(System.in);
        int i=0, pos = -1;
        boolean enc=false;
        
        System.out.println("Introduzca la matrícula a buscar: ");
        String matricula = entrada.nextLine();
        
        while(i<vCoches.length && !enc) {
            if(vCoches[i] != null && vCoches[i].getMatricula().equalsIgnoreCase(matricula)){
                enc = true;
                pos = i;
            } else {
                i++;
            }
        }
        
        return pos;
    }
    
    /**
     * Main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, pos;
        boolean salir = false;
        
        Coche[] vCoches = new Coche[10];
        
        do{
            System.out.println("1. Aparcar coche");
            System.out.println("2. Mostrar plazas libres");
            System.out.println("3. Copiar coches por titular");
            System.out.println("4. Buscar coche por matrícula");
            System.out.println("5. Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1: System.out.println("Aparcando coche...");
                        aparcarCoche(vCoches);
                        break;
                
                case 2: System.out.println("Mostrando plazas libres...");
                        mostrarPlazasLibres(vCoches);
                        break;
                
                case 3: System.out.println("Copiando coches por titular...");
                        copiarCochesPorTitular(vCoches);
                        break;
                
                case 4: System.out.println("Buscando coche por matrícula...");
                        pos = buscarPorMatricula(vCoches);
                        if(pos != -1) {
                            System.out.println("Coche encontrado en la plaza: " + pos);
                        } else {
                            System.out.println("El coche buscado no está en el garaje");
                        }
                        break;
                
                case 5: System.out.println("Salir...");
                        salir = true;
                        break;
                        
                default: System.out.println("Opción incorrecta");
                         break;
            }
           
        } while(!salir);
    }
    
}

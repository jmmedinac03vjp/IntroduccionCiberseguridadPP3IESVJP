/**
 * Clase Coche
 * 
 * @author Usuario
 */
public class Coche {
    
    //Atributos
    private String titular;
    private String matricula;

    //Constructores
    public Coche() {
        this.titular="";
        this.matricula="";
    }

    public Coche(String titular, String matricula) {
        this.titular = titular;
        this.matricula = matricula;
    }

    //Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //M�todos
    public void mostrarCoche() {
        System.out.println("Titular: " + titular);
        System.out.println("Matr�cula: " + matricula);
    }    
    
}

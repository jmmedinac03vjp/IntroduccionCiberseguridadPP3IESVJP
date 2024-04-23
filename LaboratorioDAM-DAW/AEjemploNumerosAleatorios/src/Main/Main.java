import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de Random
        Random random = new Random();

        // Generación de un número aleatorio para simular un token de seguridad
        long securityToken = random.nextLong();

        System.out.println("Security Token: " + securityToken);
    }
}
<<<<<<< HEAD
import java.util.Scanner;

public class ClasificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su numero: ");
        int numero = scanner.nextInt(); 

    
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        scanner.close();
    }
=======
import java.util.Scanner;

public class ClasificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su numero: ");
        int numero = scanner.nextInt(); 

    
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        scanner.close();
    }
>>>>>>> 0c8bd8d6599489d6ef783207d8ce24048bd1a360
}
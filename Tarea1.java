import java.util.Random;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe 'tirar' para lanzar la moneda.");
        String input = scanner.nextLine();
        
        
        if (input.equalsIgnoreCase("tirar")) {
           
            int resultado = random.nextInt(2);
            
            
            if (resultado == 0) {
                System.out.println("El resultado es cara");
            } else {
                System.out.println("El resultado es cruz");
            }
        } else {
            System.out.println("Entrada inválida. El programa ha terminado.");
        }
        
        
        scanner.close();
    }
}


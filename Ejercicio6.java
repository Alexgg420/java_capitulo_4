import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Cálculo del tiempo de caída de un objeto.");
      System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
      int h = sc.nextInt();
      final double g = 9.81;
      double tiempo = Math.sqrt(2*h/g);
      System.out.print("El objeto tarda "+tiempo+" segundos en caer.");
      sc.close();
    }
  }
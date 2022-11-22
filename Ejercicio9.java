import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Vamos a resolver una ecuación de segundo grado.");
      System.out.println("ax^2 + bx + c = 0");
      System.out.println("Introduce el valor de a, b y c en ese orden.");
      System.out.print("a = ");
      double a = sc.nextDouble();
      System.out.print("b = ");
      double b = sc.nextDouble();
      System.out.print("c = ");
      double c = sc.nextDouble();
      // 0x^2 + 0x + 0 = 0
      if ((a == 0) && (b == 0) && (c == 0)) {
        System.out.println("La ecuación tiene infinitas soluciones.");
      }
      // 0x^2 + 0x + c = 0  (c distinto de 0)
      if ((a == 0) && (b == 0) && (c!= 0)) {
        System.out.println("La ecuación no tiene solución.");
      }
      // ax^2 + bx + 0 = 0  (a y b distintos de 0)
      if ((a!= 0) && (b!= 0) && (c == 0)) {
        System.out.println("Solución 1: x = 0");
        System.out.println("Solución 2: x = "+(-b/a));
      }
      // 0x^2 + bx + c = 0  (b y c distintos de 0)
      if ((a == 0) && (b!= 0) && (c!= 0)) {
        System.out.println("Solución 1 = Solución 2 = "+(-c/b));
      }
      // ax^2 + 0x + c = 0 (a y c distintos de 0)
      if ((a!= 0) && (b == 0) && (c!= 0)) {
        System.out.println("Solución 1: x = "+(Math.sqrt(-c/a)));
        System.out.println("Solución 2: x = "+(Math.sqrt(c/a)));
      }
      // ax^2 + bx + c = 0  (a, b y c distintos de 0)
      if ((a!= 0) && (b!= 0) && (c!= 0)) {
        double discr = b*b - (4 * a * c);
        if (discr < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
        }  else {
          System.out.println("Solución 1: x = "+(-b + Math.sqrt(discr))/(2 * a));
          System.out.println("Solución 2: x = "+(-b - Math.sqrt(discr))/(2 * a));
        }
      sc.close();
      }
    }
  }
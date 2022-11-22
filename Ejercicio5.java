import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a resolver una ecuación de primer grado.");
        System.out.println("La ecuación será ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Introduzca el valor de b: ");
        int b = sc.nextInt();
        double x = ((-b)/a);
        System.out.print("Para a = "+a+", y b = "+b+", x toma el valor de "+x);
        sc.close();
    }
}
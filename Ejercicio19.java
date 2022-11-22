import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número para conocer cuántos dígitos tiene: ");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("El número no puede ser negativo");
        }
        if (num >= 0 && num < 10){
            System.out.println("El número tiene 1 dígito");
        }
        if (num >= 10 && num < 100){
            System.out.println("El número tiene 2 dígitos");
        }
        if (num >= 100 && num < 1000){
            System.out.println("El número tiene 3 dígitos");
        }
        if (num >= 1000 && num < 10000){
            System.out.println("El número tiene 4 dígitos");
        }
        if (num >= 10000 && num < 100000){
            System.out.println("El número tiene 5 dígitos");
        }
        if (num >= 100000){
            System.out.println("Solo se permiten números de hasta 5 cifras");
        }
        sc.close();
    }
}
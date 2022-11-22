import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es capicúa o no: ");
        int num = sc.nextInt();
        if (num >= 100000){
            System.out.println("El número debe tener como máximo 5 cifras");
        }
        if ((num >= 0) && (num < 10)){
            System.out.println("El número es capicúa");
        }
        if ((num >= 10) && (num <= 100)){
            if ((num/10) == (num%10)){
                System.out.println("El número es capicúa");
            }
            else{
                System.out.println("El número no es capicúa");
            }
        }
        if ((num >= 100) && (num < 1000)){
            if ((num/100) == (num%10)){
                System.out.println("El número es capicúa");
            }
            else{
                System.out.println("El número no es capicúa");
            }
        }
        if ((num >= 1000) && (num < 10000)){
            if (((num/1000) == (num%10)) && (((num / 100) %10) == ((num / 10) %10))){
                System.out.println("El número es capicúa");
            }
            else{
                System.out.println("El número no es capicúa");
            }
        }
        if ((num >= 10000) && (num < 100000)){
            if (((num/10000) == (num%10)) && (((num / 1000) %10) == ((num / 10) %10))){
                System.out.println("El número es capicúa");
            }
            else{
                System.out.println("El número no es capicúa");
            }
        }
        sc.close();
    }
}
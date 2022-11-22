import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        System.out.print("Introduce un número para conocer cuál es su última cifra: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("La última cifra del número "+num+" es "+(num%10));
        sc.close();
    }
}
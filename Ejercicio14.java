import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Inrtroduzca un número para saber si es par y si es divisible entre 5: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            if (num % 5 == 0){
                System.out.println("El número es par y divisible entre 5");
            }
            if (num % 5 != 0){
                System.out.println("El número es par pero no es divisible entre 5");
            }
        }
        if (num % 2 != 0){
            if (num % 5 == 0){
                System.out.println("El número es impar y divisible entre 5");
            }
            if (num % 5 != 0){
                System.out.println("El número es impar y no es divisible entre 5");
            }
        }
        sc.close();
    }
}
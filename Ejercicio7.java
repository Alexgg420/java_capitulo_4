import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba tres notas para calcular su media: ");
        long num1 = sc.nextLong();
        if (num1 < 0 || num1 > 10){
            System.out.println("Valores incorrectos");
        }
        else{
            long num2 = sc.nextLong();
            if (num2 < 0 || num2 > 10){
                System.out.println("Valores incorrectos");
            }
            else{
                long num3 = sc.nextLong();
                if (num3 < 0 || num3 > 10){
                    System.out.println("Valores incorrectos");
                }
                else{
                    float media = (((float)num1 + (float)num2 + (float)num3) / 3);
                    System.out.printf("La media de los tres números es de %.2f", media);
                }
            }
        }
        sc.close();
    }
}
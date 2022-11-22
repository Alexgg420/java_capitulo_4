import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){
        System.out.print("Introduce un número de hasta 5 cifras para conocer su primera cifra: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >=100000){
            System.out.println("El número debe tener como máximo 5 cifras");
        } else {
            num = num/10;
            if (num < 10)
                System.out.println("La última cifra del número "+num+" es "+num);
                else {
                    num = num/10;
                    if (num < 10)
                        System.out.println("La última cifra del número "+num+" es "+num);
                        else {
                            num = num/10;
                            if (num < 10)
                                System.out.println("La última cifra del número "+num+" es "+num);
                                else {
                                    num = num/10;
                                    if (num < 10)
                                        System.out.println("La última cifra del número "+num+" es "+num);
                                        sc.close();
                                }
                        }
                    
                }
            
        }
    }
}

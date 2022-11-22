import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        System.out.print("Introduzca la hora: ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.print("Buenos días");
        }
        if((hora >= 13) && (hora <= 20)){
            System.out.print("Buenas tardes");
        }
        if ((hora >= 23) && (hora <= 24) || (hora >= 0) && (hora <= 5)){
             System.out.print("Buenas noches");
        }
        if ((hora < 0) || (hora > 24)){
            System.out.print("Error en la introducción de la hora");
        }
        sc.close();
    }
}
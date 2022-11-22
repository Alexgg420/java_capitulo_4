import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7 para conocer su respectivo día de la semana: ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Lunes");
        }
        if (num == 2) {
            System.out.println("Martes");
        }
        if (num == 3) {
            System.out.println("Miércoles");
        }
        if (num == 4) {
            System.out.println("Jueves");
        }
        if (num == 5) {
            System.out.println("Viernes");
        }
        if (num == 6) {
            System.out.println("Sábado");
        }
        if (num == 7) {
            System.out.println("Domingo");
        }
        if ((num < 1) || (num > 7)) {
            System.out.println("El número no corresponde a ningún día de la semana");
        }
        sc.close();
    }
}
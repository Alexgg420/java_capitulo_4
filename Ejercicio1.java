import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("Introduce un día de la semana: ");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miércoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("A primera hora toca Programación");
                break;
            case 2:
                System.out.println("A primera hora toca Sistemas informáticos");
                break;
            case 3:
                System.out.println("A primera hora toca Entornos de Desarrollo");
                break;
            case 4:
                System.out.println("A primera hora toca Programación");
                break;
            case 5:
                System.out.println("A primera hora toca Formación y Orientación Laboral");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
        sc.close();
    }
}
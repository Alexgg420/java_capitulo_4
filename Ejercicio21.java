import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota obtenida en el primer examen: ");
        double nota1 = sc.nextDouble();
        if ((nota1 < 0) || (nota1 > 10)){
            System.out.print("Error en la introducción de la primera nota");
        }
        else{
            System.out.print("Introduzca la nota obtenida en el segundo examen: ");
            double nota2 = sc.nextDouble();
            if ((nota2 < 0) || (nota2 > 10)){
                System.out.print("Error en la introducción de la segunda nota");
            }
            else{
                double media = ((nota1+nota2)/2);
                System.out.println("Su nota media de los dos exámenes es de "+media);
                if (media > 5){
                    System.out.print("Ud. ha aprobado la asignatura de programación con un "+media);
                }
                else{
                    System.out.println("Según las valores introducidos, ud. debe haber realizado el examen de recuperación.");
                    System.out.println("¿Cuál ha sido el resultado de la recuperación?");
                    System.out.println("Si es apto, pulse 1");
                    System.out.println("Si no es apto, pulse 2");
                    double res = sc.nextDouble();
                    if (res == 1){
                        System.out.print("Ud. ha aprobado programación con un 5");
                    }
                    if (res == 2){
                        System.out.print("Ud. ha suspendido programación con un "+media);
                    }
                    if ((res!=1) && (res!=2)){
                        System.out.print("Error en la introducción del resultado");
                    }
                }
            }
        }
        sc.close();
    }
}
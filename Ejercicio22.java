import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rest = 0;
        int minfin;
        System.out.println("Introduce el día de la semana:");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        int dia = sc.nextInt();
        if (dia < 1 || dia > 7){
            System.out.println("Valores incorrectos");
        }
        if (dia > 5 && dia < 8){
            System.out.println("Ya estás en fin de semana");
        }
        if (dia > 0 && dia < 6){
            System.out.print("Introduce la hora (0-23): ");
            int hora = sc.nextInt();
            if (hora < 0 || hora > 23){
                System.out.println("Valores incorrectos");
            }
            else {
                System.out.print("Introduce los minutos (0-59): ");
                int min = sc.nextInt();
                if (min < 0 || min > 59){
                    System.out.println("Valores incorrectos");
                }
                else {
                    switch (dia) {
                        case 1:
                            rest = 4;
                            break;
                        case 2:
                            rest = 3;
                            break;
                        case 3:
                            rest = 2;
                            break;
                        case 4:
                            rest = 1;
                            break;
                        case 5:
                            rest = 0;
                            break;
                    }
                    minfin = (60 - min) + (((rest * 24) + (15 - hora - 1)) * 60);
                    if (minfin > 0){
                        System.out.print("Faltan "+minfin+" minutos para el fin de semana");
                    }
                    if (minfin <= 0){
                        System.out.print("Ya estás en fin de semana");
                    }
                }
            }
        }
        sc.close();
    }
}
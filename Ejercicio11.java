import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduzca la hora actual.");
      System.out.println("Primero introducirá la hora, y de forma separada, los minutos.");
      System.out.print("Hora: ");
      int hora = sc.nextInt();  
      System.out.print("Minutos: ");
      int minutos = sc.nextInt();
      int segundospasados = (hora * 3600) + (minutos * 60);
      int segundosrestantes = (24 * 3600) - segundospasados;    
      System.out.print("Siendo las "+hora+"h y "+minutos+" minutos, faltan "+segundosrestantes+" hasta la medianoche.");
      sc.close();
    }
  }
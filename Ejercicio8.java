import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduzca la primera nota: ");
      double nota1 = sc.nextDouble();
      System.out.print("Introduzca la segunda nota: ");
      double nota2 = sc.nextDouble();
      System.out.print("Introduzca la tercera nota: ");
      double nota3 = sc.nextDouble();
      double media = ((nota1 + nota2 + nota3) / 3);
      System.out.println("La media es "+media);
      if ((media < 5) && (media >= 0)) {
        System.out.println("Insuficiente");
      }
      if ((media >= 5) && (media < 6)) {
        System.out.println("Suficiente");
      }
      if ((media >= 6) && (media < 7)) {
        System.out.println("Bien");
      }
      if ((media >= 7) && (media < 9)) {
        System.out.println("Notable");
      }
      if ((media >= 9) && (media <= 10)) {
        System.out.println("Sobresaliente");
      }
    }
  }
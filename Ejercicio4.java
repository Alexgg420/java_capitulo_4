import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el salario semanal: ");
        int sal = sc.nextInt();
        if (sal <= 40){
            System.out.println("El salario semanal de "+sal+" horas es de "+(sal * 12)+" euros");
        }
        if (sal > 40){
            int ext = (sal - 40);
            System.out.println("El salario semanal de "+sal+" horas es de "+((40 * 12) + (ext * 16))+" euros");
        }
        sc.close();
    }
}
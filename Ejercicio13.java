import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres números diferentes y se ordenarán automáticamente:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if ((n1 < n2) && (n1< n3))
            if (n2 < n3)
                System.out.print(n1+" < "+n2+" < "+n3);
            else
                System.out.print(n1+" < "+n3+" < "+n2);
        if ((n2 < n1) && (n2< n3))
            if (n1 < n3)
                System.out.print(n2+" < "+n1+" < "+n3);
            else
                System.out.print(n2+" < "+n3+" < "+n1);
        if ((n3 < n1) && (n3< n2))
            if (n1 < n2)
                System.out.print(n3+" < "+n1+" < "+n2);
            else
                System.out.print(n3+" < "+n2+" < "+n1);
        sc.close();
    }
}
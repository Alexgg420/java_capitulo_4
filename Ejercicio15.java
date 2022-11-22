import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear una pirámide de 5 líneas.");
        System.out.println("Puedes construirla eligiendo una letra, número o símbolo.");
        System.out.print("Selecciona el caracter para construir la priámide: ");
        String car = sc.nextLine();
        System.out.println("Introduce el formato en el que quieres que salga la pirámide: ");
        System.out.println("1. Hacia arriba");
        System.out.println("2. Hacia abajo");
        System.out.println("3. Hacia la derecha");
        System.out.println("4. Hacia la izquierda");
        int formato = sc.nextInt();
        switch (formato){
            case 1:
            System.out.println("    " + car);
            System.out.println("   " + car + car + car);
            System.out.println("  " + car + car + car + car + car);
            System.out.println(" " + car + car + car + car + car + car + car);
            System.out.println(car + car + car + car + car + car + car + car + car);
            break;
            case 2:
            System.out.println(car + car + car + car + car + car + car + car + car);
            System.out.println(" " + car + car + car + car + car + car + car);
            System.out.println("  " + car + car + car + car + car);
            System.out.println("   " + car + car + car);
            System.out.println("    " + car);
            break;
            case 3:
            System.out.println("    " + car);
            System.out.println("   " + car + car);
            System.out.println("  " + car + car + car);
            System.out.println(" " + car + car + car + car);
            System.out.println(car + car + car + car + car);
            System.out.println(" " + car + car + car + car);
            System.out.println("  " + car + car + car);
            System.out.println("   " + car + car);
            System.out.println("    " + car);
            break;
            case 4:
            System.out.println(car + "    ");
            System.out.println(car + car + "   ");
            System.out.println(car + car + car + "  ");
            System.out.println(car + car + car + car + " ");
            System.out.println(car + car + car + car + car);
            System.out.println(car + car + car + car + " ");
            System.out.println(car + car + car + "  ");
            System.out.println(car + car + "   ");
            System.out.println(car + "    ");
            break;
            default:
            System.out.println("Este formato no está disponible.");
        }
    }
}
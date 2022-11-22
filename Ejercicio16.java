import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int option = 0;
        System.out.println("Contesta con sinceridad a las preguntas Sí o No para conocer si tu pareja te está sinedo infiel.");
        System.out.println("Escriba 1 en caso afirmativo o 2 en caso negativo.");
        System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        option = sc.nextInt();
        if (option < 1 || option > 2){
            System.out.print("Datos incorrectos");
        }
        else{
            switch (option){
                case 1:
                cont = cont + 3;
                break;
    
                case 2:
                cont = cont + 0;
                break;
            }
            System.out.print("Ha aumentado sus gastos de vestuario: ");
            option = sc.nextInt();
            if (option < 1 || option > 2){
                System.out.print("Datos incorrectos");
            }
            else{
                switch (option){
                    case 1:
                    cont = cont + 3;
                    break;
        
                    case 2:
                    cont = cont + 0;
                    break;
                }
                System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
                option = sc.nextInt();
                if (option < 1 || option > 2){
                    System.out.print("Datos incorrectos");
                }
                else{
                    switch (option){
                        case 1:
                        cont = cont + 3;
                        break;
            
                        case 2:
                        cont = cont + 0;
                        break;
                    }
                    System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o se arregla el pelo y se asea con más frecuencia (si es mujer): ");
                    option = sc.nextInt();
                    if (option < 1 || option > 2){
                        System.out.print("Datos incorrectos");
                    }
                    else{
                        switch (option){
                            case 1:
                            cont = cont + 3;
                            break;
                
                            case 2:
                            cont = cont + 0;
                            break;
                        }
                        System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
                        option = sc.nextInt();
                        if (option < 1 || option > 2){
                            System.out.print("Datos incorrectos");
                        }
                        else{
                            switch (option){
                                case 1:
                                cont = cont + 3;
                                break;
                    
                                case 2:
                                cont = cont + 0;
                                break;
                            }
                            System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
                            option = sc.nextInt();
                            if (option < 1 || option > 2){
                                System.out.print("Datos incorrectos");
                            }
                            else{
                                switch (option){
                                    case 1:
                                    cont = cont + 3;
                                    break;
                        
                                    case 2:
                                    cont = cont + 0;
                                    break;
                                }
                                System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
                                option = sc.nextInt();
                                if (option < 1 || option > 2){
                                    System.out.print("Datos incorrectos");
                                }
                                else{
                                    switch (option){
                                        case 1:
                                        cont = cont + 3;
                                        break;
                            
                                        case 2:
                                        cont = cont + 0;
                                        break;
                                    }
                                    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
                                    option = sc.nextInt();
                                    if (option < 1 || option > 2){
                                        System.out.print("Datos incorrectos");
                                    }
                                    else{
                                        switch (option){
                                            case 1:
                                            cont = cont + 3;
                                            break;
                                
                                            case 2:
                                            cont = cont + 0;
                                            break;
                                        }
                                        System.out.print("Has notado que últimamente se perfuma más: ");
                                        option = sc.nextInt();
                                        if (option < 1 || option > 2){
                                            System.out.print("Datos incorrectos");
                                        }
                                        else{
                                            switch (option){
                                                case 1:
                                                cont = cont + 3;
                                                break;
                                    
                                                case 2:
                                                cont = cont + 0;
                                                break;
                                            }
                                            System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
                                            option = sc.nextInt();
                                            if (option < 1 || option > 2){
                                                System.out.print("Datos incorrectos");
                                            }
                                            else{
                                                switch (option){
                                                    case 1:
                                                    cont = cont + 3;
                                                    break;
                                        
                                                    case 2:
                                                    cont = cont + 0;
                                                    break;
                                                }
                                                if (cont >= 0 && cont <= 10){
                                                    System.out.print("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
                                                }
                                                if (cont >= 11 && cont <= 22){
                                                    System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                                                }
                                                if (cont >= 23 && cont <= 30){
                                                    System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
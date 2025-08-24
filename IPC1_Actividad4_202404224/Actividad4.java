package actividad4;
import java.util.Scanner;
public class Actividad4 {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
String opcion;
double a, b, resultado;

        do{
        System.out.println("----Menu de Calculadora----");
        System.out.println("uno. Suma");
        System.out.println("dos. Resta");
        System.out.println("tres. Multiplicacion");
        System.out.println("cuatro. Division");
        System.out.println("cinco. Potencia");
        System.out.println("seis. Raiz");
        System.out.println("siete. Salir");
        System.out.print("Elige una opcion: ");
        opcion = scanner.nextLine().toLowerCase();
        
        
            
            switch (opcion){
                case "uno":
                    System.out.println("Ingresa el primer numero");
                    a = scanner.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    resultado = a+b;
                    System.out.println("Resutado: " +resultado);
                    break;
                    
                case "dos":
                    System.out.println("Ingresa el primer numero");
                    a = scanner.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    resultado = a-b;
                    System.out.println("Resutado: " +resultado);
                    break;
                    
                 case "tres":
                    System.out.println("Ingresa el primer numero");
                    a = scanner.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    resultado = a*b;
                    System.out.println("Resutado: " +resultado);
                    break;
                    
                case "cuatro":
                    System.out.println("Ingresa el primer numero");
                    a = scanner.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    resultado = a/b;
                    System.out.println("Resutado: " +resultado);
                    break;
                    
                case "cinco":
                    System.out.println("Ingresa la base:");
                    a = scanner.nextDouble();
                    System.out.println("Ingresa el exponente:");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    resultado = Math.pow(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;

                case "seis":
                    System.out.println("Ingresa un numero:");
                    a = scanner.nextDouble();
                    scanner.nextLine();
                    if (a >= 0) {
                    resultado = Math.sqrt(a);
                    System.out.println("Resultado: " + resultado);
                    } else {
                    System.out.println("Error: No se puede calcular la raíz de un número negativo.");
                        }
                        break;
                        
                case "siete":
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida, selecciona una opcion correcta: ");
                    break;
                }
            } while (!opcion.equals("siete"));
                

        scanner.close();
    }
}
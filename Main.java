import java.util.Scanner;

/**
 * Clase principal que permite calcular la suma acumulada de números pares
 * introducidos por el usuario a través de la consola.
 * 
 * @author Brian
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args) {
        /**Metodo principal para ejecutar el flujo de la entrada de datos 
         *y mantener el control del bucle
         *@param args argumentos de la linea de comando 
         *crear objeto scanner*/
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num = 2;
        while (num% 2==0){
            System.out.println("indique el numero a sumar");
            num = scanner.nextInt();
            if(num %2==0){
            suma += num;
            }
        }    
        System.out.println("el total de resultado es: " + suma);
        
        scanner.close();
    }
}
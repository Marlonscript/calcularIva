package OpenBootCamp;
import java.util.Scanner;

// Funcion para calcular el precio del IVA "EN EL SALVADOR"
public class Ejercicio2 {
    public static void main(String[] args) {

        calcularIva();

    }
    static void calcularIva(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: $ ");
        double precio = scanner.nextDouble();
        double iva = (precio * 0.13);
        double total= (precio + iva);
        System.out.println("Precio del producto: $" + precio);
        System.out.println("Precio del producto mas iva: $" + total);

    }
 }
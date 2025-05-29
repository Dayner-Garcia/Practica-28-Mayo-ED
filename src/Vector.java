import java.util.InputMismatchException;
import java.util.Scanner;

public class Vector implements IVector{
    private int[] elementos;

    @Override
    public void leerDatos(Scanner scanner) {
        int n;

        while (true) {
            try {
                System.out.print("Ingrese la cantidad de elementos: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Debe ingresar un numero entero positivo.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido, ingrese solo numeros enteros.");
                scanner.next();
            }
        }

        elementos = new int[n];

        for (int i = 0; i < n; ) {
            try {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                elementos[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido, ingrese solo numeros enteros.");
                scanner.next();
            }
        }
    }

    @Override
    public int calcularSuma() {
        int suma = 0;
        for (int num : elementos) {
            suma += num;
        }
        return suma;
    }
}

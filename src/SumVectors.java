import java.util.Scanner;

public class SumVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector vector = new Vector();
        vector.leerDatos(scanner);
        System.out.println("Suma de los elementos: " + vector.calcularSuma());
        scanner.close();
    }
}
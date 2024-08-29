import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Se añade scanner.nextLine(); después de cada scanner.nextInt() o nextDouble() para limpiar el búfer de entrada

        //EJERCICIO 1
        Double decimal1 = 0.0;
        Double decimal2 = 0.0;
        while (true) {
            try
            {
                String input1 = JOptionPane.showInputDialog("Ingrese el primer valor decimal: ");
                decimal1 = Double.parseDouble(input1);
                String input2 = JOptionPane.showInputDialog("Ingrese el segundo valor decimal: ");
                decimal2 = Double.parseDouble(input2);
                break;
            }
            catch (NumberFormatException e)
            {
                // Mostrar mensaje de error y continuar con el bucle
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número decimal.");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        // Calcular el valor máximo y mínimo
        double max = Math.max(decimal1, decimal2);
        double min = Math.min(decimal1, decimal2);

        // Mostrar el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "Valor máximo: " + max + "\nValor mínimo: " + min);

        //EJERCICIO 2
        System.out.println("Introduce el lado del cuadrado: ");
        while (true)
        {
            try {
                int lado = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada
                double area = Math.pow(lado, 2);
                System.out.println("El area del cuadrado es: " + area);
                break;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        //EJERCICIO 3
        System.out.println("Introduce el radio del círculo: ");
        while (true)
        {
            try {
                double radio = scanner.nextDouble();
                scanner.nextLine();  // Limpiar el buffer de entrada
                double area = Math.PI * Math.pow(radio, 2);
                double longitud = 2 * Math.PI * radio;
                System.out.println("El area del círculo es: " + area);
                System.out.println("La longitud de circunferencia es " + longitud);
                break;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        //EJERCICIO 4
        System.out.println("Ingresa un número entero para conocer su tabla de multiplicar");
        while (true)
        {
            try {
                int tabla = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada
                for (int i = 1; i < 10; i ++)
                {
                    System.out.println(tabla + " * " + i + " = " + (tabla * i));
                }
                break;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        //EJERCICIO 5
        System.out.println("Ingresa un número entero para conocer sus potencias cuadradas (desde 2 hasta 10):");
        while (true) {
            try {
                int numero = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                // Calcular y mostrar las potencias cuadradas desde 2 hasta 10
                for (int i = 2; i <= 10; i++) {
                    System.out.println(numero + " elevado a " + i + " = " + Math.pow(numero, i));
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        //EJERCICIO 6
        System.out.println("Ingrese un valor de ángulo en grados:");
        while (true) {
            try {
                String input = scanner.nextLine();
                double anguloGrados = Double.parseDouble(input);

                // Convertir el ángulo a radianes
                double anguloRadianes = Math.toRadians(anguloGrados);

                // Calcular seno, coseno y tangente
                double seno = Math.sin(anguloRadianes);
                double coseno = Math.cos(anguloRadianes);
                double tangente = Math.tan(anguloRadianes);

                // Calcular ángulo complementario y suplementario
                double anguloComplementario = 90 - anguloGrados;
                double anguloSuplementario = 180 - anguloGrados;

                // Mostrar resultados
                System.out.println("Para un ángulo de " + input + " grados:");
                System.out.println("Seno =  " + seno);
                System.out.println("Coseno = " + coseno);
                System.out.println("Tangente = " + tangente);
                System.out.println("Complementario = " + anguloComplementario);
                System.out.println("Suplementario = " + anguloSuplementario);
                break;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida del scanner
            }
        }

        //EJERCICIO 7 (resuelto en ejercicio 3)

        //EJERCICIO 8 (resuelto en ejercicio 3)

        scanner.close();
    }
}
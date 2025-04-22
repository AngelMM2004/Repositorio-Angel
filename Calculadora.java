package calculadora;

import java.util.Scanner;

public class Calculadora {
// Creamos la bienvenida y se muestran las diferentes opciones que la calculadora puede realizar.

    public static void opcionesParaElegir() {
        System.out.println("-------------------------------------------------");
        System.out.println("Elige una de las opciones para realizar calculos:");
        System.out.println("Pulsa 1 para realizar una sumarGit.");
        System.out.println("Pulsa 2 para realizar una resta.");
        System.out.println("Pulsa 3 para realizar una multiplicacion.");
        System.out.println("Pulsa 4 para realizar una division.");
        System.out.println("Pulsa 5 para cambiar los valores a calcular.");
        System.out.println("Pulsa 6 para salir de la calculadora.");
        System.out.println("-------------------------------------------------");
    } // Menú de opciones
// Creamos la función que nos dé la bienvenida

    public static void bienvenida() {
        System.out.println("--------------------------------------------");
        System.out.println("Bienvenido a la calculadora definitiva");
        System.out.println("IMPORTANTE!!!");
        System.out.println("NO ESCRIBIR EL NUMERO 0 EN EL SEGUNDO NUMERO");
        System.out.println("--------------------------------------------");
    }
// Creamos la función para elegir el primer número

    public static double elegirPrimerNum(Scanner teclado) {
        System.out.print("Dime el primer numero: ");
        double num1 = teclado.nextDouble();
        System.out.println("El numero elegido es " + num1);
        return num1;
    } // Primer número
// Creamos la función para elegir el segundo número

    public static double elegirSegundoNum(Scanner teclado) {
        System.out.print("Dime el segundo numero: ");
        double num2 = teclado.nextDouble();
        System.out.println("El numero elegido es " + num2);
        return num2;
    } // Segundo número
// Creamos la función para sumarGit

    public static double sumarGit(double num1, double num2) {
        return num1 + num2;
    } // Suma
// Creamos la función para restar

    public static double resta(double num1, double num2) {
        return num1 - num2;
    } // Resta
// Creamos la función para multiplicar

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    } // Multiplicación
// Creamos la función para dividir

    public static double division(double num1, double num2) {
        return num1 / num2;
    } //División
// Creamos la función para obtener el resto

    public static double resto(double num1, double num2) {
        return num1 % num2;
    } // Resto
// Aquí comenzaremos el main, que es lo que se mostrará por pantalla

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String saludo = "Esto es un cambio para Git";
        double num1, num2, resultado, resto;
        boolean repetir = true;
        int opcionElegida;
        bienvenida();
        num1 = elegirPrimerNum(teclado);
        num2 = elegirSegundoNum(teclado);
// Comienzo del do/while en el que se repetira hasta que la opcion del caso 6 se ejecute, esto es un interruptor de encendido y apagado, "While" en repetir no se ejecute el caso 6, la calculadora se ejecutará siempre desde el "do" repetidas veces.
        do {
            opcionesParaElegir();
            System.out.print("La opcion que decido elegir es la numero: ");
            opcionElegida = teclado.nextInt();
            switch (opcionElegida) {
                case 1:
                    resultado = sumarGit(num1, num2);
                    System.out.println("El resultado de los numeros sumarGitdos es de " + resultado);
                    break;

                case 2:
                    resultado = resta(num1, num2);
                    System.out.println("El resultado de los numero restados es de " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(num1, num2);
                    System.out.println("El resultado de los numeros multiplicados es de " + resultado);
                    break;
                case 4:
                    resultado = division(num1, num2);
                    resto = resto(num1, num2);
                    System.out.println("El resultado de los numeros divididos es de " + resultado + " y su resto es de " + resto);
                    break;
                case 5:
                    num1 = elegirPrimerNum(teclado);
                    num2 = elegirSegundoNum(teclado);
                    break;
                case 6:
                    repetir = false;
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Cerrando la aplicacion de la calculadora, ten un buen dia");
                    System.out.println("---------------------------------------------------------");
                    break;
            } // Switch
        } while (repetir); // Do
    } // Main
} // Public class Calculadora


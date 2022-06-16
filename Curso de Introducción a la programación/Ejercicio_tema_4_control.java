
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author R4NU54
 */
public class Ejercicio_tema_4_control {

    public static void main(String[] args) {

        // Inicializamos las variables.
        Scanner numero = new Scanner(System.in);
        int numeroIf = 0;
        int numeroWhile = -10;
        int numeroFor = 0;

        // if, else if, else.        
        // Se solicita numero por consola
        System.out.println("Introduce un numero:");
        numeroIf = numero.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero es positivo!!");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo!!");
        } else {
            System.out.println("El numero es cero!!");
        }

        // While
        while (numeroWhile < 3) {
            System.out.println("El numero es: " + numeroWhile);
            numeroWhile++;
        }
        // Do while
        do {
            System.out.println("El numero es: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        // FOR
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numero es: " + numeroFor);
        }

        //Switch
        Scanner estaciones = new Scanner(System.in);
        System.out.println("Introduce estacion: ");
        String estacion = estaciones.nextLine();
        switch (estacion) {
            case "Primavera":
                System.out.println("La estacion es Primavera!!");
                break;
            case "Verano":
                System.out.println("La estacion es Verano!!");
                break;
            case "Otono":
                System.out.println("La estacion es Otoño!!");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno!!");
                break;
            default:
                System.out.println("No es ninguna estacion!!");
        }
    }

}

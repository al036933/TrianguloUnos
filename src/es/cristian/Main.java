package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int filas;
        int numero = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indica la altura, en filas, del triángulo: " );
        filas = entrada.nextInt();

        for (int i = 0; i < filas; i++) {
            System.out.println(numero);
            numero = numero * 10;
        }

        entrada.close();
    }
}

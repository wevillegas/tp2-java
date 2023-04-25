package programacion2.tp2;

import java.util.Scanner;

// Ingresar dos números de cuatro dígitos, expresados en el sistema binario, presentar por pantalla ambos números y su suma.
public class P1 {

    private int binario1, binario2;
    private int i = 0;
    private int re = 0;
    private int[] sum = new int[20];
    Scanner teclado = new Scanner(System.in);

    public void Ejercicio1() {
        System.out.println("Ingrese el primer binario");
        binario1 = teclado.nextInt();
        System.out.println("Ingrese el segundo binario");
        binario2 = teclado.nextInt();

        while (binario1 != 0 || binario2 != 0) {
            sum[i++] = (binario1 % 10 + binario2 % 10 + re) % 2;
            re = (binario1 % 10 + binario2 % 10 + re) / 2;
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }

        if (re != 0) {
            sum[i++] = re;
        }

        --i;
        System.out.println("El resultado der la suma es: ");
        while (i >= 0) {
            System.out.println(sum[i--]);
        }
    }
}

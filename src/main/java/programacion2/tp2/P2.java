package programacion2.tp2;

import java.util.Scanner;

// Se ingresa un número natural, presentar por pantalla el desarrollo del factorial de dicho número, como así también el valor del factorial.
public class P2 {

    private int n, fac, c;
    Scanner teclado = new Scanner(System.in);

    public void Ejercicio2() {
        fac = 1;
        c = 1;
        System.out.println("Ingresa un numero natural");
        n = teclado.nextInt();
        while (c <= n) {
            fac = fac * c;

            System.out.print("*"+c);;

            c = c + 1;
        }
        System.out.print(" = "+fac);
    }

}

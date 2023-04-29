package programacion2.tp2;

import java.util.Scanner;

//  Ingresar las coordenadas de N puntos en el plano, las mismas forman con el origen de 
// coordenadas un triángulo rectángulo. Presentar por pantalla la suma de las superficies 
// negativas y la suma de las positivas, indicar además la cantidad de triángulos en cada cuadrante.
public class P4 {

    private int n, p, t, c, s, k, sp, sn, x, y;
    Scanner teclado = new Scanner(System.in);

    public void Ejercicio4() {
        p = 0;
        t = 0;
        c = 0;
        s = 0;
        k = 0;
        sp = 0;
        sn = 0;

        System.out.println("¿Cantos puntos desea ingresar?");
        n = teclado.nextInt();

        while (c < n) {
            System.out.println("Ingrese el valor de X");
            x = teclado.nextInt();
            System.out.println("Ingrese el valor de Y");
            y = teclado.nextInt();
            if (x >= 0 && y >= 0) {
                p = p + 1;
                sp = sp + (x * y / 2);
            } else if (x < 0) {
                if (y > 0) {
                    s = s + 1;
                    sp = sp + (x * y / 2);
                } else {
                    t = t + 1;
                    sn = sn + (x * y / 2);
                }
            } else {
                k = k + 1;
                sn = sn + (x * y / 2);
            }
            c = c + 1;
        }
        
        System.out.println("Superficio: " + sp);
        System.out.println("Superficie negativa: " + sn);
        System.out.println("Primer cuadrante: " + p);
        System.out.println("Segundo cuadrante: " + s);
        System.out.println("Tercer cuadrante: " + t);
        System.out.println("Cuarto cuadrante: " + k);

    }
}

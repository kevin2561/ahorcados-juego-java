public class Bucles {
    public static void main(String[] args) {

        // FOR
        for (int i = 1; i <= 3; i++) {
            // System.out.println("Tabla del " + i);

            for (int j = 1; j <= 10; j++) {

                // System.out.println(i + " x " + j + " = " + i * j);

            }
            // System.out.println("---------------");

        }

        // WHILE
        int acumulador = 1;
        while (acumulador <= 5) {
            // System.out.println(acumulador);
            acumulador++;
        }

        // }

        // DO WHILE
        int contador = 4;
        do {
            // System.out.println("Antes del ++");
            // System.out.println(contador);

            contador++;
        } while (contador <= 5);
        // System.out.println(contador);

        // for continue
        for (int i = 1; i < 10; i++) {
            // System.out.println(i);
            if (i == 5) {
                // break; // corta el bucle
                continue; // saltea y sigue con el bucle
            }
            // System.out.println("2 vuelta: " + i);

        }

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Variables
        int numero = 5;
        byte xd = 125;
        double decimal = 5.5;
        char letra = 'x';
        String cadena = "hola perros";
        boolean v = false;

        String texto = "TEXTO XXXXXXXXXXXXXX";
        // metodo con en JS
        int longitud = texto.length();
        char let = texto.charAt(5);
        String subString = texto.substring(3, longitud);
        System.out.println(subString);
        String mayuscula = texto.toUpperCase();

        int indice = texto.indexOf("aa");
        System.out.println(indice);

        String remplazado = texto.toLowerCase().replace("texto", "lappp");
        System.out.println(remplazado);

        boolean cotiene = texto.toLowerCase().contains("texto");
        System.out.println("tiene " + cotiene);

        int x = 5;
        int a = 1;
        boolean ww = x > a;
        System.out.println(ww);

        // SWITCH
        String bebida = "caffe";
        switch (bebida) {
            case "cafe":
                System.out.println("tiene " + bebida);
                break;

            case "Gaseosa":
                System.out.println("tiene " + bebida);
                break;

            case "vino":
                System.out.println("tiene " + bebida);
                break;

            default:
                System.out.println("tiene");

                break;
        }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Bienvenidos");
        // System.out.println("1 - Caffe");
        // System.out.println("2 - Gaseosea");
        // System.out.println("3 - Chicha");
        // System.out.println("4 - Maracuya");

        // int option = scanner.nextInt();
        // switch (option) {
        // case 1:
        // System.out.println("Caffe");
        // break;
        // case 2:
        // System.out.println("Gaseosea");
        // break;
        // case 3:
        // System.out.println("Chicha");
        // break;
        // case 4:
        // System.out.println(" Maracuya");
        // break;
        // default:
        // System.out.println(" No valido");

        // break;
        // }
        // scanner.close();

        // BUCLESSSSSSS
        /*
         * for (int i = 1; i <= 3; i++) {
         * for (int j = 1; j <=5; j++) {
         * System.out.print(" i:");
         * System.out.print(i);
         * System.out.print(" j:");
         * System.out.println(j);
         * 
         * 
         * }
         * }
         */

        // WHILE
        /*
         * int contador= 5;
         * while (contador <= 5 ) {
         * System.out.println(contador);
         * contador++;
         * 
         * }
         */
        // DO WHILE
        /*
         * int contador = 1;
         * do {
         * System.out.println("Antes del ++");
         * System.out.println(contador);
         * 
         * contador++;
         * } while (contador <= 5);
         * System.out.println(contador);
         */

        // for (int i = 1; i < 10; i++) {
        // System.out.println(i);
        // if (i == 5) {
        // // break; // corta el bucle
        // continue; //saltea y sigue con el bucle
        // }
        // System.out.println("2 vuelta: " + i);

        // }
        System.out.println("----------------------------");

        // ARREGLOS, si dejas vacio le pone 0 por defecto
        // int[] numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[2] = 3;
        // numeros[3] = 4;
        // numeros[4] = 5;
        // int[] numbers = { 10, 20, 30, 40, 50 };

        // int ind= 0;
        // for (int numerox : numbers) {
        // System.out.println(numerox);
        // System.out.println(ind);

        // ind++;

        // }

        // System.out.println(numbers.length);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);

        // }
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";

        int intentosMaximos = 3;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }

        while (!palabraAdivinada && intentos < intentosMaximos) {

            System.out.println("Palabra adivinada: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length()
                    + " letras)");
            System.out.println("Introduce una letra: ");
            char letrax = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                
                if (palabraSecreta.charAt(i) == letrax) {
                    letrasAdivinadas[i] = letrax;
                    letraCorrecta = true;

                }

            }
            if (!letraCorrecta) {
                intentos++;
                  System.out.println("-----------------");
                System.out.println(" Te quedan " + (intentosMaximos - intentos) + " intentos");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {

                palabraAdivinada = true;
                System.out.println("Ganaste" + palabraSecreta);

            }

        }

        if (!palabraAdivinada) {

            System.out.println("perdiste");

        }
        scanner.close();

    }
}

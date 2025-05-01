import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

      

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

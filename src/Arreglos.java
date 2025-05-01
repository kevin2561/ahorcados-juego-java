import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arreglos {

    public static void main(String[] args) {

        // 1.List o LinkedList o ArrayList -> Listas dinámicas (puedes agregar, quitar,
        // etc.) ;
        // 2. Arrays -> Arreglos clásicos (fijos, tamaño inmutable)
        // 3. List.of -> Listas inmutables (no se pueden modificar)

        // ---------1
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Pedro");
        estudiantes.add("Jose");
        estudiantes.addFirst("Lina");
        System.out.println(estudiantes);

        // --------------- 1.List o LinkedList
        List<String> animales = new LinkedList<>(); // O LinkedList<String> animales = new LinkedList<>();
        animales.add("mono");
        animales.add("ballena");
        animales.add("tucan");
        animales.add("loro");
        animales.add("mono");
        // animales.remove(2);
        // System.out.println(animales);
        // System.out.println(animales.get(1));
        // System.out.println(animales.set(3, "Lagarto"));
        // System.out.println(animales);

        // ---------------- 2. Arrys - clasicos
        double[] decimales = new double[3];
        decimales[0] = 10.99;
        decimales[1] = 20.68;
        decimales[2] = 30.60;
        // System.out.println(Arrays.toString(decimales));

        int[] numeros = { 1, 2, 3, 4, 5, 6 };
        String[] nombres = { "Ana", "Luis" };
        int[][] matriz = {
                { 1, 2 },
                { 3, 4 }
        };
        // System.out.println(Arrays.deepToString(matriz));
        // System.out.println(Arrays.toString(numeros));

        // ---------------- 3. Listas inmutables
        List<String> colores = List.of("Rojo", "Verde", "Azul");
        // colores.add("Amarillo"); // ❌ Lanza excepción
        // System.out.println(colores);

    }
}

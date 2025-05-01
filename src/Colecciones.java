import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
    public static void main(String[] args) {

        // 1. HashSet → No garantiza orden
        // 2. TreeSet → Ordena automáticamente por orden natural (alfabético o numérico)
        // 3. LinkedHashSet → Mantiene el orden en que agregaste los elementos

        // Set<String> superheroes = new HashSet<>(); // No aceptan repetidos
        // superheroes.add("spiderman");
        // superheroes.add("Batman");
        // superheroes.add("Hulk");
        // superheroes.add("iron mAN");
        // superheroes.add("Wonder woman");

        // superheroes.add("Superman");

        // if (superheroes.contains("spiderman")) {
        // System.out.println("Si esta en la fiesta");
        // }
        // superheroes.remove("Hulk");

        // if (!superheroes.contains("hulk")) {
        // System.out.println("Se fue Hulk");

        // }
        // superheroes.add("Superman");

        // if (superheroes.isEmpty()) {
        // System.out.println("No ahy nadie");

        // }else{
        // System.out.println("Aun ahi superheroes" + superheroes.size());

        // }

        // for (String superheroe : superheroes) {
        // System.out.println(superheroe);

        // }

        // 1. HashMap → no ordena (más rápido) / el mas usado
        // 2. TreeMap → ordena por clave (alfabéticamente o numéricamente)
        // 3. LinkedHashMap → mantiene el orden en que agregas los elementos
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Banana", 1.50);
        inventario.put("Tomate", 5.50);
        inventario.put("Palta", 9.50);
        inventario.put("Limon", 10.50);
        System.out.println(inventario);
        // keySet da un arreglo de claves de (Banana, Tomate, Palta, Limon)
        for (String fruta : inventario.keySet()) {
            // get obtengo el valor
            System.out.println(fruta + ": S/" + inventario.get(fruta));

        }

    }

}

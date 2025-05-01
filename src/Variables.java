public class Variables {
    public static void main(String[] args) {
        // Variables
        int numero = 5;
        byte xd = 125;
        double decimal = 5.5;
        char letra = 'x';
        String cadena = "hola perros";
        boolean v = false;

        String texto = "Esto es un ejemplo: Segunda Frase";
        // metodo con en JS
        int longitud = texto.length();
        char caracter = texto.charAt(5); // caracter en espeficio
        System.out.println(caracter);

        String subString = texto.substring(18, longitud); // corta el string
        System.out.println(subString);
        String mayuscula = texto.toUpperCase();

        int indice = texto.indexOf("o", 5); // busca la concurrensia ("N", indece en cual puede buscar en adelante)
        System.out.println(indice);

        String remplazado = texto.toLowerCase().replace("ejemplo", "Caso"); // remplzamos un caracter en especifico
        System.out.println(remplazado);

        boolean cotiene = texto.toLowerCase().contains("ejemplo"); // true o false si esta
        System.out.println("tiene " + cotiene);

        int a = 5;
        int b = 1;
        String result= (a > b) ? a + " es mayor " + b : b + " es menor " + a;
        System.out.println(result);

    }

}
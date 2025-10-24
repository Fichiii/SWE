public class App {
    public static void main(String[] args) throws Exception {
        int number = 34;
        System.out.println(Rechnen.multiply_element_by_42(number));
    }
}

/*
 * Datenkopplung zwischen App und Rechnen
 * Rechnen bekommt nur ein normalen Datentyp (int) von App
 */

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        StudentenManager.druckeNamen(student);
    }
}

/*
 * Es findet eine Datenkopplung zwischen App und StudentenManager statt, da
 * App einen komplexen Datentyp (Student) an StudentenManager übergibt und sonst 
 * nichts bekommt.
 */

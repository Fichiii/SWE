/*
 * Hier findet die kommunikative Bindung statt, da die Methoden dieses Moduls alle mit "Student" arbeiten
 * Beide Methoden sind komplett unabhängig von einander
 */
public class StudentenManager {

    //Berechnet den Notenschnitt
    public static double Notenschnitt(Student student)
    {
        double sum = 0;
        for(int i = 0; i < student.getNoten().length; i++)
        {
            sum += student.getNoten()[i];
        }
        return sum/student.getNoten().length;
    }

    //Gibt zurück, ob Student alt genug ist
    public static boolean check_alter(Student student)
    {

        if(student.getAlter() < 18) { return false; }
        return true;
    }
}

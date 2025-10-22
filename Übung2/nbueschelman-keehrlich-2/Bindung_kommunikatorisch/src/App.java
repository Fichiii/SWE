public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student(new double[] {1.3,2.0,3.3,4.0}, 20);
        
        System.out.println("Der Notenschnitt von student ist: " + StudentenManager.Notenschnitt(student));
        System.out.println("Ist student alt genug? : " + StudentenManager.check_alter(student));
    }
}

public class Student {
    //Attribute
    private double[] noten;
    private int alter;

    //Konstruktor
    public Student(double[] noten, int alter){
        this.noten = noten;
        this.alter = alter;
    }

    //Getter
    public double[] getNoten(){
        return this.noten;
    }

    public int getAlter(){
        return this.alter;
    }
}

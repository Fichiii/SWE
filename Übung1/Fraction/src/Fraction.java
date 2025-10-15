public class Fraction {
    private int zähler;
    private int nenner;

    public Fraction(int n){
        this(n,1);
    }

    public Fraction(int zähler, int nenner){
            if(nenner == 0){ throw new IllegalArgumentException("Man darf nicht durch 0 Teilen!"); }
            this.zähler = zähler /Helper.ggT(zähler,nenner);
            this.nenner = nenner /Helper.ggT(zähler,nenner);

            if(this.nenner < 0){
                this.zähler = -this.zähler;
                this.nenner = -this.nenner;
            }
    }
    
    public Fraction multiply(int factor){
        int newZähler = this.zähler * factor;

        return new Fraction(newZähler, this.nenner);
    }

    public Fraction multiply(Fraction factor){
        int newZähler = this.zähler * factor.zähler;
        int newNenner = this.nenner * factor.nenner;

        return new Fraction(newZähler, newNenner);
    }

    public Fraction multiply(Fraction...factors){
        int newZähler = this.zähler;
        int newNenner = this.nenner;
        for(int i = 0; i < factors.length; i++){
            newZähler *= factors[i].zähler;
            newNenner *= factors[i].nenner;
        }
        return new Fraction(newZähler,newNenner);
    }

    public Fraction divide(Fraction divisor){
        int newZähler = this.zähler * divisor.nenner;
        int newNenner = this.nenner * divisor.zähler;

        return new Fraction(newZähler,newNenner);
    }

    public String toString(){
        return Integer.toString(this.zähler) + "/" + Integer.toString(this.nenner);
    }
}

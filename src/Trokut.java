public class Trokut extends GeometrijskiLIk  {


    private double strA;
    private double strB;
    private double strC;

    public Trokut(String naziv, double strA, double strB, double strC) {
        super(naziv);
        this.strA = strA;
        this.strB = strB;
        this.strC = strC;
    }



    public double getStrA() {
        return strA;
    }

    public void setStrA(double strA) {
        this.strA = strA;
    }

    public double getStrB() {
        return strB;
    }

    public void setStrB(double strB) {
        this.strA = strB;
    }

    public double getStrC() {
        return strC;
    }

    public void setStrC(double strC) {
        this.strA = strC;
    }

    @Override
    public double opseg() {
        return (strA+strB+strC);
    }

    @Override
    public double povrsina()
    {
        double s=(strA+strB+strC)/2;
        return Math.sqrt(s*(s-strA)*(s-strB)*(s-strC));
    }

    @Override
    public String crtaj() {
        return "Trokut";
    }
}

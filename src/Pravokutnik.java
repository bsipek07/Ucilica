public class Pravokutnik extends GeometrijskiLIk {


    private double strA;
    private double strB;

    public Pravokutnik(String naziv, double strA, double strB){
        super(naziv);
        this.strA=strA;
        this.strB=strB;
    }


    public double getStrA(){
        return strA;
    }
    public void setStrA(double strA){
        this.strA=strA;
    }
    public double getStrB(){
        return strB;
    }
    public void setStrB(double strB){
        this.strB=strB;
    }


    @Override
    public double opseg() {
        return (2*(strA+strB));
    }

    @Override
    public double povrsina() {
        return (strA*strB);
    }

    @Override
    public String crtaj() {
        return "Pravokutnik";
    }
}

public class Trokut {

    private String naziv;
    private double strA;
    private double strB;
    private double strC;

    public Trokut(String naziv, double strA, double strB, double strC ){
        this.naziv=naziv;
        this.strA=strA;
        this.strB=strB;
        this.strC=strC;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getStrA(){
        return strA;
    }
    public void setStrA(double strA){
        this.strA = strA;
    }
    public double getStrB(){
        return strB;
    }
    public void setStrB(double strB){
        this.strA = strB;
    }
    public double getStrC(){
        return strC;
    }
    public void setStrC(double strC){
        this.strA = strC;
    }
}

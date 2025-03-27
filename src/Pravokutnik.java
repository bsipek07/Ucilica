public class Pravokutnik {

    private String naziv;
    private double strA;
    private double strB;

    public Pravokutnik(String naziv, double strA, double strB){
        this.naziv=naziv;
        this.strA=strA;
        this.strB=strB;
    }
    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
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
        this.strA=strB;
    }


}

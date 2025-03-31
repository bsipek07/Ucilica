public abstract class GeometrijskiLIk {

    private String naziv;

    public abstract double opseg();

    public abstract double povrsina();

    GeometrijskiLIk(String naziv){
        this.naziv=naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString(){
        return "Naziv: " + naziv + ", Opseg: "+opseg()+", Povrsina: "+povrsina();
    }
}

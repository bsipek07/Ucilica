public abstract class GeometrijskiLIk implements Comparable<GeometrijskiLIk>{

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



    @Override
    public int compareTo(GeometrijskiLIk drugi){
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(drugi.povrsina()));
    }
}

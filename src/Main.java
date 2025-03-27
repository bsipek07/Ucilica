public class Main {

    public static void main (String[] args){

        Krug noviKrug = new Krug("krug1",4.5);
        Krug krug2= new Krug("krug1",4.5);
        Krug krug3=noviKrug;
        Pravokutnik noviPravokutnik = new Pravokutnik("pravokutnik1",5,8);
        Trokut noviTrokut= new Trokut("trokut1",3,4,5);

        if(noviKrug instanceof Krug){
            noviKrug.setRadijus(8.3);
            System.out.println("Novi radijus je: "+noviKrug.getRadijus());
        }

        System.out.println(noviKrug==krug2);
        System.out.println(noviKrug==krug3);

        System.out.println(noviKrug.equals(krug2));

    }
}

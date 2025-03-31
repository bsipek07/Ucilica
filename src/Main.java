import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Krug noviKrug = new Krug("krug1",4.5);
        Pravokutnik noviPravokutnik = new Pravokutnik("pravokutnik1",5,8);
        Trokut noviTrokut= new Trokut("trokut1",3,4,5);

        if(noviKrug instanceof GeometrijskiLIk){
            noviKrug.setRadijus(8.3);
            System.out.println("Novi radijus je: "+noviKrug.getRadijus());
            System.out.println("Povrsina kruga je: "+noviKrug.povrsina()+"\nOpseg kruga je:"+noviKrug.opseg());
        }
        if(noviPravokutnik.getStrA()<=1){
            System.out.println("Unesi ponovo stranicu A:");
            noviPravokutnik.setStrA(input.nextDouble());

            System.out.println("Povrsina pravokutnika je: "+noviPravokutnik.povrsina()+"\nOpseg pravokutnika je:"+noviPravokutnik.opseg());
        }
        else { System.out.println("Povrsina pravokutnika je: "+noviPravokutnik.povrsina()+"\nOpseg pravokutnika je:"+noviPravokutnik.opseg());
        }

        System.out.println(noviTrokut.toString());

        GeometrijskiLIk[] lik = new GeometrijskiLIk[3];
        lik[0]=noviKrug;
        lik[1]=noviPravokutnik;
        lik[2]=noviTrokut;
        for(int i=0;i<3;i++){
            if(lik[i] instanceof Krug){
                System.out.println("Krug");
            }
        }




    }
}

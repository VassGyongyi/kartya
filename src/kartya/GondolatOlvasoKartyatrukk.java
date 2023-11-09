package kartya;

import java.util.Scanner;

public class GondolatOlvasoKartyatrukk {

    static Scanner sc = new Scanner(System.in);
    
     
    
    public static void main(String[] args) {
        //GondolatOlvasoKartyatrukk prg = new GondolatOlvasoKartyatrukk();
       // prg.jatek();egyik megoldás ez a két sor
       new GondolatOlvasoKartyatrukk().jatek();
    }
    private void jatek(){
        Pakli pakli = new Pakli();  
        new Pakli().feltolt();
        for (int i = 0; i < 3; i++) {
            new Pakli().kirak();
            int oszlop = melyik();
           new Pakli().kever(oszlop);
        }
        new Pakli().ezVolt();
    }

   
    
    
   

    private  int melyik() {
        boolean jo;
        int oszlop;
        do{
            System.out.print("melyik oszlop (1-3): ");
            oszlop = Integer.parseInt(sc.nextLine());
            jo = oszlop >= 1 && oszlop <= 3;
        }while(!jo);
        
        return oszlop;
    }

   
    
}

package kartya;

import java.util.Scanner;

public class GondolatOlvasoKartyatrukk {

    static Scanner sc = new Scanner(System.in);
     final int MERET = 22;
     String[] pakli = new String[MERET];
    
    public static void main(String[] args) {
        //GondolatOlvasoKartyatrukk prg = new GondolatOlvasoKartyatrukk();
       // prg.jatek();egyik megoldás ez a két sor
       new GondolatOlvasoKartyatrukk().jatek();
    }
    private void jatek(){
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            kever(oszlop);
        }
        ezVolt();
    }

    private  void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int db = 1;
        for (int sz = 0;sz < szinek.length; sz++) {
            for (int e = 0;db < MERET && e < ertekek.length; e++) {
                pakli[db++] = szinek[sz] + "_" + ertekek[e];
            }
        }
    }
    
    private  void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s", pakli[i]);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
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

    private  void kever(int oszlop) {
        //a választott oszlop középre kerüljön
        String[] uj = new String[MERET];
        switch(oszlop){
            case 1:
                for (int i = 1; i <= 7; i++) {
                    uj[i]    = pakli[20-(i-1)*3];
                    uj[i+7]  = pakli[19-(i-1)*3];
                    uj[i+14] = pakli[21-(i-1)*3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    uj[i]    = pakli[19-(i-1)*3];
                    uj[i+7]  = pakli[20-(i-1)*3];
                    uj[i+14] = pakli[21-(i-1)*3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    uj[i]    = pakli[19-(i-1)*3];
                    uj[i+7]  = pakli[20-(i-1)*3];
                    uj[i+14] = pakli[20-(i-1)*3];
                }
                break;
        }
        pakli = uj;
    }

    private  void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }
    
}

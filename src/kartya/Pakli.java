
package kartya;


public class Pakli {
 
 final int MERET = 22;
Lap[] pakli = new Lap[MERET];

    public Pakli() {
        
    }
     void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int db = 1;
        for (int sz = 0;sz < szinek.length; sz++) {
            for (int e = 0;db < MERET && e < ertekek.length; e++) {
                 
                 String leiras = szinek[sz] + "_" + ertekek[e];
                       pakli[db++]=new Lap(leiras);
            }
        }
    }
      void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s", pakli[i].getLeiras());
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }
       void kever(int oszlop) {
        //a választott oszlop középre kerüljön
        Lap[] uj = new Lap[MERET];
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

    void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }
}

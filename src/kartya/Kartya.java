
package kartya;


import java.util.Scanner;


public class Kartya {

    static String pakli[]= new String[22];  
     
    
    static Scanner sc = new Scanner (System.in);
    private static void kirak() {
        feltolt();
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%-10s", pakli[i]);
            if( i%3==0){
                System.out.println(" ");
            }
        }
    }

    private static void feltolt() {
        int db =1;
         String[] szinek ={"P","T","Z","M"}; 
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"}; 
        for (int i = 1; i < szinek.length; i++) {
            for (int j = 1; j < 22 && j<ertekek.length; j++) {
                pakli[db++]=szinek[i]+"-"+ertekek[j]; 
                
            }
        }
        }
    private static void melyik() {
    System.out.print("Melyik oszlop? (1-3)");
     int oszlop;
     boolean jo;
    do{
      oszlop = Integer.parseInt(sc.nextLine());
      jo=1<=oszlop && oszlop <=3;
    }while (!jo);
    }

    private static void kever() {
   
        // a választott oszlop középre kerül
    }

    private static void ezVolt() {
      
        System.out.println("A választott lap: "+pakli[11]);
    }


    public static void main(String[] args) {
       
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
          
         
    }
     
}

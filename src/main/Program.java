
package main;


public class Program {

    
    public static void main(String[] args) {
        
        int ossz = 0;
        int jo =0;
        for (int s = 5; s <= 100; s++){
            //for (int k = 1; k <= 100; k++){
                for(int j = 3; j <= 75-s; j += 3 ){
                    int k = 100-s-j;
                    if (s + k + j == 100 && s*3.5 + k*0.5 + j*(4.0/3) == 100){
                        System.out.println("sertes = " + s);
                        System.out.println("kecske = " + k);
                        System.out.println("juh = " + j);
                        System.out.println("osszesen = " + (k+s+j));
                        System.out.println("-------------");
                        jo++;
                    }
                   ossz++;
                }
            //}
        }
        System.out.println("ennyiszer fut le: " + ossz);
        System.out.println("ennyi jo megoldas van: " + jo);
    }
}


package maskeleme;

import java.util.Scanner;

public class Maskeleme {
    
    
    
    public static String maske(String adSoyad){   //metod
         int maskln =0;
         String sonuc="";
        String [] dizi = adSoyad.split(" ");
    for( int i=0; i<dizi.length;i++){
        maskln =  dizi[i].length()- 2; 
        sonuc=sonuc+" "+ dizi[i].substring(0,2)+ "x".repeat(maskln);
        
    }
    return  sonuc;//ilk harfe x koy ve substringle maskln'den sonrasını x'e ekle.
}   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("adınız soyadınız");
        String adSoyad=scn.nextLine();
        System.out.println(maske(adSoyad));


    }
    
}

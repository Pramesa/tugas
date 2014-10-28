
package pramesa;

import java.util.Scanner;


public class Pramesa {

   
    public static void main(String[] args) {
      int array,p;
        //inputan panjang array
        System.out.print("Masukkan Panjang Array :");
        array=new Scanner(System.in).nextInt();
        
       
        String nama[]=new String[array];
        int nilai[]=new int[array];
        
      
        //inputan untuk nama dan nilai
        for(p=0;p<array;p++)
        {
            System.out.print("Masukkan Nama Ke-"+(p+1)+" =");
            nama[p]=new Scanner(System.in).nextLine();
            System.out.print("Masukkan Nilai Ke-"+(p+1)+" =");
            nilai[p]=new Scanner(System.in).nextInt();
        }   
            //Output
        System.out.println("");
         for(p=0;p<array;p++)
        {
            System.out.println("Nama Ke"+(p+1)+" :"+nama[p]+" Dengan Nilai "+nilai[p]);
                      
        }   
            
    }
}

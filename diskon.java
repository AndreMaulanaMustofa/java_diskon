import java.util.Scanner;
   
public class diskon {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Diskon Potongan Harga ##");
    System.out.println("========================================");
    System.out.println();
     
    int total_belanja;
    double harga_akhir;
     
    System.out.print("Total Belanja: Rp.");
    total_belanja = input.nextInt();
    System.out.println();
     
    if ((total_belanja >= 100000) && (total_belanja < 500000)) {
      harga_akhir = total_belanja - (0.1*total_belanja);
      System.out.println("Selamat, anda mendapat diskon 10%");
    }
    else if ((total_belanja >= 500000) && (total_belanja < 1000000)) {
      harga_akhir = total_belanja - (0.2*total_belanja);
      System.out.println("Selamat, anda mendapat diskon 20%");
    }
    else if (total_belanja >= 1000000) {
      harga_akhir = total_belanja - (0.3*total_belanja);
      System.out.println("Selamat, anda mendapat diskon 30%");
    } 
    else {
      harga_akhir = total_belanja;
    }
  
  System.out.println("Total bayar: Rp."+ harga_akhir);
 
  }
}
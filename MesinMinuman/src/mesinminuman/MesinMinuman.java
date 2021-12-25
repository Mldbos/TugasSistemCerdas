package mesinminuman;
import java.util.Scanner;
public class MesinMinuman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu Minuman : ");
        System.out.println("_________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Sprite           Rp 6000,00");
        System.out.println("2. Pepsi            Rp 8000,00");
        System.out.println("3. Adem Sari        Rp 6500,00");
        System.out.println("4. Fruit tea        Rp 5000,00");
        System.out.println("");
        
        int harga = 0;
        int m1 = 6000, m2 = 8000, m3 = 6500, m4 = 5000;
        String menu;
        for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
            System.out.print("Masukkan Nomor Pesanan Anda ");
            int inNomor = scan.nextInt();
            System.out.println("___________________________________________________________________");
            if(inNomor == 1){
                menu = " Sprite ";
                System.out.println("Pilihan Anda Nomor = " + inNomor + menu);
                harga = harga + m1;
            }
            else if(inNomor == 2){
                menu = " Pepsi ";
                System.out.println("Pilihan Anda Nomor = " + inNomor + menu);
                harga = harga + m2;
            }
            else if(inNomor == 3){
                menu = " Adem Sari ";
                System.out.println("Pilihan Anda Nomor = " + inNomor + menu);
                harga = harga + m3;
            }
            else if (inNomor == 4){
                menu = " Fruit tea ";
                System.out.println("Pilihan Anda Nomor = " + inNomor + menu);
                harga = harga + m4;
            }
            else{
                System.out.println("Nomor Yang Anda Pilih Tidak Ada Pada Pilihan Menu");
            }
            System.out.println("Apakah Anda Ingin Memilih Menu Lain ? Y/T");
            i = scan.next();
        }
         System.out.println("___________________________________________________________________");
         System.out.println("Total Pembayaran Yang Anda Harus Bayar = " + harga +".");
         System.out.println("Terimakasih Banyak Atas Kunjungannya");
    }
    
}

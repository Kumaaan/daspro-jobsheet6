import java.util.Scanner;
public class TugasLatihan2 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String jenisBuku, rabu;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc01.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc01.nextInt();
        sc01.nextLine(); 
        System.out.print("Apakah sekarang hari rabu (yes/no) ? = ");
        rabu = sc01.nextLine();

        if (rabu.equalsIgnoreCase("yes")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {   
                if (jumlahBuku > 2) {
                System.out.println("Diskon 10% + 2%");
                } else {
                System.out.println("Diskon 10%");
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")){
                if (jumlahBuku > 3) {
                    System.out.println("Diskon 7% + 2%");
                } else {
                    System.out.println("Diskon 7% + 1%");
                } 
            } else {
                if (jumlahBuku > 3) {
                    System.out.println("Diskon 5%");
                } else {
                    System.out.println("Tidak dapat diskon");
                }
            }
        } else if (rabu.equalsIgnoreCase("no")){
            System.out.println("Tidak dapat diskon");
        }sc01.close();
    }
}

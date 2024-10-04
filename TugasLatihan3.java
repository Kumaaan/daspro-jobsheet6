import java.util.Scanner;
public class TugasLatihan3 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String merk, kategori;
        byte ukuran;

        System.out.print("Masukkan merk sepatu: ");
        merk = sc01.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = sc01.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = sc01.nextByte();

        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if(ukuran >=36) {
                    if(ukuran <=40) {
                        System.out.println("Harga sepatu: Rp. 800000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }else if (kategori.equalsIgnoreCase("high on")) {
                if(ukuran >=40) {
                    if(ukuran <=44) {
                        System.out.println("Harga sepatu: Rp. 1200000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if(ukuran >=36) {
                    if(ukuran <=41) {
                        System.out.println("Harga sepatu: Rp. 1000000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }else if (kategori.equalsIgnoreCase("man")) {
                if(ukuran >=41) {
                    if(ukuran <=44) {
                        System.out.println("Harga sepatu: Rp. 1800000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if(ukuran >=36) {
                    if(ukuran <=40) {
                        System.out.println("Harga sepatu: Rp. 750000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    } 
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if(ukuran >=40) {
                    if(ukuran <=44) {
                        System.out.println("Harga sepatu: Rp. 1500000");
                    }else {
                        System.out.println("Ukuran tidak tersedia");
                    }
                }else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        }else {
            System.out.println("Merk tidak tersedia");
        }
        sc01.close();
    }
}

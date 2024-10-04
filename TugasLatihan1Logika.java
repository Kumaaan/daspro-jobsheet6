import java.util.Scanner;
public class TugasLatihan1Logika {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        double bil1, bil2, bil3;

        System.out.print("Masukkan Bilangan ke-1: ");
        bil1 = sc01.nextDouble();
        System.out.print("Masukkan Bilangan ke-2: ");
        bil2 = sc01.nextDouble();
        System.out.print("Masukkan Bilangan ke-3: ");
        bil3 = sc01.nextDouble();

        if (bil1 > bil2 && bil1 > bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil1);
        } else if (bil2 > bil1 && bil2 > bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil2);
        } else {
            System.out.println("Bilangan terbesar adalah: " + bil3);
        }
        sc01.close();
    }
}

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tong so ngay o N: ");
        int n = sc.nextInt();

        System.out.print("Nhap so ngay dau K: ");
        int k = sc.nextInt();

        System.out.print("Nhap gia moi ngay trong K ngay dau X: ");
        long x = sc.nextLong();

        System.out.print("Nhap gia moi ngay sau K ngay Y: ");
        long y = sc.nextLong();

        long tongTien;

        if (n <= k) {
            // Tat ca ngay o deu tinh theo gia X
            tongTien = n * x;
        } else {
            // K ngay dau gia X, cac ngay con lai gia Y
            tongTien = k * x + (n - k) * y;
        }

        System.out.println("Tong tien: " + tongTien + " VND");

        sc.close();
        
    }
}
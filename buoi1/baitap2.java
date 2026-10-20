import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so coc nuoc da ban
        System.out.print("Nhap so coc nuoc: ");
        int n = sc.nextInt();

        // Tinh tien ban nuoc: moi coc duoc 0.5 dollar
        double tienBanNuoc = n * 0.5;

        // Cu du 50 coc thi duoc thuong 5 dollar
        int soNhom = n / 50;
        double tienThuong = soNhom * 5.0;

        // Cong tien ban nuoc va tien thuong
        double tongTien = tienBanNuoc + tienThuong;

        System.out.println("Tong tien: " + tongTien + " dollar");

        sc.close();
    }
}
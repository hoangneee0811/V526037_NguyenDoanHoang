import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Buoc 1: Nhap n va kiem tra so duong
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("n phai lon hon 0. Nhap lai: ");
            n = sc.nextInt();
        }

        // Buoc 2: Ban dau co 1 nguoi, chua phan than
        long soNguoi = 1;
        int soLan = 0;

        // Buoc 3: Con thieu nguoi thi tiep tuc phan than
        while (soNguoi < n) {
            soNguoi = soNguoi * 2;
            soLan = soLan + 1;
        }

        // Buoc 4: In ket qua
        System.out.println("So lan phan than it nhat: " + soLan);

        sc.close();
    }
}
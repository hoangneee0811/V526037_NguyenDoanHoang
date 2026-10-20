import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhap so luong phan tu
        System.out.print("Nhap so luong phan tu n: ");
        int n = sc.nextInt();

        // Bai nay quy uoc mang co it nhat 1 phan tu
        while (n <= 0) {
            System.out.print("Hay nhap n lon hon 0: ");
            n = sc.nextInt();
        }

        // 2. Tao mang gom n so nguyen
        int[] a = new int[n];

        // 3. Nhap tung phan tu vao mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // 4. Tinh tong cac phan tu
        long tong = 0;

        for (int i = 0; i < n; i++) {
            tong = tong + a[i];
        }

        // 5. In ket qua
        System.out.println("Tong cac phan tu: " + tong);

        sc.close();
    }
}
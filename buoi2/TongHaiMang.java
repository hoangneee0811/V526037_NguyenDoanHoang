import java.util.Scanner;
public class TongHaiMang {
    public static void inMangTong(int[] a, int[] b) {
        int doDai = Math.max(a.length, b.length);
        long[] c = new long[doDai];
        for (int i = 0; i < doDai; i++) {
            if (i < a.length) {
                c[i] = c[i] + a[i];
            }
            if (i < b.length) {
                c[i] = c[i] + b[i];
            }
        }
        System.out.print("Mang tong: ");
        for (int i = 0; i < doDai; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.print("Nhap lai n >= 0: ");
            n = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap so phan tu mang b: ");
        int m = sc.nextInt();
        while (m < 0) {
            System.out.print("Nhap lai m >= 0: ");
            m = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap b[" + i + "]: ");
            b[i] = sc.nextInt();
        }
        inMangTong(a, b);
        sc.close();
    }
}
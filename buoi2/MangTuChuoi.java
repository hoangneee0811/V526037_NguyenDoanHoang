import java.util.Scanner;

public class MangTuChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap ca dong va bo khoang trang o hai dau.
        System.out.print("Nhap cac so nguyen cach nhau boi dau cach: ");
        String dong = sc.nextLine().trim();

        // Yeu cau nhap it nhat mot so.
        while (dong.isEmpty()) {
            System.out.print("Hay nhap it nhat mot so nguyen: ");
            dong = sc.nextLine().trim();
        }

        // Tach dong thanh cac chuoi con, chap nhan nhieu dau cach.
        String[] cacSo = dong.split("\\s+");
        int[] a = new int[cacSo.length];
        long tong = 0;

        // Chuyen tung chuoi con thanh so nguyen va cong don.
        for (int i = 0; i < cacSo.length; i++) {
            a[i] = Integer.parseInt(cacSo[i]);
            tong = tong + a[i];
        }

        System.out.println("So phan tu: " + a.length + "; Tong: " + tong);
        sc.close();
    }
}

public class baitap2 {
    static class Diem {
        private double x;
        private double y;

        public Diem(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double khoangCach(Diem diemKhac) {
            double dx = diemKhac.x - this.x;
            double dy = diemKhac.y - this.y;
            return Math.hypot(dx, dy);
        }
    }

    static class TamGiac {
        private Diem A;
        private Diem B;
        private Diem C;

        public TamGiac(Diem A, Diem B, Diem C) {
            this.A = A;
            this.B = B;
            this.C = C;
            if (tinhDienTich() == 0) {
                throw new IllegalArgumentException("Ba diem phai tao thanh tam giac.");
            }
        }

        public double tinhChuVi() {
            return A.khoangCach(B) + B.khoangCach(C) + C.khoangCach(A);
        }

        public double tinhDienTich() {
            // Cong thuc dien tich tam giac theo toa do.
            double abX = B.getX() - A.getX();
            double abY = B.getY() - A.getY();
            double acX = C.getX() - A.getX();
            double acY = C.getY() - A.getY();
            return Math.abs(abX * acY - abY * acX) / 2.0;
        }
    }

    static class ChuNhat {
        private double chieuDai;
        private double chieuRong;

        public ChuNhat(double chieuDai, double chieuRong) {
            if (chieuDai <= 0 || chieuRong <= 0) {
                throw new IllegalArgumentException("Hai canh phai lon hon 0.");
            }
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }

        public double tinhChuVi() {
            return 2 * (chieuDai + chieuRong);
        }

        public double tinhDienTich() {
            return chieuDai * chieuRong;
        }
    }

    static class HinhTron {
        private Diem O;
        private double banKinh;

        public HinhTron(Diem O, double banKinh) {
            if (banKinh <= 0) {
                throw new IllegalArgumentException("Ban kinh phai lon hon 0.");
            }
            this.O = O;
            this.banKinh = banKinh;
        }

        public double tinhChuVi() {
            return 2 * Math.PI * banKinh;
        }

        public double tinhDienTich() {
            return Math.PI * banKinh * banKinh;
        }
    }

    public static void main(String[] args) {
        // Tao 2 tam giac, 2 chu nhat va 2 hinh tron theo de bai.
        TamGiac tg1 = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4));
        TamGiac tg2 = new TamGiac(new Diem(0, 0), new Diem(6, 0), new Diem(0, 8));
        ChuNhat cn1 = new ChuNhat(5, 3);
        ChuNhat cn2 = new ChuNhat(8, 4);
        HinhTron ht1 = new HinhTron(new Diem(0, 0), 2);
        HinhTron ht2 = new HinhTron(new Diem(1, 2), 5);

        System.out.printf("Tam giac 1: Chu vi = %.2f; Dien tich = %.2f%n", tg1.tinhChuVi(), tg1.tinhDienTich());
        System.out.printf("Tam giac 2: Chu vi = %.2f; Dien tich = %.2f%n", tg2.tinhChuVi(), tg2.tinhDienTich());
        System.out.printf("Chu nhat 1: Chu vi = %.2f; Dien tich = %.2f%n", cn1.tinhChuVi(), cn1.tinhDienTich());
        System.out.printf("Chu nhat 2: Chu vi = %.2f; Dien tich = %.2f%n", cn2.tinhChuVi(), cn2.tinhDienTich());
        System.out.printf("Hinh tron 1: Chu vi = %.2f; Dien tich = %.2f%n", ht1.tinhChuVi(), ht1.tinhDienTich());
        System.out.printf("Hinh tron 2: Chu vi = %.2f; Dien tich = %.2f%n", ht2.tinhChuVi(), ht2.tinhDienTich());
    }
}

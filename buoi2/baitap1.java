public class baitap1 {
    // Dat lop Diem ben trong baitap1 de khong trung voi Diem cua bai 2.
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

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

    static class DuongThang {
        private Diem A;
        private Diem B;

        public DuongThang(Diem A, Diem B) {
            this.A = A;
            this.B = B;
        }

        public Diem getA() {
            return A;
        }

        public Diem getB() {
            return B;
        }

        public double tinhDoDai() {
            double dx = B.getX() - A.getX();
            double dy = B.getY() - A.getY();
            return Math.hypot(dx, dy);
        }
    }

    public static void main(String[] args) {
        Diem A = new Diem(0, 0);
        Diem B = new Diem(3, 4);
        DuongThang AB = new DuongThang(A, B);

        System.out.println("A = (" + AB.getA().getX() + ", " + AB.getA().getY() + ")");
        System.out.println("B = (" + AB.getB().getX() + ", " + AB.getB().getY() + ")");
        System.out.println("Do dai AB: " + AB.tinhDoDai());

        // Minh hoa thay doi toa do bang setter.
        B.setX(6);
        B.setY(8);
        System.out.println("Sau khi doi B thanh (6, 8), do dai AB: " + AB.tinhDoDai());
    }
}

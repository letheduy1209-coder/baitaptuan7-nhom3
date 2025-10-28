package tuan8;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();

        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Java Co Ban", "Nguyen Van A", 2020, 10, 50000, "Lap trinh", "Dai hoc");
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "Rowling", 1997, 15, 100000, "Phieu luu", true);

        quanLy.themSach(gt);
        quanLy.themSach(tt);

        System.out.println("DANH SACH SACH");
        quanLy.hienThiDanhSach();

        System.out.println("TIM KIEM SACH");
        System.out.println("Tim kiem sach co ma TT01:");
        Sach kq = quanLy.timKiemSach("TT01");
        if (kq != null) {
            System.out.println(kq);
        } else {
            System.out.println("Khong tim thay sach.");
        }

        System.out.println("\nKIEM TRA TON KHO");
        System.out.println("Kiem tra sach GT01 voi so luong toi thieu 5:");
        boolean tonKho = gt.kiemTraTonKho(5);
        System.out.println("Ket qua: " + (tonKho ? "Du so luong" : "Khong du so luong"));

        System.out.println("\nCAP NHAT VI TRI");
        gt.capNhatViTri("Khu A - Ke 3");

        System.out.println("\nXOA SACH GT01");
        quanLy.xoaSach("GT01");

        System.out.println("\nDANH SACH SAU KHI XOA");
        quanLy.hienThiDanhSach();
    }
}
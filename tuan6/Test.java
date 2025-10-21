package tuan6;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Java Cơ Bản", "Nguyễn Văn A", 2020, 10, "Lập trình", "Đại học");
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "Rowling", 1997, 15, "Phiêu lưu", true);
        ql.themSach(gt);
        ql.themSach(tt);
        ql.hienThiDanhSach();
        System.out.println("\nTìm kiếm sách có mã TT01:");
        Sach kq = ql.timSach("TT01");
        if (kq != null) {
            System.out.println(kq);
        } else {
            System.out.println("Không tìm thấy sách.");
        }
        ql.xoaSach("GT01");
        ql.hienThiDanhSach();
    }
}

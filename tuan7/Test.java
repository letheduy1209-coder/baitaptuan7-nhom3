package tuan7;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng QuanLySach
        QuanLySach ql = new QuanLySach();

        // Tạo các đối tượng sách với giá cơ bản
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Java Cơ Bản", "Nguyễn Văn A", 2020, 10, 50000, "Lập trình", "Đại học");
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "Rowling", 1997, 15, 100000, "Phiêu lưu", true);

        // Thêm sách vào danh sách
        ql.themSach(gt);
        ql.themSach(tt);

        // Hiển thị danh sách sách
        System.out.println("DANH SÁCH SÁCH ");
        ql.hienThiDanhSach();

        // Tìm kiếm sách
        System.out.println(" TÌM KIẾM SÁCH");
        System.out.println("Tìm kiếm sách có mã TT01:");
        Sach kq = ql.timSach("TT01");
        if (kq != null) {
            System.out.println(kq);
        } else {
            System.out.println("Không tìm thấy sách.");
        }

        // Xóa sách
        System.out.println(" XÓA SÁCH GT01");
        ql.xoaSach("GT01");

        // Hiển thị danh sách sau khi xóa
        System.out.println(" DANH SÁCH SAU KHI XÓA");
        ql.hienThiDanhSach();
    }
}

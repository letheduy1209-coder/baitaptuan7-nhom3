

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo tối thiểu 1 sách giáo trình và 1 sách tiểu thuyết theo đề bài
        SachGiaoTrinh sgk = new SachGiaoTrinh("GT01", "Toan Cao Cap", "Nguyen Van A",
                2020, 50, 120000.0, "Ke A1");
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling",
                2019, 30, 180000.0, true, "Ke B2");

        // Thêm vào quản lý
        ql.themSach(sgk);
        ql.themSach(tt);

        // Hiển thị danh sách và giá bán ước tính
        ql.hienThiDanhSachSach();

        // Thực hiện kiểm kê bằng interface IKiemKe
        System.out.println("\n===== KIEM KE =====");
        IKiemKe k1 = sgk; // tham chiếu bằng interface
        IKiemKe k2 = tt;

        System.out.println("Sach giao trinh con du ton kho (>=40)? " + k1.kiemTraTonKho(40));
        System.out.println("Sach tieu thuyyt con du ton kho (>=40)? " + k2.kiemTraTonKho(40));

        // Cập nhật vị trí
        k1.capNhatViTri("Kho A-Ke 5");
        k2.capNhatViTri("Kho B-Ke 1");

        // Hiển thị lại sau cập nhật
        System.out.println("\n===== SAU KHI CAP NHAT VI TRI =====");
        ql.hienThiDanhSachSach();
    }
}

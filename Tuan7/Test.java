public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng sách giáo trình
        SachGiaoTrinh sg = new SachGiaoTrinh("SG01", "Lập trình Java", "Nguyễn Văn A",
                2020, 120, 50000, "Lập trình", "Đại học");

        // Tạo đối tượng sách tiểu thuyết
        SachTieuThuyet stt = new SachTieuThuyet("ST01", "Harry Potter", "J.K. Rowling",
                2005, 50, 70000, "Phiêu lưu", true);

        // Thêm vào quản lý sách
        ql.themSach(sg);
        ql.themSach(stt);

        // Hiển thị danh sách sách
        ql.hienThiDanhSachSach();

        // Kiểm tra interface IKiemKe
        IKiemKe kiemKe = sg;
        System.out.println("Kiểm tra tồn kho (yêu cầu >=100): " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}

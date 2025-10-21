public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý
        QuanLySach ql = new QuanLySach();

        // Tạo một số sách
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A", 2023, 10, "Công nghệ thông tin", "Đại học");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Nhà giả kim", "Paulo Coelho", 2010, 5, "Triết lý", false);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "Harry Potter", "J.K. Rowling", 2001, 20, "Phiêu lưu", true);

        // Thêm vào danh sách
        ql.themSach(gt1);
        ql.themSach(tt1);
        ql.themSach(tt2);

        // Hiển thị toàn bộ sách
        System.out.println("=== DANH SÁCH SÁCH BAN ĐẦU ===");
        ql.hienThiTatCa();

        // Tìm kiếm
        System.out.println("\n🔍 Tìm kiếm sách có mã TT01:");
        Sach sachTim = ql.timKiemSach("TT01");
        if (sachTim != null) {
            System.out.println(sachTim);
        } else {
            System.out.println("Không tìm thấy!");
        }

        // Cập nhật
        System.out.println("\n✏️ Cập nhật sách có mã GT01...");
        SachGiaoTrinh sachMoi = new SachGiaoTrinh("GT01", "OOP Nâng Cao", "Nguyễn Văn B", 2024, 15, "Lập trình nâng cao", "Đại học");
        ql.capNhatSach("GT01", sachMoi);

        // Hiển thị sau khi cập nhật
        System.out.println("\n=== DANH SÁCH SAU KHI CẬP NHẬT ===");
        ql.hienThiTatCa();

        // Xóa sách
        System.out.println("\n🗑️ Xóa sách có mã TT02...");
        ql.xoaSach("TT02");

        // Hiển thị sau khi xóa
        System.out.println("\n=== DANH SÁCH SAU KHI XÓA ===");
        ql.hienThiTatCa();
    }
}

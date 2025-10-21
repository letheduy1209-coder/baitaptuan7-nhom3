// Yêu cầu 3: Xây dựng lớp Test để tạo đối tượng từ lớp Sach
public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);

        // Tạo đối tượng sách bằng constructor không tham số + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu và Giải thuật");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2023);
        sach2.setSoLuong(5);

        // Hiển thị thông tin các sách
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}

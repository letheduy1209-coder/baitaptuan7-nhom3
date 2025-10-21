package tuan5;
public class Test {
    public static void main(String[] args) {
        Sach laptrinh = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2021, 10);
        Sach ctdlgt = new Sach();
        ctdlgt.setMaSach("B002");
        ctdlgt.setTieuDe("Cấu trúc dữ liệu");
        ctdlgt.setTacGia("Trần Thị B");
        ctdlgt.setNamXuatBan(2020);
        ctdlgt.setSoLuong(5);

        laptrinh.hienThiThongTin();
        ctdlgt.hienThiThongTin();
    }
}

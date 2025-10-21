// Lớp SachTieuThuyet kế thừa từ Sach và triển khai IKiemKe
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double gia = getGiaCoBan();
        if (laSachSeries) gia += 15000;
        return gia;
    }

    @Override
    public String toString() {
        return "Sách tiểu thuyết [" + getTieuDe() + "] - Thể loại: " + theLoai +
                ", Series: " + (laSachSeries ? "Có" : "Không") +
                ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }

    // Triển khai giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}

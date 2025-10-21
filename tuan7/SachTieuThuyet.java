
/**
 * Sách tiểu thuyết:
 * - Nếu laSachSeries == true : giaBan = giaCoBan + 15000
 * - Ngược lại: giaBan = giaCoBan (+ có thể trừ/không)
 * (mình làm theo đề: cộng 15000 nếu series, ngược lại giữ nguyên)
 */
public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;
    private String viTriKe;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          int namXuatBan, int soLuong, double giaCoBan,
                          boolean laSachSeries, String viTriKe) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
        this.viTriKe = viTriKe;
    }

    @Override
    public double tinhGiaBan() {
        if (laSachSeries) {
            return giaCoBan + 15000.0;
        } else {
            return giaCoBan; // theo đề: không cộng gì nếu không phải series
        }
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n--- Sach Tieu Thuyet ---");
        super.hienThiThongTin();
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VND");
        System.out.println("Sach series: " + (laSachSeries ? "Co" : "Khong"));
        System.out.println("Vi tri ke: " + viTriKe);
    }

    // IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTriKe = viTriMoi;
        System.out.println("da chuyen sach [" + tieuDe + "] den khu vuc: " + viTriMoi);
    }
}

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private String series;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXB, double giaGoc, int soLuong, String viTri, String theLoai, String series) {
        super(maSach, tenSach, tacGia, namXB, giaGoc, soLuong, viTri);
        this.theLoai = theLoai;
        this.series = series;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaGoc() * 1.5; // Giá bán = giá gốc * 1.5
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Thể loại: %s | Series: %s | Giá bán: %.2f", theLoai, series, tinhGiaBan());
    }
}

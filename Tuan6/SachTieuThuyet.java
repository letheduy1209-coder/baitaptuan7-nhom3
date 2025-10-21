// Lớp SachTieuThuyet kế thừa từ lớp Sach (Tuần 6)
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    // Constructor đầy đủ tham số
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    // Getter & Setter
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "📘 [Sách Tiểu Thuyết]" +
               "\n" + super.toString() +
               "\nThể loại: " + theLoai +
               "\nThuộc series: " + (laSachSeries ? "Có" : "Không");
    }
}

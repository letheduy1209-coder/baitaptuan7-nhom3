public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return "Sach Tieu Thuyet {" +
                "Ma Sach='" + getMaSach() + '\'' +
                ", Tieu de='" + getTieuDe() + '\'' +
                ", Tac gia='" + getTacGia() + '\'' +
                ", Nam xuat ban=" + getNamXuatBan() +
                ", So luong=" + getSoLuong() +
                ", The loai='" + theLoai + '\'' +
                ", La series=" + (laSachSeries ? "Co" : "Khong") +
                '}';
    }
}


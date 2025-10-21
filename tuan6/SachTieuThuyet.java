package tuan6;

public class SachTieuThuyet extends Sach{
    private String teLoai;
    private boolean laSachSeries;
    public SachTieuThuyet() {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String teLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.teLoai = teLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTeLoai() {
        return this.teLoai;
    }
    public void setTeLoai(String teLoai) {
        this.teLoai = teLoai;
    }
    public boolean isLaSachSeries() {
        return this.laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    @Override
    public String toString() {
        return "{" +
                " teLoai='" + getTeLoai() + "'" +
                ", laSachSeries='" + isLaSachSeries() + "'" +
                "}";
    }
}

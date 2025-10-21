package tuan7;

public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet()
    {
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai()
    {
        return theLoai;
    }
    public void setTheLoai(String theLoai)
    {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries()
    {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries)
    {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan()
    {
        return getgiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString()
    {
        return "Sach Tieu Thuyet {" +
                "Ma sach='" + getMaSach() + '-' +
                "- Tieude='" + getTieuDe() + '-' +
                "- Tac gia='" + getTacGia() + '-' +
                "- Nam XB=" + getNamXuatBan() +
                "- SL=" + getSoLuong() +
                "- The loai='" + theLoai + '-' +
                "- La series=" + (laSachSeries ? "Co" : "Khong") +
                "- Gia co ban=" + getgiaCoBan() +
                "- Gia ban=" + tinhGiaBan() + " VND" +
                '}';
    }

}
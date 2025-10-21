package tuan6;
public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String CapDo;
    public SachGiaoTrinh() {
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String CapDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.CapDo = CapDo;
    }
    public String getMonHoc() {
        return this.monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    public String getCapDo() {
        return this.CapDo;
    }
    public void setCapDo(String CapDo) {
        this.CapDo = CapDo;
    }

    @Override
    public String toString() {
        return "{" +
                " monHoc='" + getMonHoc() + "'" +
                ", CapDo='" + getCapDo() + "'" +
                "}";
    }
}

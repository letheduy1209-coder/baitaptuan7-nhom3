package tuan8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "Sach Giao Trinh {" +
                "Ma sach='" + getMaSach() + '\'' +
                ", Tieu de='" + getTieuDe() + '\'' +
                ", Tac gia='" + getTacGia() + '\'' +
                ", Nam XB=" + getNamXuatBan() +
                ", So luong=" + getSoLuong() +
                ", Mon hoc='" + monHoc + '\'' +
                ", Cap do='" + capDo + '\'' +
                ", Gia co ban=" + getGiaCoBan() + " VND" +
                ", Gia ban=" + tinhGiaBan() + " VND" +
                '}';
    }
}
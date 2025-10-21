package tuan7;

public abstract class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    protected double giaCoBan;
    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return this.maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return this.tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return this.tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return this.namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {

        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {

        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {

        this.soLuong = soLuong;
    }
    public double getgiaCoBan() {
        return this.giaCoBan;
    }
    public void setgiaCoBan(int giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tiêu đề: " + this.tieuDe);
        System.out.println("Tác giả: " + this.tacGia);
        System.out.println("Năm xuất bản: " + this.namXuatBan);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("");
    }
    public abstract double tinhGiaBan();
}

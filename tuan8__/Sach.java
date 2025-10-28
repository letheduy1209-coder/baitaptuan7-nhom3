public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private double giaGoc;
    private int soLuong;
    private String viTri;

    public Sach(String maSach, String tenSach, String tacGia, int namXB, double giaGoc, int soLuong, String viTri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.giaGoc = giaGoc;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXB() { return namXB; }
    public void setNamXB(int namXB) { this.namXB = namXB; }

    public double getGiaGoc() { return giaGoc; }
    public void setGiaGoc(double giaGoc) { this.giaGoc = giaGoc; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    // Abstract Method
    @Override
    public abstract double tinhGiaBan();

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã cập nhật vị trí mới: " + viTriMoi);
    }

    @Override
    public String toString() {
        return String.format("Mã: %s | Tên: %s | Tác giả: %s | Năm: %d | Giá gốc: %.2f | SL: %d | Vị trí: %s",
                maSach, tenSach, tacGia, namXB, giaGoc, soLuong, viTri);
    }
}

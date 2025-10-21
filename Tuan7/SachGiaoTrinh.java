// Lớp SachGiaoTrinh kế thừa từ Sach và triển khai giao diện IKiemKe
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Ghi đè phương thức tính giá bán
    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Sách giáo trình [" + getTieuDe() + "] - Môn: " + monHoc +
                ", Cấp độ: " + capDo +
                ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }

    // Triển khai giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}

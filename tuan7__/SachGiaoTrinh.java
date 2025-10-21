

/**
 * Sách giáo trình: giá bán = giaCoBan + (số năm đã xuất bản * 5000)
 * (theo đề bài: số năm tính tới 2025)
 */
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String viTriKe;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong, double giaCoBan, String viTriKe) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.viTriKe = viTriKe;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        if (soNam < 0) soNam = 0;
        return giaCoBan + soNam * 5000.0;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n--- Sach Giao Trinh ---");
        super.hienThiThongTin();
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VND");
        System.out.println("Vi Tri Ke: " + viTriKe);
    }

    // IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTriKe = viTriMoi;
        System.out.println("da chuyen sach [" + tieuDe + "] den khu vuc: " + viTriMoi);
    }
}

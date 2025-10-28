public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, int namXB, double giaGoc, int soLuong, String viTri, String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, namXB, giaGoc, soLuong, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaGoc() * 1.2; // Giá bán = giá gốc * 1.2
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Môn học: %s | Cấp độ: %s | Giá bán: %.2f", monHoc, capDo, tinhGiaBan());
    }
}

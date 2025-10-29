public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
            int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + soNam * 5000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMôn học: " + monHoc +
                "\nCấp độ: " + capDo +
                "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}

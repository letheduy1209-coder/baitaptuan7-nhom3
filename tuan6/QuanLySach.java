import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach s = timKiem(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    // Cập nhật thông tin (VD: số lượng)
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timKiem(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat luong sach " + maSach + " thanh: " + soLuongMoi);
        } else {
            System.out.println("Khong tim thay sach de cap nhat!");
        }
    }

    // Tìm kiếm sách theo mã
    public Sach timKiem(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị danh sách
    public void hienThiDanhSach() {
        System.out.println("DANH SACH HIEN CO:");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}

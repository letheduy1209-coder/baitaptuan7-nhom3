import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    // Cập nhật thông tin (theo mã)
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.set(i, sachMoi);
                return;
            }
        }
    }

    // Tìm kiếm theo mã
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị danh sách sách
    public void hienThiTatCa() {
        if (danhSachSach.isEmpty()) {
            System.out.println("📂 Danh sách sách trống!");
        } else {
            for (Sach s : danhSachSach) {
                s.hienThiThongTin();
                System.out.println("----------------------------");
            }
        }
    }
}

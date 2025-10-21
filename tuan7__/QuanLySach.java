

import java.util.ArrayList;

/**
 * Lớp quản lý danh sách sách
 */
public class QuanLySach {
    private ArrayList<Sach> dsSach = new ArrayList<>();

    public void themSach(Sach s) {
        dsSach.add(s);
    }

    // Hiển thị thông tin toàn bộ sách (gọi phương thức override)
    public void hienThiDanhSachSach() {
        System.out.println("\n===== DANH SACH SACH =====");
        for (Sach s : dsSach) {
            s.hienThiThongTin();
        }
    }
}

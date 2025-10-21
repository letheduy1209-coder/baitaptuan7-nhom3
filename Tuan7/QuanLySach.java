import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() {
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
            System.out.println("Giá bán ước tính: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("----------------------------------");
        }
    }
}

package tuan8;

import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n=== DANH SACH SACH ===");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}


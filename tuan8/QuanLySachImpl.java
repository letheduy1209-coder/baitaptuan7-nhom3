package tuan8;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach;

    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }
    @Override
    public boolean themSach(Sach sach) {
        if (sach == null) return false;
        if (timKiemSach(sach.getMaSach()) != null) return false;
        return danhSach.add(sach);
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s == null) return false;
        return danhSach.remove(s);
    }

    @Override
    public boolean capNhatSach(String maSach, Sach sachCapNhat) {
        if (maSach == null || sachCapNhat == null) return false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (maSach.equals(danhSach.get(i).getMaSach())) {
                sachCapNhat.setMaSach(maSach);
                danhSach.set(i, sachCapNhat);
                return true;
            }
        }
        return false;
    }

    @Override
    public Sach timKiemSach(String maSach) {
        if (maSach == null) return null;
        for (Sach s : danhSach) {
            if (maSach.equals(s.getMaSach())) return s;
        }
        return null;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sach rong.");
            return;
        }
        System.out.println("Danh sach sach:");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSach.get(i).toString());
            System.out.println();
        }
    }

    @Override
    public List<Sach> layDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
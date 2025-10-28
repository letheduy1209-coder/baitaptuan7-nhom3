package tuan8;

import java.util.List;

public interface IQuanLySach {
    boolean themSach(Sach sach);
    boolean xoaSach(String maSach);
    boolean capNhatSach(String maSach, Sach sachCapNhat);
    Sach timKiemSach(String maSach);
    void hienThiDanhSach();
    List<Sach> layDanhSach();
}

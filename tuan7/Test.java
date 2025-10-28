package tuan7;

public class Test 
{
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tao sach giao trinh
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "CSDL", "Nguyen Van An", 2021, 10, 50000, "CNTT", "DH");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Giai tich 1", "Tran Thi Chau", 2020, 8, 55000, "Toan hoc", "DH");

        // Tao sach tieu thuyet
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 1995, 50, 60000, "Thieu Nhi", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Harry Potter", "J.K. Rowling", 2003, 15, 65000, "Ky ao", true);

        // Them vao danh sach
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        // Hien thi danh sach
        ql.hienThiDanhSach();

        // Tim kiem
        System.out.println("\n--- Ket qua tim kiem (TT02) ---");
        Sach tim = ql.timKiem("TT02");
        if (tim != null)
            System.out.println(tim);
        else
            System.out.println("Khong tim thay!");

        // Cap nhat so luong
        ql.capNhatSoLuong("GT01", 20);

        // Xoa sach
        ql.xoaSach("GT02");

        // Hien thi sau khi cap nhat
        System.out.println("\n--- Danh sach sau khi xoa ---");
        ql.hienThiDanhSach();
    }

}

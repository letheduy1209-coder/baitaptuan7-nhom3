public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo một số đối tượng sách
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "CSDL", "Nguyen Van An", 2021, 10, "CNTT", "DH");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Giai tich 1", "Tran Thi Chau", 2020, 8, "Toan hoc", "DH");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 1995, 50, "Thieu Nhi", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Harry Potter", "J.K. Rowling", 2003, 15, "Ky ao", true);

        // Thêm vào danh sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        // Hiển thị danh sách
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n Ket qua tim kiem:");
        Sach tim = ql.timKiem("TT02");
        if (tim != null) System.out.println(tim.toString());

        // Cập nhật
        ql.capNhatSoLuong("GT01", 20);

        // Xóa sách
        ql.xoaSach("GT02");

        // Hiển thị sau khi xóa
        System.out.println("\n Danh sach sau khi xoa:");
        ql.hienThiDanhSach();
    }
}


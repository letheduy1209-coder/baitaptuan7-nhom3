import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n=== MENU QUẢN LÝ SÁCH ===");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển Thị Danh Sách");
            System.out.println("4. Tìm Kiếm Sách Theo Mã");
            System.out.println("5. Xóa Sách Theo Mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Tên: ");
                    String ten1 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Năm XB: ");
                    int nam1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Giá gốc: ");
                    double gia1 = Double.parseDouble(sc.nextLine());
                    System.out.print("Số lượng: ");
                    int sl1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Vị trí: ");
                    String vt1 = sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, ten1, tg1, nam1, gia1, sl1, vt1, mh, cd));
                    break;

                case 2:
                    System.out.print("Nhập mã: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Tên: ");
                    String ten2 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Năm XB: ");
                    int nam2 = Integer.parseInt(sc.nextLine());
                    System.out.print("Giá gốc: ");
                    double gia2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Số lượng: ");
                    int sl2 = Integer.parseInt(sc.nextLine());
                    System.out.print("Vị trí: ");
                    String vt2 = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Series: ");
                    String sr = sc.nextLine();
                    quanLy.themSach(new SachTieuThuyet(ma2, ten2, tg2, nam2, gia2, sl2, vt2, tl, sr));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTim);
                    System.out.println(s != null ? s : "Không tìm thấy!");
                    break;

                case 5:
                    System.out.print("Nhập mã cần xóa: ");
                    String maXoa = sc.nextLine();
                    System.out.println(quanLy.xoaSach(maXoa) ? "Đã xóa!" : "Không tìm thấy!");
                    break;
            }
        } while (chon != 0);
        sc.close();
    }
}

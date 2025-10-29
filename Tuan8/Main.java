import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm theo mã sách");
            System.out.println("5. Xóa sách");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mh, cd));
                }
                case 2 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Có phải series không (true/false): ");
                    boolean ser = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, ser));
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhập mã sách cần tìm: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Không tìm thấy!");
                }
                case 5 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                    System.out.println("Đã xóa (nếu tồn tại).");
                }
                case 6 -> {
                    System.out.println("Kết thúc chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

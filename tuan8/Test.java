package tuan8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String cap = sc.nextLine();

                    Sach sg = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mon, cap);
                    quanLy.themSach(sg);
                }

                case 2 -> {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La sach series (true/false): ");
                    boolean ser = sc.nextBoolean();

                    Sach st = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, ser);
                    quanLy.themSach(st);
                }

                case 3 -> quanLy.hienThiDanhSach();

                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach sTim = quanLy.timKiemSach(maTim);
                    if (sTim != null) System.out.println("Tim thay: " + sTim);
                    else System.out.println("Khong tim thay!");
                }

                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                }

                case 6 -> {
                    System.out.print("Nhap ma sach can kiem tra: ");
                    String maKiem = sc.nextLine();
                    System.out.print("Nhap so luong toi thieu: ");
                    int slMin = sc.nextInt();
                    Sach s = quanLy.timKiemSach(maKiem);
                    if (s != null)
                        System.out.println(s.kiemTraTonKho(slMin) ? "Con du hang." : "Khong du hang.");
                    else
                        System.out.println("Khong tim thay sach!");
                }

                case 7 -> {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.print("Nhap vi tri moi: ");
                        String vt = sc.nextLine();
                        s.capNhatViTri(vt);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                }

                case 0 -> System.out.println("Dang thoat chuong trinh...");

                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}


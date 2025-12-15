/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbt;

/**
 *
 * @author NTD
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm Sinh Viên");
            System.out.println("2. Thêm Nhân Viên");
            System.out.println("3. Thêm Khách Hàng");
            System.out.println("4. Xuất danh sách");
            System.out.println("5. Sắp xếp theo tên");
            System.out.println("6. Xóa theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
           n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Họ tên: ");
                    String tensv = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String dc = sc.nextLine();
                    System.out.print("Điểm 1: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Điểm 2: ");
                    double d2 = sc.nextDouble();
                    ql.them(new Student(tensv, dc, d1, d2));
                    break;

                case 2:
                    System.out.print("Họ tên: ");
                    String tennv = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String dc2 = sc.nextLine();
                    System.out.print("Hệ số lương: ");
                    double hsl = sc.nextDouble();
                    ql.them(new Employee(tennv, dc2, hsl));
                    break;

                case 3:
                    System.out.print("Họ tên: ");
                    String tenkh = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String dc3 = sc.nextLine();
                    System.out.print("Tên công ty: ");
                    String ct = sc.nextLine();
                    System.out.print("Trị giá hóa đơn: ");
                    double tg = sc.nextDouble();
                    ql.them(new Customer(tenkh, dc3, ct, tg));
                    break;

                case 4:
                    ql.xuat();
                    break;

                case 5:
                    ql.sapXepTheoTen();
                    System.out.println("Đã sắp xếp!");
                    break;

                case 6:
                    System.out.print("Nhập tên cần xóa: ");
                    String tenx = sc.nextLine();
                    ql.xoaTheoTen(tenx);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
            }

        } while (n != 0);
    }
}

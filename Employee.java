/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbt;

public class Employee extends Person {
    private double heSoLuong;

    public Employee() {
    }

    public Employee(String hoTen, String diaChi, double heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return heSoLuong * 1800000; // Ví dụ hệ số * lương cơ bản
    }

    public String danhGia() {
        if (heSoLuong >= 3) return "Nhân viên xuất sắc";
        if (heSoLuong >= 2) return "Nhân viên tốt";
        return "Nhân viên trung bình";
    }

    @Override
    public String toString() {
        return "--- BẢNG LƯƠNG NHÂN VIÊN ---\n" +
                super.toString() + "\n" +
                "Hệ số lương: " + heSoLuong + "\n" +
                "Tiền lương: " + tinhLuong() + "\n" +
                "Đánh giá: " + danhGia();
    }
}

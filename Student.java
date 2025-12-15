    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbt;

public class Student extends Person {
    private double diem1;
    private double diem2;

    public Student() {
    }

    public Student(String hoTen, String diaChi, double diem1, double diem2) {
        super(hoTen, diaChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double diemTB() {
        return (diem1 + diem2) / 2;
    }

    public String danhGia() {
        double dtb = diemTB();
        if (dtb >= 8) return "Giỏi";
        if (dtb >= 6.5) return "Khá";
        if (dtb >= 5) return "Trung bình";
        return "Yếu";
    }

    @Override
    public String toString() {
        return "--- BẢNG ĐIỂM SINH VIÊN ---\n" +
                super.toString() + "\n" +
                "Điểm 1: " + diem1 + "\n" +
                "Điểm 2: " + diem2 + "\n" +
                "Điểm TB: " + diemTB() + "\n" +
                "Đánh giá: " + danhGia();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbt;

/**
 *
 * @author NTD
 */
public class Customer extends Person {
    private String tenCongTy;
    private double triGiaHoaDon;

    public Customer() {
    }

    public Customer(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String danhGia() {
        if (triGiaHoaDon >= 50000000) return "Khách hàng VIP";
        if (triGiaHoaDon >= 10000000) return "Khách hàng quan trọng";
        return "Khách hàng thường";
    }

    @Override
    public String toString() {
        return "--- THÔNG TIN HÓA ĐƠN KHÁCH HÀNG ---\n" +
                super.toString() + "\n" +
                "Công ty: " + tenCongTy + "\n" +
                "Trị giá hóa đơn: " + triGiaHoaDon + "\n" +
                "Đánh giá: " + danhGia();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbt;


import java.util.Arrays;

public class QuanLy {
    private Person[] danhSach;
    private int soLuong;

    public QuanLy() {
        danhSach = new Person[5];
        soLuong = 0;
    }

    public void them(Person p) {
        if (soLuong == danhSach.length) {
            danhSach = Arrays.copyOf(danhSach, danhSach.length + danhSach.length / 2);
        }
        danhSach[soLuong++] = p;
    }

    public void xoaTheoTen(String ten) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getHoTen().equalsIgnoreCase(ten)) {

                for (int j = i; j < soLuong - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                danhSach[--soLuong] = null;
                return;
            }
        }
        System.out.println("Không tìm thấy người cần xóa!");
    }

    public void sapXepTheoTen() {
        Arrays.sort(danhSach, 0, soLuong,
                (a, b) -> a.getHoTen().compareToIgnoreCase(b.getHoTen()));
    }

    public void xuat() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i].toString());
            System.out.println("----------------------------------------");
        }
    }
}
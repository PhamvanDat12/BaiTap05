/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int ma;
    private int maHienTai=0;
    private String tenNhanVien;
    private GioiTinh gioitinh;
    private Float luong;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public GioiTinh getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(GioiTinh gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }
   
    public NhanVien() {
        this.ma=maHienTai;
        maHienTai++;
    }

    public NhanVien(int ma, String tenNhanVien, GioiTinh gioitinh, Float luong) {
        this.ma = maHienTai;
        maHienTai++;
        this.tenNhanVien = tenNhanVien;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }
    public void nhapThongTin(){
        System.out.println("Moi nhap ten :");
        tenNhanVien= new Scanner(System.in).nextLine();
        System.out.println("Nhap Gioi tinh 0->Nam,1->Nư,-1->KXD");
        int chon= new Scanner(System.in).nextInt();
        this.gioitinh=GioiTinh.getbycode(chon);
        System.out.println("Moi nhap tien luong:");
        luong= new Scanner(System.in).nextFloat();
    }
    public void hienThongTin(){
        System.out.println("Mã: "+this.ma+"Ten :"+this.tenNhanVien+   "GioiTinh:"+this.gioitinh);
    }
    
}

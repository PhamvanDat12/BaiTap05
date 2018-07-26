/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CongNhan {
    private int ma;
     private int maHienTai=0;
      private String ten;
    private float luong;
    private float ngayCong;
    private GioiTinh gioitinh;

    public GioiTinh getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(GioiTinh gioitinh) {
        this.gioitinh = gioitinh;
    }
    public CongNhan() {
        this.ma=maHienTai;
        maHienTai++;
    }

    public CongNhan(int ma, String ten, float luong, float ngayCong,GioiTinh gioiTinh) {
        this.ma = maHienTai;
        maHienTai++;
        this.ten = ten;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.gioitinh=gioiTinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(float ngayCong) {
        this.ngayCong = ngayCong;
    }
    public float getThuNhap(){
        return  luong+(ngayCong/26)*luong;
    }
    public void nhap (){
        System.out.println("Moi nhap ten:");
        ten= new Scanner(System.in).nextLine();
        System.out.println("Gioi tinh 0->Nam,1->Nu,-1->KXD");
        int gt=new Scanner(System.in).nextInt();
        this.gioitinh=GioiTinh.getByCode(gt);
        System.out.println("MOi nhap ngay luong:");
        luong= new Scanner(System.in).nextFloat();
        System.out.println("moi nhap ngay cong");
        ngayCong=new Scanner(System.in).nextFloat();
                
        
                
    }
    public void hienThi(){
        System.out.println("Ma:" +this.ma+ "|| Ten :"+ten+  "||Gioi tinh:"+this.gioitinh.getTen()+"||Thu Nhap:" +getThuNhap());
    }
   
   
     
           
    
}

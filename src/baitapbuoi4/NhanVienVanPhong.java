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
public class NhanVienVanPhong {
     private int ma;
     private int maHienTai=0;
     private String ten;
     private GioiTinh gioitinh;
     private Float luong;
     private Float heso;

    public NhanVienVanPhong(int ma, String ten, GioiTinh gioitinh, Float luong, Float heso) {
        this.ma = maHienTai;
        maHienTai++;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.luong = luong;
        this.heso = heso;
    }

    public NhanVienVanPhong() {
        this.ma=maHienTai;
        maHienTai++;
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

    public Float getHeso() {
        return heso;
    }

    public void setHeso(Float heso) {
        this.heso = heso;
    }
    
      public Float getThunhap(){
          return luong+ luong*heso;
      }
      public void nhap()
      {
          System.out.println("Moi nhap ten nhav vien:");
          ten=new Scanner(System.in).nextLine();
          System.out.println("Moi nhap gi0i tinh 0->Nam,1->nư,-1->KXD");
          int chon= new Scanner(System.in).nextInt();
          this.gioitinh=GioiTinh.getByCode(chon);
          System.out.println("Moi nhap Luong:");
          luong=new Scanner(System.in).nextFloat();
          System.out.println("moi nhap He so luong:");
          heso=new Scanner(System.in).nextFloat();
                  
      }
      public void hienThi(){
          System.out.println("Ma:"+this.ma+"| Ten:"  +this.ten+  "|Gioi Tinh:"+ this.gioitinh.getTen()+
                     "Thu Nhap:" +this.getThunhap());
      }
    
}

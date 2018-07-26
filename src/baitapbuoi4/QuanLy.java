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
public class QuanLy {
    private int ma;
    private int maHientai=0;
    private String ten ;
    private GioiTinh gioitinh;
    private int soNhanVien;
    private float luong;

    public QuanLy() {
        this.ma=maHientai;
        maHientai++;
    }

    public QuanLy(int ma, String ten, GioiTinh gioitinh, int soNhanVien, float luong) {
        this.ma = maHientai;
        maHientai++;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.soNhanVien = soNhanVien;
        this.luong = luong;
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

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    public float getThuNhap(){
       int Phucap=0;
        
        if(soNhanVien<10){
             Phucap=500;
            
        }else if(10<=soNhanVien && soNhanVien<=20){
            Phucap=1000;
            
        }else if(soNhanVien>20){
            Phucap=2000;
        }
       return Phucap+luong; 
    }
  public void nhap (){
      System.out.println("Moi nhap ten:");
      ten=new Scanner(System.in).nextLine();
      System.out.println("Gioi tinh:");
      int gtinh=new Scanner(System.in).nextInt();
      this.gioitinh=GioiTinh.getByCode(gtinh);
      System.out.println("Moi nhap luong:");
      luong= new Scanner(System.in).nextFloat();
      
  }  
  public void hienThi(){
      System.out.println("Ma:"+this.ma+"  ||Ten:"+ten +"   ||Gioitinh:"+ this.gioitinh.getTen()+" ||Thu Nhap:"+getThuNhap());
  }
}

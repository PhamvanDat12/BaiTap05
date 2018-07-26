/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int ma;
    private String ten;
    private GioiTinh gioitinh;
   private int maHientai=0;
    public NhanVien() {
        this.ma=maHientai;
        maHientai++;
    }

    public NhanVien(int ma, String ten, GioiTinh gioitinh) {
        this.ma = maHientai;
        maHientai++;
        this.ten = ten;
        this.gioitinh = gioitinh;
    }
    

    public int getMa() {
        return ma;
    }

//    public void setMa(int ma) {
//        this.ma = ma;
//    }

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
    
       public void nhap(){
           System.out.println("Nhap ten:");
           this.ten=new Scanner(System.in).nextLine();
           System.out.println("Nhap Gioi tinh:");
           int gt=new Scanner(System.in).nextInt();
          this.gioitinh=GioiTinh.getByCode(gt);
       }    
       public void hienThongTin(){
           System.out.println("ma:  "+this.ma + "| ten:"+this.ten+"|  Gioitinh:  "+this.gioitinh.getTen());
       }
      
    
}

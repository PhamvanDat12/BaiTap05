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
public class QuanLy extends NhanVien{
  
   private int soNhanVien;

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
   public Float getThuNhap()
   {
       float phucap=0;
       
       if(soNhanVien<10){
           return phucap=500;
       }else if(10<=soNhanVien&& soNhanVien<=20){
           return phucap=1000;
       }else if(soNhanVien>20){
           return phucap=2000;
       }
       return getLuong()+phucap;
   }

    @Override
    public void nhapThongTin() {
        System.out.println("Moi nhap so nhan vien");
        soNhanVien= new Scanner(System.in).nextInt();
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("tien luowng la:"+this.getThuNhap());
    }
    
   
    
}

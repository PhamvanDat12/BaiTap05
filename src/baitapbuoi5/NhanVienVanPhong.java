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
public class NhanVienVanPhong extends NhanVien{
    private Float heSo;
    public Float getThuNhap(){
        return getLuong()+heSo*getLuong();
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
         nhapThongTin();
        System.out.println("Moi nhap he so luong");
        heSo= new Scanner(System.in).nextFloat();
       
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        hienThongTin();
        System.out.println("Tiền Lương:" +this.getThuNhap());
    }
    
    
    
}

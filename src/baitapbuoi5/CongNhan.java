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
public class CongNhan extends NhanVien{
    private Float ngayCong;
    public Float getThuNhap(){
        return (getLuong()+(ngayCong/26)*getLuong());
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
       
        System.out.println("Moi nhap ngay cong :");
        ngayCong= new Scanner(System.in).nextFloat();
        nhapThongTin();
        
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("thuNhap: "+this.getThuNhap());
        hienThongTin();
    }
    
    
}

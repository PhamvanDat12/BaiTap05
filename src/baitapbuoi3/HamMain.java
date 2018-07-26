/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author Admin
 */
public class HamMain {
    public static void main(String[] args){
        QuanLyNhanVien QLNV= new QuanLyNhanVien();
        NhanVien[] ds= null;
        while (true) {   
            System.out.println("1, nhap");
            System.out.println("2, Hien");
            System.out.println("3, sap xep");
            System.out.println("4, thoat");
            int chon=new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    ds=QLNV.nhapDanhSachNhanVien();
                    
                    break;
                    //chwa chon 1 k0 cho chon 2 ,3
                case 2:
                       QLNV.hienDanhSach(ds);
                       break;
                case 3:
                    System.out.println("chon gioi tinh");
                    int gt= new Scanner(System.in).nextInt();
                    GioiTinh gioitinh=GioiTinh.getByCode(gt);
                    NhanVien[] kq=QLNV.timTheoGioiTinh(ds, gioitinh);
                    QLNV.hienDanhSach(kq);
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("chon sai moi chon lai");
            }
      
        }
    }
    
}

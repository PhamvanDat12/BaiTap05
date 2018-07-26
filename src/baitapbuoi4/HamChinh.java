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
public class HamChinh {
    
    public static void main(String[] args) {
        QuanLyNhanVien QLNV= new QuanLyNhanVien();
    NhanVienVanPhong[] nvvanphong=null;
    CongNhan[] congnhan= null;
    QuanLy[] quanly= null;
        while (true) {            
            System.out.println("1, Nhập");
            System.out.println("2, Hiện thị");
            System.out.println("3, tìm kiếm:");
            System.out.println("4, thoát");
            int chon= new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    nvvanphong=QLNV.nhapNhanVienVanPhong();
                    congnhan=QLNV.nhapCongNhan();
                    quanly= QLNV.nhapQuanLy();
                    break;
                case 2:
                    QLNV.hienDanhSachNhanVien(nvvanphong);
                    QLNV.HienThiCongNhan(congnhan);
                    QLNV.HienthiQuanLy(quanly);
                    break;
                case 3:
                    System.out.println("Moi nhap gioi tinh");
                    int gt= new Scanner(System.in).nextInt();
                    GioiTinh gtinh= GioiTinh.getByCode(gt);
                   
                    
                    break;
                case 4:
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("Sai!Moi nhap Lai1");
            }
        }
    }
    
}

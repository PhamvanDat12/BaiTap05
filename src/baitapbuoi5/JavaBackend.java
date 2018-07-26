/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi5;

import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author Admin
 */
public class JavaBackend {
   public static void main(String[] args){
       QuanLyThongTin qltt= new QuanLyThongTin();
       NhanVien[] dsnv=null;
       while (true) {           
           System.out.println("1, Nhap thong tin");
           System.out.println("2, Hien thi");
           System.out.println("3, Tim Kiem");
           System.out.println("4, Thoat");
           int chon= new Scanner(System.in).nextInt();
           switch (chon) {
               case 1:
                   System.out.println("Moi nhap so luong nhan vien:");
                   int sluong= new Scanner(System.in).nextInt();
                   dsnv= new NhanVien[sluong];
                   for (int i = 0; i < dsnv.length; i++) {
                       
                       System.out.println("Nhap thong tin nhan vien thu :"+i);
                       qltt.nhapdsThongTin(dsnv);
                      
                   }
                   
                   break;
               case 2:
                   System.out.println("===============");
                   qltt.dsHienThi(dsnv);
                   break;
               case 3:
                   break;
               case 4:
                   System.out.println("Ket Thuc");
                   System.exit(0);
               default:
                   System.out.println("Ban chon sai!!");
           }
       }
       
   }
    
}

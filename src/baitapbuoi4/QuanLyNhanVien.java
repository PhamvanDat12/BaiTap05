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
public class QuanLyNhanVien {
    QuanLy[] Qly= null;
    CongNhan[] congnhan=null;
    NhanVienVanPhong[] nhanvienVp=null;
    public NhanVienVanPhong[] nhapNhanVienVanPhong(){
        System.out.println("Moi nhap so luong nhan vien van phong:");
        int sl= new Scanner(System.in).nextInt();
        NhanVienVanPhong[] nvp=new NhanVienVanPhong[sl];
        for (int i=0;i<nvp.length;i++){
            nvp[i]=new NhanVienVanPhong();
            nvp[i].nhap();
            
        }
        return nvp;
    }
    public void hienDanhSachNhanVien(NhanVienVanPhong[] nvvp){
        if(nvvp!=null){
            for (int i=0;i<nvvp.length;i++){
                NhanVienVanPhong nv= nvvp[i];
                System.out.println("Moi nhap nhan vien thu:"+i);
                if(nv!=null){
                   nv.hienThi();
                }else{
                    System.out.println("Null");
                    
                }
            }
        }
    }
    public CongNhan[] nhapCongNhan(){
        System.out.println("Moi nhap so luong cong nhan:");
        int sluong= new Scanner(System.in).nextInt();
        CongNhan[] cn= new CongNhan[sluong];
        for (int i=0;i<cn.length;i++){
            cn[i]= new CongNhan();
            cn[i].nhap();
        }
        return cn;
                
    }
    public void HienThiCongNhan(CongNhan[] cnhan){
        if(cnhan!=null){
            for (int i=0;i<cnhan.length;i++){
                CongNhan cn= cnhan[i];
                System.out.println("Moi nhap cong nhan thu:"+ i);
                if(cn!=null){
                    cn.hienThi();
                }else{
                System.out.println("Null");
            }
            }
        }
    }
    public QuanLy[] nhapQuanLy(){
        System.out.println("Moi nhap so luong nhan vien:");
        int soluong= new Scanner(System.in).nextInt();
        QuanLy[] qly= new QuanLy[soluong];
        for (int i = 0; i < qly.length; i++) {
            qly[i]= new QuanLy();
            qly[i].nhap();
            
        }
        return qly;
    }
    public void HienthiQuanLy(QuanLy[] quanly){
        if(quanly!=null){
            for (int i = 0; i < quanly.length; i++) {
                QuanLy ql= quanly[i];
                System.out.println("Moi nhap nhan vien thu :"+i);
                if(ql!=null){
                    ql.hienThi();
                }else{
                    System.out.println("Null");
                }
            }
        }
    }
    public float timThuNhapCaoNhatTheoGioiTinh(int magioitinh){
        int count=0;
        float luongMax=0;
        if(Qly!=null){
            for (int i = 0; i < Qly.length; i++) {
                if(Qly[i].getGioitinh().getCode()==magioitinh){
                    count++;
                }
                
            }
        }
        if(congnhan!=null){
            for (int i = 0; i < congnhan.length; i++) {
                if(congnhan[i].getGioitinh().getCode()==magioitinh){
                    count++;
                            
                }
                
            }
        }
        if(nhanvienVp!=null){
            for (int i = 0; i < nhanvienVp.length; i++) {
                if(nhanvienVp[i].getGioitinh().getCode()==magioitinh){
                    count++;
                }
            }
        }
        float dsLuong[]= new float[count];
        count=0;
        if(Qly!=null){
            for (int i = 0; i < Qly.length; i++) {
                if(Qly[i].getGioitinh().getCode()==magioitinh){
                    dsLuong[count]=Qly[i].getThuNhap();
                    count++;
                }
                
            }
        }
        if(congnhan!=null){
            for (int i = 0; i < congnhan.length; i++) {
                if(congnhan[i].getGioitinh().getCode()==magioitinh){
                    dsLuong[count]=congnhan[i].getThuNhap();
                    count++;
                }
                
            }
        }
        if(nhanvienVp!=null){
            for (int i = 0; i < nhanvienVp.length; i++) {
                if(nhanvienVp[i].getGioitinh().getCode()==magioitinh){
                    dsLuong[count]=nhanvienVp[i].getThunhap();
                    count++;
                }
            }
        }
        for (int i = 0; i < dsLuong.length; i++) {
            if(dsLuong[i]>luongMax){
                luongMax=dsLuong[i];
            }
            
        }
        System.out.println("Luong lon nhat :"+ luongMax);
        return luongMax;
    }
    
}

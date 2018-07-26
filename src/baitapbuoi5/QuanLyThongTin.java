/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi5;

/**
 *
 * @author Admin
 */
public class QuanLyThongTin {
    public void nhapdsThongTin(NhanVien[] nv){
        if(nv!=null){
            for (NhanVien nhanVien : nv) {
                if(nhanVien!=null){
                    nhanVien.nhapThongTin();
                }
            }
        }
    }
    public void dsHienThi(NhanVien[] nv1){
        if(nv1!=null){
            for (NhanVien nhanVien : nv1) {
                if(nhanVien!=null){
                    nhanVien.hienThongTin();
                }
            }
        }
    }
    
}

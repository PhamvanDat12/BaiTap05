/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi4;

/**
 *
 * @author Admin
 */
public enum GioiTinh {
    NAM(1,"Con Trai"),NU(2,"Con Gai"),KXD(-1,"Không Xác Định");
    private int code;
    private String ten;

    private GioiTinh() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    private GioiTinh(int code, String ten) {
        this.code = code;
        this.ten = ten;
    }
    public static GioiTinh getByCode(int code){
        switch (code) {
            case 1:
                   return NAM;
                
            case 2:
                return NU;
            
            default:
                return KXD;
        }
    }
    
}

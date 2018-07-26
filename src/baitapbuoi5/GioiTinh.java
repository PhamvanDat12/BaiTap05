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
public enum GioiTinh {
    Nam(0,"Con trai"),Nu(1,"Con Gai"),KXD(-1,"Khong xac dinh");
    
    private int code;
    private String gTinh;

    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getgTinh() {
        return gTinh;
    }

    public void setgTinh(String gTinh) {
        this.gTinh = gTinh;
    }
    private GioiTinh() {
    }

    private GioiTinh(int code, String gTinh) {
        this.code = code;
        this.gTinh = gTinh;
    }
    public static GioiTinh getbycode(int code){
        switch (code) {
            case 1:
                return Nam;
                
            case 2:
                return Nu;
            default:
               return KXD;
        }
    }
    
}

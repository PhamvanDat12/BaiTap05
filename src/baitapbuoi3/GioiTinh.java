/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi3;

/**
 *
 * @author Admin
 */
public enum GioiTinh {
    Nam(1,"contrai"),Nu(0,"Congai"),KXD(-1,"khong xac dinh");
    
    private int code;
    private String ten;

    public int getCode() {
        return code;
    }

    public String getTen() {
        return ten;
    }

    public void setCode(int code) {
        this.code = code;
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
                return Nam;
            case 0:
                return Nu;
            default:
                return KXD;
        }
    }
}

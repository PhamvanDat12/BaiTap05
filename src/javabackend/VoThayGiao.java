/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend;

/**
 *
 * @author Admin
 */
public class VoThayGiao {
    private  int ma;
    private String ten;
    private boolean TRANGTHAI;
  private static final  boolean BAN=true;
  private  static  final boolean  RANH=false;
  private VoThayGiao() {
      this.TRANGTHAI=BAN;
      
    }
  
  private  static  VoThayGiao[] listObj=new VoThayGiao[3];
  public  static  VoThayGiao layveObj(){
      for(int i=0;i<listObj.length;i++){
          if(listObj[i]==null){
              listObj[i]=new VoThayGiao();
              return listObj[i];
          }else{
              if(!listObj[i].TRANGTHAI){
                  listObj[i].TRANGTHAI=BAN;
                 return listObj[i];
                          
              }
          }
          
      }
      return null;
  }
    
    
}

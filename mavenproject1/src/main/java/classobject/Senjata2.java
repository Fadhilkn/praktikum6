/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobject;

/**
 *
 * @author USER
 */
public class Senjata2 {
    
   private String magazine;
   private String namaSenjata;
   private String damage;
   
   public Senjata2 (String magazine, String namaSenjata, String damage){
       
       this.magazine = magazine;
       this.namaSenjata = namaSenjata;
       this.damage = damage;
   }
   
   public void setmagazine(String magazine){
       this.magazine = magazine;
   }
   public void setnamaSenjata(String namaSenjata){
       this.namaSenjata = namaSenjata;
   }
   public void setdamage(String damage){
       this.damage= damage;
   }
   
   public String getmagazine(){
        return magazine;
    }
   public String getnamaSenjata(){
        return namaSenjata;
    }
   public String getdamage(){
        return damage;
    }
}
   

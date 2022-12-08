/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobject;

/**
 *
 * @author USER
 */
public class Senjata {
    private String magazine;
    private String namaSenjata;
    private Player damage;
    
    public Senjata (String magazine, String namaSenjata, Player damage){
       
       this.magazine = magazine;
       this.namaSenjata = namaSenjata;
       this.damage = damage;
   }
    public void setmagazine(String magazine){
       this.magazine= magazine;
   }
   public void setnamaSenjata(String namaSenjata){
       this.namaSenjata = namaSenjata;
   }
   public void setdamage(Player damage){
       this.damage = damage;
   }
   
   public String getmagazine(){
        return magazine;
    }
   public String getnamaSenjata(){
        return namaSenjata;
    }
   public Player getdamage(){
        return damage;
    }
}

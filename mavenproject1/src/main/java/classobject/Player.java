/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobject;

/**
 *
 * @author USER
 */
public class Player {
    private String HP;
    private String namePlayer;
    private String Armor;
    public Player(){
        
    }
    
    public Player (String HP, String namePlayer, String Armor){
        this.HP = HP;
        this.namePlayer = namePlayer;
        this.Armor = Armor;
    }
    public void setHP(String HP){
        this.HP = HP;
    }
    
    public void setnamePlayer(String namePlayer){
        this.namePlayer = namePlayer;
    }
    public void setArmor(String Armor){
        this.Armor = Armor;
    }
    
    public String getHP(){
        return HP;
    }
    public String getnamePlayer(){
        return namePlayer;
    }  
    public String getArmor(){
        return Armor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Irwan;

/**
 *
 * @author User
 */
public class Handphone {
   String tipehp;
    String warna;

    public String getTipehp() {
        return tipehp;
    }

    public void setTipehp(String tipehp) {
        this.tipehp = tipehp;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void tampilkanData(){
        System.out.println("tipehp :"+getTipehp());
        System.out.println("warna :"+getWarna());
        
        
    }
    public void inputData(String th,String w){
        setTipehp(th);
        setWarna(w);
    }   
}

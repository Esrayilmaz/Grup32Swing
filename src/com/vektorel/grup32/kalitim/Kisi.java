/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.grup32.kalitim;


/**
 *
 * @author vektorel
 */
public class Kisi {
    private String ad;
    private String soyad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
       
    
    public void maasHesapla(){
        System.out.println("Maaş : 12.56 €"); 
    }
}

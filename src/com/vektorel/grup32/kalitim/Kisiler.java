/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.grup32.kalitim;

import com.vektorel.grup32.dosya.DosyaIslemleri;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class Kisiler {
    
    public static List<Kisi> kisiListesi =new ArrayList<>();
    
    
    public void listeyiYukle(){
        DosyaIslemleri di =new DosyaIslemleri();
        String icerik = di.dosyadanOku();
        kisiListesi.clear();
        
        String[] kisiStringleri = icerik.split("@");
        
        for (int i =0; i<kisiStringleri.length;i++) {
            String[] kisiDetayStringleri = kisiStringleri[i].split("\\|");
            String no = kisiDetayStringleri[0];
            String ad = kisiDetayStringleri[1];
            String soyad = kisiDetayStringleri[2];
            String dogumTarihi = kisiDetayStringleri[3];
            kisiListesi.add(new Kisi(Long.parseLong(no), ad, soyad, new Date(dogumTarihi)));
        }
    }
    
}

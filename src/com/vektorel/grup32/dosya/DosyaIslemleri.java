/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.grup32.dosya;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author vektorel
 */
public class DosyaIslemleri {

    private String dosya = "D:\\TTEMEL\\ornek.txt";

    public String dosyadanOku() {
        try {
            File file = new File(dosya);
            Scanner scanner = new Scanner(file);
            StringBuilder icerik = new StringBuilder();
            while (scanner.hasNext()) {
                icerik.append(scanner.nextLine());
            }
            return icerik.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

//    public void stringTest() {
//        System.out.println(System.currentTimeMillis());
//        String d = "";
//        for (int i = 0; i < 10000; i++) {
//            d += ""+i;
//        }
//        System.out.println(System.currentTimeMillis());
//    }
//
//    public void StringBuilderTest() {
//        System.out.println(System.currentTimeMillis());
//        StringBuilder d = new StringBuilder();
//        for (int i = 0; i < 10000; i++) {
//            d.append(""+i);
//        }
//        System.out.println(System.currentTimeMillis());
//    }

}

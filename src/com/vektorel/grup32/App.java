/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.grup32;

import com.vektorel.grup32.dosya.DosyaIslemleri;
import com.vektorel.grup32.ui.DlgLogin;

/**
 *
 * @author vektorel
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Application is started..");
        DlgLogin dl=new DlgLogin(null, true);
        dl.setLocationRelativeTo(null);
        dl.setVisible(true);
    }
}

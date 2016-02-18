/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.homework1.entity;

/**
 *
 * @author madhu
 */
public class Acer extends Laptop {
    public Acer(Ram Ram){
        this.Ram=Ram;
    }

    @Override
    public void perform() {
        System.out.println("Acer is performing which has "+Ram.memory());
                             }
    
}

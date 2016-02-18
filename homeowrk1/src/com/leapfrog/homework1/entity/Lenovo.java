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
public class Lenovo extends Laptop{
    public Lenovo(Ram Ram){
     this.Ram=Ram;
    }
    @Override
    public void perform(){
        System.out.println("Lenovo is performing which has "+Ram.memory());
    }
}

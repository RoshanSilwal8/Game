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
public abstract class Laptop {
    protected Ram Ram;
    public abstract void perform();
    public void setRam(Ram Ram){
        this.Ram=Ram;
    }
}

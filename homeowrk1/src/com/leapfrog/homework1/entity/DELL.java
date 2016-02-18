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
public class DELL extends Laptop{
    public DELL(Ram Ram){
        this.Ram=Ram;
    }
    @Override
    public void perform(){
        System.out.println("DELL is performing which has "+Ram.memory() );
    }
    
}

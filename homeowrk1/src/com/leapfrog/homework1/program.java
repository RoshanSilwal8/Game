/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.homework1;
import com.leapfrog.homework1.entity.Acer;
import com.leapfrog.homework1.entity.DELL;
import com.leapfrog.homework1.entity.Laptop;
import com.leapfrog.homework1.entity.Lenovo;
import com.leapfrog.homework1.entity.Ram2;
import com.leapfrog.homework1.entity.Ram1;
import com.leapfrog.homework1.entity.Ram3;
/**
 *
 * @author madhu
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop l=new DELL(new Ram3());
        l.perform();
        l.setRam(new Ram1());
        l.perform();
        l.setRam(new Ram2());
        l.perform();
    }
    
}

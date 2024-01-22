/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anubh
 */
public class Random {
    public HashSet<Integer> number() 
    {
        HashSet<Integer> s1 = new HashSet<Integer>();
        
        while(s1.size()<=10)
        {
            s1.add((int)(Math.random()*100));
        }
        System.out.println(s1);
        return s1;
    }

    public static void main(String[] args) {

        Random r1 = new Random();
        r1.number();
    }
}

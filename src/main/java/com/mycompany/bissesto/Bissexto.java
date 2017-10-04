/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bissesto;

/**
 *
 * @author vinil
 */
public class Bissexto {


    public boolean validaBissexto(int num){
        if((num%400==0)){
            return true;
        }
        else return ((num%4==0) && (num%100 != 0));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ejb.Stateless;

/**
 *
 * @author eyvind
 */
@Stateless
public class calcBean implements calcBeanLocal {

    @Override
    public float add(float a, float b) {

        return a+b;
    }




}
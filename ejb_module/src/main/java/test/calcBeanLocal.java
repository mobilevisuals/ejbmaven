/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ejb.Local;

/**
 *
 * @author eyvind
 */
@Local
public interface calcBeanLocal {

    float add(float a, float b);

}
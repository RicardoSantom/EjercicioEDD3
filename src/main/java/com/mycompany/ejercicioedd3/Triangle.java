/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 *
 * @author Usuario
 */
public class Triangle {

    private float base;
    private float height;

    /**
     *
     * @param base
     * @param height
     */
    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    Triangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
        float calculateArea(){
            return base * height;
        } 
    

        public float getBase() {
            return base;
        }

        public void setBase(float base) {
            this.base = base;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }
    
    
    
 }

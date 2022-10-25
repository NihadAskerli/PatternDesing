/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterndesign.bean;

/**
 *
 * @author ASUS
 */
public class FanarBuilder {
    private Fanar f=null;
    public FanarBuilder builder(){
         f=new Fanar();
         return this;
    }
    public Fanar build(){
    return this.f;
    }
        public FanarBuilder setName(String name) {
        this.f.setName(name);
        return this;
    }
            public FanarBuilder setB(Bmw b) {
        this.f.setB(b);
        return this;
    }
            public class Fanar {
//    private String name =null;
//    private String fatherName=null;
//    private String surname =null;
//    private int a;

    public Bmw b;
    public String name;


    public Fanar() {

    }
        public Bmw getB() {
        return b;
    }
    public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }
            public void setB(Bmw b) {
        this.b = b;
    }
            }
}
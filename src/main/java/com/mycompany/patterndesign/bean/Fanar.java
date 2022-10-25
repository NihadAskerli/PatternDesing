/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterndesign.bean;

/**
 *
 * @author ASUS
 */
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

    private void setName(String name) {
        this.name = name;
    }

    private void setB(Bmw b) {
        this.b = b;
    }

    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {

        private Fanar f = null;

        public FanarBuilder builder() {
            f = new Fanar();
            return this;
        }

        public Fanar build() {
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
    }
}
//
//    private String name = null;
//    private Bmw b = null;
//    public Fanar(String name, Bmw b) {
//        this.name = name;
//        Bmw bb = new Bmw();
//        bb.b = b.b;
//        this.b = bb;
////    bu zumana immutabledir ancaq basqa kalsla mutable etmek olur 
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Bmw getBname() {
//        Bmw bb = new Bmw();
//        bb.b = b.b;
//        return bb;
//    }
//
//    public Fanar() {
//
//    }
//
//    private static Fanar f= null;
//    public static Fanar instance(){
//    if(f==null){
//      f= new Fanar();  
//}
//     return f;
//}
//    public void device (){
//        System.out.println("salam nihad");
//    }
//    singiletona aiddir 23 32


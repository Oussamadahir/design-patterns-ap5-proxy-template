package com.oussamadahir.template;

public class Main {
    public static void main(String[] args) {
        Template t = new TemplateImpl();
        System.out.println("TemplateImpl  (n=7,  a^b)  -> " + t.perform(2, 5));

        t = new TemplateImpl2();
        System.out.println("TemplateImpl2 (n=9,  5*sqrt(a)) -> " + t.perform(2, 5));
    }
}

package com.oussamadahir.template;

public class TemplateImpl2 extends Template {
    @Override
    protected int param1() {
        return 9;
    }

    @Override
    protected double compute(int a, int b) {
        return Math.sqrt(a) * 5;
    }
}

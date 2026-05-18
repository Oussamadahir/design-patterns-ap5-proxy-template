package com.oussamadahir.template;

public class TemplateImpl extends Template {
    @Override
    protected int param1() {
        return 7;
    }

    @Override
    protected double compute(int a, int b) {
        return Math.pow(a, b);
    }
}

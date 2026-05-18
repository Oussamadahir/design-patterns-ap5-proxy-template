package com.oussamadahir.template;

public abstract class Template {
    public final double perform(int a, int b) {
        int n = param1();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += compute(a, b);
        }
        return sum;
    }

    protected abstract int param1();
    protected abstract double compute(int a, int b);
}

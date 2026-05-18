package com.oussamadahir.proxy;

public class ServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("[Service] calcul reel pour t=" + t);
        return Math.cos(t * Math.PI / 180) * Math.sin(t * Math.PI / 180);
    }
}

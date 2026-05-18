package com.oussamadahir.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {
    private final ServiceImpl service = new ServiceImpl();
    private final Map<Integer, Double> cache = new HashMap<>();

    @Override
    public double compute(int t) {
        if (!cache.containsKey(t)) {
            double result = service.compute(t);
            cache.put(t, result);
            return result;
        }
        System.out.println("[Proxy] reponse depuis cache pour t=" + t);
        return cache.get(t);
    }
}

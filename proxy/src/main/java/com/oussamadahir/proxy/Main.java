package com.oussamadahir.proxy;

public class Main {
    public static void main(String[] args) {
        IService proxy = new ProxyCache();
        Client client = new Client();
        client.setService(proxy);

        System.out.println("res=" + client.perform(23));
        System.out.println("res=" + client.perform(23));
        System.out.println("res=" + client.perform(45));
        System.out.println("res=" + client.perform(23));
    }
}

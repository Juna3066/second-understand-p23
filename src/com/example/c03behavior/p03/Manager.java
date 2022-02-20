package com.example.c03behavior.p03;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 5000) {
            System.out.println("审批通过【经理：" + name + "】");
            return true;
        } else {
            System.out.println("无权审批，请找上级【经理：" + name + "】");
            return false;
        }
    }
}

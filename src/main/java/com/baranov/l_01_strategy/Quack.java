package com.baranov.l_01_strategy;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}

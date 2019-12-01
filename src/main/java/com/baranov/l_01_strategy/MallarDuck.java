package com.baranov.l_01_strategy;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallar duck");
    }

}

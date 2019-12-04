package com.baranov.l_01_strategy;

public class FlyRocketPower implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }

}

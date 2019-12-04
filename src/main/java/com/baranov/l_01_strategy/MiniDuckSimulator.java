package com.baranov.l_01_strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();
    }

}

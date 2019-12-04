package com.baranov.l_01_strategy;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public Duck setFlyBehaviour(final FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
        return this;
    }

    public Duck setQuackBehaviour(final QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
        return this;
    }

}

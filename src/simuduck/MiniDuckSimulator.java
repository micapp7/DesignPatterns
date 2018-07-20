package simuduck;

import simuduck.behaviors.fly.FlyNoWay;
import simuduck.behaviors.quack.Squeak;

import java.util.HashMap;
import java.util.Map;

/**
 *  This app uses the Strategy Pattern
 *  which defines a family of algorithms
 *  encapsulates each one and makes them interchangeable.
 *  Strategy lets the algorithm change independently from the clients that use it.
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // Dynamically change behavior at runtime - benefits of polymorphism
        mallard.setQuackBehavior(new Squeak());
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performQuack();
        mallard.performFly();
    }
}

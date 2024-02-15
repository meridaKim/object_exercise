package oop.example.com.abstractfactorypattern;

public class ConcreteFactory2 implements AbstractFactory{

    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }
    public AbstractProductB createProductB(){return new ConcreteProductB2();}
}

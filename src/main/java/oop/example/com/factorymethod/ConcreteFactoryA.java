package oop.example.com.factorymethod;

public class ConcreteFactoryA extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}

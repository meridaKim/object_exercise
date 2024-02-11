package oop.example.com.factorymethod;

public class ConcreteFactoryB extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreateProductB();
    }
}

package oop.example.com.factory_method;

public class ConcreteFactoryA extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}

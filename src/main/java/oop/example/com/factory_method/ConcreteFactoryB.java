package oop.example.com.factory_method;

public class ConcreteFactoryB extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreateProductB();
    }
}

package oop.example.com.factorymethod;

public class Client {
    public static void main(String [] args){
        AbstractFactory [] abstractFactories = { new ConcreteFactoryA(), new ConcreteFactoryB()};

        Product productA = abstractFactories[0].createOperation();
        Product productB = abstractFactories[1].createOperation();


    }
}

package oop.example.com.abstract_factory_pattern;

public class Client {
    public static void main(String [] args){
        AbstractFactory factory = null;

        factory = new ConcreteFactory1();

        AbstractProductA productA1 = factory.createProductA();
        System.out.println(productA1.getClass().getName());

        factory = new ConcreteFactory2();
        // 어떤 팩토리 객체이냐에 따라 반환되는 A가 다르다.
        AbstractProductA productA2 = factory.createProductA();
        System.out.println(productA2.getClass().getName());

    }
}

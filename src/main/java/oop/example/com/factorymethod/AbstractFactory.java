package oop.example.com.factorymethod;

abstract class AbstractFactory {
    final Product createOperation(){
        Product product =createProduct();
        product.setting();
        return product;
    }
    abstract protected Product createProduct();
}

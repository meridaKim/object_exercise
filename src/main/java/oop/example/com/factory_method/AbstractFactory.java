package oop.example.com.factory_method;

abstract class AbstractFactory {
    final Product createOperation(){
        Product product =createProduct();
        product.setting();
        return product;
    }
    abstract protected Product createProduct();
}

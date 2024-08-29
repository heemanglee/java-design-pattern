package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardAFactory;
import factory_method.idcard.IDCardBFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory1 = new IDCardAFactory();
        Factory factory2 = new IDCardBFactory();

        Product card1 = factory1.create("Youngjin Kim");
        Product card2 = factory1.create("Heungmin Son");
        Product card3 = factory2.create("Kane");

        card1.use();
        card2.use();
        card3.use();
    }
}

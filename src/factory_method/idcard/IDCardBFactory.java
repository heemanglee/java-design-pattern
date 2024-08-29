package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

// ConcreteCreator : 서브 공장 클래스
// 각 서브 공장 클래스에 맞는 제품을 생성하도록, 최상위 클래스(Factory)의 추상 메서드를 재정의한다.
public class IDCardBFactory extends Factory {

    @Override
    protected Product createProduct(String owner) { // 최상위 공장 클래스(Factory)의 추상 메서드 재정의
        return new IDCardB(owner);
    }

    @Override
    protected void registerProduct(Product product) { // 최상위 공장 클래스(Factory)의 추상 메서드 재정의
        System.out.println(product + "을 등록했습니다.");
    }
}

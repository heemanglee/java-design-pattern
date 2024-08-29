package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

// 하위 클래스
// Factory 클래스(상위 클래스)의 추상 메서드를 구현한다.
public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) { // 상위 클래스의 추상 메서드를 구현한다.
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) { // 상위 클래스의 추상 메서드를 구현한다.
        System.out.println(product + "을 등록했습니다.");
    }
}

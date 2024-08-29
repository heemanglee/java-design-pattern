package factory_method.idcard;

import factory_method.framework.Product;

// 제품(Product) 구현체
public class IDCardB extends Product {

    private String owner;

    public IDCardB(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() { // 상위 클래스의 추상 메서드를 구현한다.
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCardB:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}

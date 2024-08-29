package factory_method.idcard;

import factory_method.framework.Product;

// Product 클래스(상위 클래스)의 추상 메서드를 구현한다.
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() { // 상위 클래스의 추상 메서드를 구현한다.
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}

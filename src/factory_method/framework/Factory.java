package factory_method.framework;

// Creator : 최상위 공장 클래스
// 팩토리 메서드를 추상화하여 서브 공장 클래스에서 구현한다.
public abstract class Factory {

    // 템플릿 메서드(Template Method) 패턴
    // 객체 생성을 템플릿화 시켰기 때문에, final을 사용하여 오버라이딩을 방지한다.
    public final Product create(String owner) {
        Product product = createProduct(owner); // 서브 공장 클래스에서 구체화한 팩토리 메서드
        registerProduct(product); // 서브 공장 클래스에서 구체화한 메서드
        return product; // 생성된 객체 반환
    }

    // 접근 제어자로 protected를 사용하여 외부에 노출을 방지한다.
    protected abstract Product createProduct(String owner); // 팩토리 메서드

    protected abstract void registerProduct(Product product); // 서브 공장 클래스에서 재정의
}

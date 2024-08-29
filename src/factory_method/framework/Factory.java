package factory_method.framework;

// 상위 클래스
public abstract class Factory {

    // 템플릿 메서드(Template Method) 패턴
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    // 제품 생성
    // 하위 클래스가 구체적인 내용 작성
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product); // 제품 등록
}

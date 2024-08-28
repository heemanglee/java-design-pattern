package template_method;

public abstract class AbstractDisplay {

    // 템플릿 메서드(display)만 보아서는, 이 메서드의 세부 내용을 알 수 없다.
    // 추상 메서드를 실제로 구현한 하위 클래스를 봐야 알 수 있다.
    public void display() {
        open();
        for(int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    // 추상 메서드는 하위 클래스가 작성한다.
    public abstract void print();

    public abstract void open();

    public abstract void close();
}

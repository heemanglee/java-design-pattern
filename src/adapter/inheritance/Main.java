package adapter.inheritance;

public class Main {

    public static void main(String[] args) {
        // PrintBanner 클래스는 Print 인터페이스의 구현체
        // PrintBanner 클래스는 Adapter 패턴을 사용하여 Print 인터페이스의 메서드를 구현한다.
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}

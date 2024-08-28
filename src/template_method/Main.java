package template_method;

public class Main {

    public static void main(String[] args) {
        // CharDisplay, StringDisplay 클래스는 AbstractDisplay의 하위 클래스이다.
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World");

        // Abstract#display()의 실제 동작은 하위 클래스에서 작성된다.
        d1.display();
        d2.display();
    }
}

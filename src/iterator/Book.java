package iterator;

// Book 클래스는 책의 이름을 저장 및 반환하는 책임만 갖는다.
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

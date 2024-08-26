package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));

        // 명시적으로 Iterator 사용
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("책 이름 : " + book.getName());
        }
        System.out.println();

        // 확장 for문 사용, Iterable 인터페이스를 구현한 경우에 사용 가능
        // Iterable은 iterator()을 구현해야 한다.
        for (Book book : bookShelf) {
            System.out.println("책 이름 : " + book.getName());
        }
        System.out.println();
    }
}

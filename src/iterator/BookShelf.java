package iterator;

import java.util.Iterator;

// BookShelf : 책장
// 여러 개의 Book을 저장하는 컬렉션의 역할만 담당한다.
public class BookShelf implements Iterable<Book> { // Iterable을 구현하기 때문에 iterator()가 필요하다.

    private Book[] books; // Book을 담는 컬렉션
    private int last = 0;

    public BookShelf(int mazSize) {
        this.books = new Book[mazSize];
    }

    public Book getBookAt(int index) { // 인덱스를 통해 값을 가져온다.
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    // BookShelf는 Book을 담는 역할만 한다. -> Book을 컬렉션에 저장하여 관리한다.
    // 컬렉션에 저장된 데이터를 순회하는 것은 Iterator의 책임이다.
    @Override
    public Iterator<Book> iterator() {
        // iterator의 내부 구조를 클라이언트에 보여주지 않는다.
        // 내부 구조는 BookShelfIterator만 알고 있으면 된다.
        return new BookShelfIterator(this);
    }
}

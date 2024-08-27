package adapter.inheritance;

// Adapter 클래스
// 기존의 기능(Banner)를 재활용하여, 새로운 기능(Print)를 구현하되, 둘 간의 기능이 일치하지 않으므로 중간 변환책인 PrintBanner를 구현한다.
// Banner 클래스의 메서드를 "상속"받아, Print 인터페이스를 구현한다.
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen(); // Banner#showWithParen()
    }

    @Override
    public void printStrong() {
        showWithAster(); // Banner#showWithAster()
    }
}

package adapter.interfaces;

// Adapter 클래스
// 기존의 기능(Banner)를 재활용하여, 새로운 기능(Print)를 구현하되, 둘 간의 기능이 일치하지 않으므로 중간 변환책인 PrintBanner를 구현한다.
// Banner 인스턴스를 포함하여, 이 인스턴스의 메서드를 호출한다.
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // Banner#showWithParen()
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // Banner#showWithAster()
    }
}

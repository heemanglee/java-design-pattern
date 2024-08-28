package template_method;

public class StringDisplay extends AbstractDisplay {

    private String str; // 표시할 문자열
    private int width; // 문자열의 길이

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

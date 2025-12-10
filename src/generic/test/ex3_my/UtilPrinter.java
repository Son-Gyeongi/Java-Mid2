package generic.test.ex3_my;

public class UtilPrinter {

    public static <T extends Shuttle> void printV1(T t) {
        t.showInfo();
    }

    public static void printV2(Shuttle<?> t) {
        t.showInfo();
    }
}

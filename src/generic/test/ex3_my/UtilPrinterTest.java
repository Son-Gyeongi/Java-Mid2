package generic.test.ex3_my;

import generic.test.ex3_my.unit.Marine;
import generic.test.ex3_my.unit.Zealot;
import generic.test.ex3_my.unit.Zergling;

// 제네릭 메서드와 와일드카드
public class UtilPrinterTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        UtilPrinter.printV1(shuttle1);
        UtilPrinter.printV2(shuttle1);
    }
}

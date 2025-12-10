package generic.test.ex3_my;

import generic.test.ex3_my.unit.Marine;
import generic.test.ex3_my.unit.Zealot;
import generic.test.ex3_my.unit.Zergling;

// 제네릭 타입과 상한
public class ShuttleTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));
        shuttle3.showInfo();
    }
}

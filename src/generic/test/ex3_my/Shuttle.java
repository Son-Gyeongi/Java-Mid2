package generic.test.ex3_my;

import generic.test.ex3_my.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T value;

    public void in(T t) {
        value = t;
    }

    public void showInfo() {
        System.out.println("이름: " + value.getName() + ", HP: " + value.getHp());
    }
}

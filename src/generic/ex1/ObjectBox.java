package generic.ex1;

// 다형성을 통한 중복 해결 시도 -> 타입 안전성이 떨어진다.
public class ObjectBox {

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}

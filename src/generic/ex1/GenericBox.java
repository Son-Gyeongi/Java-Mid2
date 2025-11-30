package generic.ex1;

// 제네릭 적용 -> 코드 재사용과 타입 안정성이 있다.
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

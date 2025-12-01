package generic.ex1;

// 로 타입 - row type
public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 로 타입, == GenericBox<Object>
        // GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}

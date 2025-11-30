package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object; // Object -> Integer 다운캐스팅
        System.out.println("integer = " + integer);
        // 한 줄로 합치기
        Integer integer2 = (Integer) integerBox.get();
        System.out.println("integer2 = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 다운캐스팅
        System.out.println("str = " + str);

        // 문제점 - 잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생
    }
}

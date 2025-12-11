package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
        인덱스를 사용하는 경우 데이터가 아무리 많아도
        한 번의 연산으로 필요한 위치를 찾을 수 있다.
         */
        System.out.println("==index 입력: O(1)=="); // 빅오1: 한번에 데이터를 찾는다.
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        /*
        배열의 순차 겸색은 배열의 크기가 n이면 연산도 n만큼 필요하다.
         */
        System.out.println("배열 검색: O(n)=="); // 빅오n: 데이터의 갯수만큼 찾아야 한다.
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}

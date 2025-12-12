package collection.array;

import java.util.Arrays;

// 직접 구현하는 배열 리스트1
public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; // 기본 용량

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    // 검색 기능
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        // [1,2,3,null,null] // size=3
        // [1,2,3] // size=3 <-출력
//        return Arrays.toString(elementData);
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + ", capacity = " + elementData.length;
    }
}

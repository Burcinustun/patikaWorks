package ClassList;

import java.util.Arrays;

public class MyClassList<T> {
    private T[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyClassList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public MyClassList(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Kapasite 0 veya negatif olamaz!");
        array = (T[]) new Object[capacity];
    }

    public int size() { return size; }
    public int getCapacity() { return array.length; }

    public void add(T data) {
        if (size == array.length) resize(array.length * 2);
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) newArray[i] = array[i];
        array = newArray;
    }

    public T get(int index) { return (index < 0 || index >= size) ? null : array[index]; }

    public T remove(int index) {
        if (index < 0 || index >= size) return null;
        T removed = array[index];
        for (int i = index; i < size - 1; i++) array[i] = array[i + 1];
        array[--size] = null;
        return removed;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) return null;
        T oldValue = array[index];
        array[index] = data;
        return oldValue;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++)
            if (array[i] != null && array[i].equals(data)) return i;
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--)
            if (array[i] != null && array[i].equals(data)) return i;
        return -1;
    }

    public boolean isEmpty() { return size == 0; }

    // --------  toArray --------
    @SuppressWarnings("unchecked")
    public T[] toArray(T[] a) {
        if (a.length < size) {
            // Yeni dizi oluştur
            return (T[]) Arrays.copyOf(array, size, a.getClass());
        }
        System.arraycopy(array, 0, a, 0, size);
        if (a.length > size) a[size] = null;
        return a;
    }

    public void clear() {
        for (int i = 0; i < size; i++) array[i] = null;
        size = 0;
    }

    public MyClassList<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) return null;
        MyClassList<T> sub = new MyClassList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) sub.add(array[i]);
        return sub;
    }

    public boolean contains(T data) { return indexOf(data) != -1; }


}

import java.util.Arrays;
import java.util.Comparator;

public class ArrayList_Egor<E> implements IntensiveList<E> {
    private int capacity = 10;
    private int size = 0;
    private Object[] array;

    public ArrayList_Egor() {
        this.array = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    @Override
    public void add(E element) {
        checkOfOvered();
        array[size] = element;
        size++;
    }

    private void checkOfOvered() {
        if (size == capacity) {
            resize();
        }
        ;
    }

    private void resize() {
        capacity = capacity * 2;
        array = Arrays.copyOf(array, capacity);
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        checkOfOvered();
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    };

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Неорректный индекс " + index);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E) array[index];
    }

    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        checkIndex(index);
        E oldEl = (E) array[index];
        array[index] = element;
        return oldEl;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkIndex(index);
        E oldEl = (E) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return oldEl;
    }

    public void clear() {
        capacity = 10;
        array = new Object[capacity];
        size = 0;
    }

    public void split(int size) {
        checkIndex(size);
        array = Arrays.copyOf(array, size);
        this.size = size;
        capacity = size;
    }

    public void quickSort(Comparator<E> comparator) {
        if (size > 1 && !isSorted(comparator)) {
            quickSortHelper(0, size - 1, comparator);
        } else {System.out.println("Уже остортирован");}
    }

    private void quickSortHelper(int low, int high, Comparator<E> comparator) {
        if (low < high) {
            int pivotIndex = partition(low, high, comparator);
            quickSortHelper(low, pivotIndex - 1, comparator);
            quickSortHelper(pivotIndex + 1, high, comparator);
        }
    }

    @SuppressWarnings("unchecked")
    private int partition(int low, int high, Comparator<E> comparator) {
        E pivot = (E) array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare((E) array[j], pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @SuppressWarnings("unchecked")
    public boolean isSorted(Comparator<E> comparator) {
        for (int i = 1; i < size; i++) {
            if (comparator.compare((E) array[i - 1], (E) array[i]) > 0) {
                return false;
            }
        }
        return true; 
    }

}

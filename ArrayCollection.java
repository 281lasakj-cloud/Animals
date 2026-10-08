public class ArrayCollection<T> {

    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayCollection() {
        items = (T[]) new Object[10];
        size = 0;
    }

    public void add(T item) {
        if (size == items.length) {
            resize();
        }

        items[size] = item;
        size++;
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newItems = (T[]) new Object[items.length * 2];

        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }
}
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayIterator <T> implements Iterable <T> {
    private final List<T> elements;

    public ArrayIterator(T[][] array) {
        elements = new LinkedList<>();
        if (array == null) {
            elements.add(null);
        } else {
            for (T[] subarray : array) {
                elements.addAll(Arrays.asList(subarray));
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    public Stream<T> stream() {
        return elements.stream();
    }
}
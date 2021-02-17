import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayIteratorTest {

    @org.junit.Test
    public void iteratorTestInteger() {
        Integer[][] array =  {{1},{2,3,4,5},{6,7},{8,9,10,11,12}};
        Integer i = 1;

        ArrayIterator <Integer> arrayIterator = new ArrayIterator<>(array);
        Iterator<Integer> iterator = arrayIterator.iterator();
        while(iterator.hasNext()){
            assertEquals(iterator.next(), i++);
        }
    }

    @org.junit.Test
    public void iteratorTestString() {
        String [][] array =  {{"a"},{"b","c","d","e"},{"f","g"},{"h","i","j","k","l"}};
        Character i = 'a';

        ArrayIterator <String> arrayIterator = new ArrayIterator<>(array);
        Iterator<String> iterator = arrayIterator.iterator();
        while(iterator.hasNext()){
            assertEquals(iterator.next(), Character.toString(i++));
        }
    }

    @org.junit.Test
    public void iteratorTestChar() {
        Character[][] array = {{'a'}, {'b', 'c', 'd', 'e'}, {'f', 'g'}, {'h', 'i', 'j', 'k', 'l'}};
        Character i = 'a';

        ArrayIterator <Character> arrayIterator = new ArrayIterator<>(array);
        Iterator<Character> iterator = arrayIterator.iterator();
        while(iterator.hasNext()){
            assertEquals(iterator.next(), i++);
        }
    }

    @org.junit.Test
    public void iteratorTestNull() {
        Object[][] array = {{}};
        ArrayIterator <Object> arrayIterator = new ArrayIterator<>(array);
        Iterator<Object> iterator = arrayIterator.iterator();
        while(iterator.hasNext()){
            assertNull(iterator.next());
        }
    }

    @org.junit.Test
    public void iteratorTestNullObject() {
        Object[][] array = null;
        ArrayIterator <Object> arrayIterator = new ArrayIterator<>(array);
        Iterator<Object> iterator = arrayIterator.iterator();
        while(iterator.hasNext()) assertNull(iterator.next());
    }

    @org.junit.Test
        public void iteratorTestAnotherObject() {
            Object[][] array = {{new Object()}};
            ArrayIterator <Object> arrayIterator = new ArrayIterator<>(array);
            Iterator<Object> iterator = arrayIterator.iterator();
            while(iterator.hasNext()) assertEquals(iterator.next(),array[0][0]);
        }

    @org.junit.Test
        public void iteratorTestInitArray() {
            Object[][] array = new Object[10][10];
            ArrayIterator <Object> arrayIterator = new ArrayIterator<>(array);
            Iterator<Object> iterator = arrayIterator.iterator();
            while(iterator.hasNext()) assertNull(iterator.next());
        }

}
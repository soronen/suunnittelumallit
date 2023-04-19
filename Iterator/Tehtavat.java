package Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Tehtavat {

    public static <T, E> void tehtavaA(Iterator<T> iterator1, Iterator<E> iterator2) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (iterator1.hasNext()) {
                    System.out.println("Thread A: " + iterator1.next());
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (iterator2.hasNext()) {
                    System.out.println("Thread B: " + iterator2.next());
                }
            }
        };
        thread1.start();
        thread2.start();
    }

    public static <T> void tehtavaB(Iterator<T> iterator) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (iterator.hasNext()) {
                    System.out.println("Thread C: " + iterator.next());
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (iterator.hasNext()) {
                    System.out.println("Thread D: " + iterator.next());
                }
            }
        };
        thread1.start();
        thread2.start();
    }

    public static void tehtavaC(Iterator<String> iterator, List<String> list) {
        if (list.size() < 3) {
            throw new IllegalArgumentException("List size must be at least 3");
        }


        boolean modified = false;
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread E: " + iterator.next());
                iterator.remove();
                //iterator.remove(); // crash
                list.set(2, "modified");
                while (iterator.hasNext()) {
                    System.out.println("Thread E: " + iterator.next());
                }
                for (String s : list) {
                    System.out.println("Thread E, Iterating over list afterwards: " + s);
                }
            }
        };
        thread1.start();
    }
}


package gr.aueb.cf.cf9.ch16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();
        items.add(new Document());
        items.add(new Photo());
        items.add("hello");
        items.add(42);
        Runnable task = () -> {
            for (Object obj : items) {
                if (obj instanceof Printable p) {
                    p.print();
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}

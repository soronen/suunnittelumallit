package Strategy.ListConverters;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EverySecondLine implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(0);
        list.forEach((String s) -> {
            sb.append(s);
            if (counter.incrementAndGet() % 2 == 0) {
                sb.append("\n");
            } else {
                sb.append(", ");
            }
        });
        return sb.toString();
    }
}
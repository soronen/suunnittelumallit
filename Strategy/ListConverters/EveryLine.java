package Strategy.ListConverters;

import java.util.Iterator;
import java.util.List;

public class EveryLine implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        it.forEachRemaining((String s) -> {
            sb.append(s + "\n");
        });
        return sb.toString();
    }
}

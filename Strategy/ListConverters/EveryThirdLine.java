package Strategy.ListConverters;

import java.util.List;

public class EveryThirdLine implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= list.size(); i++) {
            sb.append(list.get(i-1));
            if (i % 3 == 0 && i != 0) {
                sb.append("\n");
            } else if (i != list.size()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

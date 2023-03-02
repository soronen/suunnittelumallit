package Strategy;

import Strategy.ListConverters.EveryLine;
import Strategy.ListConverters.EverySecondLine;
import Strategy.ListConverters.EveryThirdLine;
import Strategy.ListConverters.ListConverter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            list.add("String " + i);
        }

        ListConverter converter = new EveryLine();
        System.out.println(converter.listToString(list));

        converter = new EverySecondLine();
        System.out.println(converter.listToString(list));

        converter = new EveryThirdLine();
        System.out.println(converter.listToString(list));
    }
}

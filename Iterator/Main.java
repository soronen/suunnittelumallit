package Iterator;

import java.util.*;


/*
a) Tutki ja raportoi, kuinka Javan iteraattori käyttäytyy,
jos yritetään iteroida kokoelmaa kahdella säikeellä yhtä aikaa,
kun molemmilla on oma iterattori.

Jos molemmilla on oma iteraattori eivätkä ne muuta listaa,
ne voivat käydä läpi samaa listaa ihan ok.

b) entä, jos säikeet käyttävät samaa iteraattoria vuorotellen?

Jos säikeet käyttävät samaa iteraattoria,
listan elementit eivät välttämättä palaudu oikeassa järjestyksessä.

c) Kuinka käy, jos kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana.

Jos käytetään vain yhtä säiettä, muutokset näkyvät ihan hyvin.

d) Keksi jotain muuta testattavaa (esim. iteraattorin remove, forEachRemaining).

 -  remove() -metodia voi kutsua vain kerran next() metodin kutsun jälkeen,
    koska se poistaa viimeisenä palautetun elementin eikä iteroi listaa.

 -  forEachRemaining() on ikään kuin while(iterator.hasNext() {iterator.next; ...;}.
    Se käy vielä iteroimattomat kohteet läpi.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("element1", "element2", "element3", "element4", "element5"));
        Map<String, Integer> strIntMap = new HashMap<String, Integer>() {{
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
        }};

        Iterator<Integer> arrayIterator = Arrays.stream(intArray).iterator();
        Iterator<Integer> arrayIterator2 = Arrays.stream(intArray).iterator();
        Iterator<String> listIterator = stringList.iterator();
        Iterator<Map.Entry<String, Integer>> mapIterator = strIntMap.entrySet().iterator();

        System.out.println("Tehtävä A:");
        Tehtavat.tehtavaA(arrayIterator, arrayIterator2);
        Thread.sleep(1000);

        System.out.println("Tehtävä B:");
        Tehtavat.tehtavaB(mapIterator);
        Thread.sleep(1000);

        System.out.println("Tehtävä C:");
        Tehtavat.tehtavaC(listIterator, stringList);
    }
}

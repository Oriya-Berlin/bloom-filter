import java.util.Map;

import static java.util.Map.entry;

public class CustomFilterGenerator {

    /**
     *  Letters to prime numbers map.
     */
    private static final Map<Character, Integer> LETTERS_TO_NUMBERS =
            Map.ofEntries(
                    entry('a',3), entry('b',5),
                    entry('c',7), entry('d',11),
                    entry('e',13), entry('f',17),
                    entry('g',19), entry('h',23),
                    entry('i',29), entry('j',31),
                    entry('k',37), entry('l',41),
                    entry('m',43), entry('n',47),
                    entry('o',53), entry('p',59),
                    entry('q',61), entry('r',67),
                    entry('s',71), entry('t',73),
                    entry('u',79), entry('v',83),
                    entry('w',89), entry('x',97),
                    entry('y',101), entry('z',103)
            );


    /**
     *  Just a simple algorithm for the example.
     *  Uniqueness and uniformed distribution are NOT guarantee.
     */
    public static int toNumber(String value){
        int index = 0;
        for (int i = 0; i < value.length(); i++) {
            index = index + LETTERS_TO_NUMBERS.get(value.charAt(i));
        }
        return index * 31;
    }

}

package packt.java11.example.stringsort;

public class Sort {

    public static void sort(String[] names) {
// START SNIPPET example_stringsort
        var n = names.length;
        while (n > 1) {
            for (var j = 0; j < n - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    final var tmp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = tmp;
                }
            }
            n--;
        }
//END SNIPPET
    }
}

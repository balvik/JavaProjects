package packt.java11.by.example;


import org.junit.jupiter.api.Test;
import packt.java11.example.stringsort.Sort;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void sortRunsFine(){
        Sort.sort(List.of("b","a","c").toArray(new String[3]));
    }

}

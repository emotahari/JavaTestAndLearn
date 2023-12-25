package generics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;


public class GenericTest {
    @Test
    void shoud_works_but_have_errors_in_runtime(){
        List<Integer> list = new ArrayList<>(); // Generic
        List<String> list_1 = new ArrayList<>(); // Generic
        List list_2 = new ArrayList<>(); // non-Generic
        list_2.add(1); // ADD INTEGER TO LIST
        list_2.add("One"); // ADD STRING TO THE LIST


        Assertions.assertThat((Integer) list_2.get(1)).isNotNull(); // ERR

    }

    @Test
    void shoud_works(){
        List<Integer> list = new ArrayList<>(); // non-Generic
        list.add(1); // ADD INTEGER TO LIST
        Integer[] integer = list.toArray(new Integer[0]);

        Assertions.assertThat((Integer) list.get(1)).isNotNull(); // ERR

    }

    @Test
    void generic_method_syntax(){
        GenericMethod<Integer> gt = new GenericMethod<>();
        Integer[] integer = gt.toArray(new Integer[0]);
    }

    class GenericMethod<E>{
        <T extends E> T[] toArray(T[] a){
            return null;
        }

    }
}

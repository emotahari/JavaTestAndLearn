package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParallelStreamShould {

    @Test
    void un_predictable() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sequential result is :");
        integers.stream().forEach(System.out::println);
        System.out.println("Parallel result is :");
        integers.parallelStream().forEach(System.out::println);

        final Integer sequentialSum = integers.stream().reduce(5, Integer::sum);
        assertThat(sequentialSum).isEqualTo(20);

        final Integer parallelSum = integers.parallelStream().reduce(5, Integer::sum);
        assertThat(parallelSum).isEqualTo(20);  // 6 + 7 + 8 + 9 + 10 = 40
    }


}

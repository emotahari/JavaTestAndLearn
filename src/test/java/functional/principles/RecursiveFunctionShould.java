package functional.principles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveFunctionShould {
    // tavabe bazgashti: tabei ke khodesh ra seda mizanad ta zamani ke be shart payani beresad

    @Test
    void  call_itSelf(){
        int limit = 5;

        Assertions.assertThat(itertiveSum(limit)).isEqualTo(15);
        Assertions.assertThat(recursiveSum(limit)).isEqualTo(15);
        Assertions.assertThat(tailRecursiveSum(0,limit)).isEqualTo(15);
    }

    private int tailRecursiveSum(int sum,int limit) {
        if(limit == 0){
            return sum;
        }
        return tailRecursiveSum(sum + limit, limit - 1);

    }

    @Test
    private int recursiveSum(int limit) {
        if(limit == 0){
            return limit;
        }
        return limit + recursiveSum(limit - 1);
    }

    private int itertiveSum(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }
}

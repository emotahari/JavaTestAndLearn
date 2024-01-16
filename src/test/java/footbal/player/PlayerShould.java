package footbal.player;

import football.player.Player;
import helper.PlayerTestHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


    // Paradigm:
    // ....
    //      Impretive Programming : barname nevisi dasturi
    // ....
    //      - OOP
    //      Declarative Programming : barname nevisi elani
    // ....
    //      - Functional Programming



public class PlayerShould {
    @Test
    void give_best_scorer_with_oop(){
        List<Player> scorers = new PlayerTestHelper().getPlayers();
        Player bestScorer = scorers.get(0);
        for (Player scorer : scorers){
            if(scorer.getGoal() > bestScorer.getGoal()){
                bestScorer = scorer;
            }

        }
        Assertions.assertThat(bestScorer.getName()).isEqualTo("asghar");

    }

    @Test
    void give_best_scorer_whit_fp(){
        List<Player> scorers = new PlayerTestHelper().getPlayers();
        Player bestScorer = scorers.stream().max(Comparator.comparing(player -> player.getGoal())).get();
        Assertions.assertThat(bestScorer.getName()).isEqualTo("asghar");
    }


}

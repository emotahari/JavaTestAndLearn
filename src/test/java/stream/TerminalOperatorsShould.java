package stream;

import football.player.Player;
import helper.PlayerTestHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TerminalOperatorsShould {
    private List<Player> players;
    @BeforeEach
    void startUp(){
        players = new PlayerTestHelper().getPlayers();
    }

    @Test
    void collect_data(){             // toList, toMap, toSet, toArray, toCollection

        Function<? super Player, UUID> keys = player -> UUID.randomUUID();
        Function<? super Player, ? extends Player> values = player -> player;
        Map<UUID, Player> playersWithId = players.stream().collect(Collectors.toMap(keys,values));   // collectandreturn
        BiConsumer<? super UUID, ? super Player> consumer = (k, v) -> System.out.println("key is " + k + " value is " + v);
        playersWithId.forEach(consumer);

        assertThat(players).hasSameElementsAs(playersWithId.values());
        assertThat(playersWithId.keySet()).hasOnlyElementsOfType(UUID.class);
    }

    @Test
     void calculate_data(){
        final Stream<Integer> goals = players.stream().map(Player::getGoal);
//        final List<Player> players = new PlayerTestHelper().getPlayer();  oon bala sakhtimesh
        ToIntFunction<? super Integer> intConverter = Integer::valueOf;
        final Integer sum = goals.mapToInt(intConverter).sum(); // raveshe jadidi
//        final Integer sum = players.stream().map(Player::getGoal).mapToInt(intConverter).sum(); ravesh ghadim

        assertThat(sum).isEqualTo(376);


        Double average = players.stream().map(Player::getGoal).collect(averagingInt(intConverter));
        assertThat(average).isEqualTo(125.33333333333333);

        Integer max = players.stream().map(Player::getGoal).mapToInt(intConverter).max().getAsInt();
        assertThat(max).isEqualTo(178);

        IntSummaryStatistics collect = players.stream().map(Player::getGoal).collect(summarizingInt(intConverter));
        System.out.println(collect.getCount());
    }

    @Test
    void group_data(){
        Function<Player, String> playerName = Player::getName;
        final Map<String,Long> groupedPlayer = players.stream()
                .collect(groupingBy(playerName, counting()));
        groupedPlayer.forEach((k, v) -> System.out.println(k +" vs "+ v));
        assertThat(groupedPlayer).containsEntry("akbar", 1l)
                .containsEntry("AliDaei", 1l)
                .containsEntry("asghar",1l);
    }


    @Test
    void reduce_data(){
        BinaryOperator<Integer> sumOfGolas = (total,goal) -> total + goal;
        Integer reduce = players.stream().map(Player::getGoal).reduce(0, sumOfGolas);

        assertThat(reduce).isEqualTo(376);

        BinaryOperator<String> formatName =
                TerminalOperatorsShould::fomat;
        final String reduce1 = players.stream()
                .map(Player::getName)
                .reduce("", formatName)
                .replaceFirst("\\|", "")
                .trim();
        System.out.println(reduce1);
        assertThat(reduce1).isEqualTo("Ali DAEI | asg HAR | ak BAR");
    }

    private static String fomat(String res, String playerName) {
        String seprator = " ";
        String firstName = playerName.split(seprator)[0];
        String lastName = playerName.split(seprator)[1];
        return res + " | "
                + firstName + seprator
                + lastName.toUpperCase();
    }

    @Test
    void match_data(){
        Predicate<? super Integer> moreThan50Goals = goal -> goal >+ 50;
        boolean b = players.stream().map(Player::getGoal).allMatch(moreThan50Goals);

        assertThat(b).isTrue();

        boolean c = players.stream().map(Player::getGoal).anyMatch(moreThan50Goals);

        assertThat(c).isTrue();

        boolean d = players.stream().map(Player::getGoal).noneMatch(moreThan50Goals);

        assertThat(d).isTrue();
    }

    @Test
    void find_data(){
        Optional<Integer> firstScorer = players.stream().map(Player::getGoal).findFirst();

        final Optional<String> anyScore = players.stream()
                .filter(player -> player.getGoal()<100)
                .map(Player::getName)
                .findAny();

        assertThat(anyScore.get()).satisfiesAnyOf(
                player -> player.equals("ak bar"),
                player -> player.equals("akgg bar")
        );

    }
}

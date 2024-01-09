package stream;

import football.player.Player;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamShould {
    @Test
    void be_created(){
        final String hello = "Hello";
        final Stream<String> helloStream = Stream.of("hello");

        //assert nadarim

        final Stream<Player> stream = getPlayer().stream();

    }

    private List<Player> getPlayer() {
        List<Player> scorers = new LinkedList<>() ;
        scorers.add(new Player("AliDaei", 109));
        scorers.add(new Player("asghar", 178));
        scorers.add(new Player("akbar", 89));
        return scorers;
    }
}

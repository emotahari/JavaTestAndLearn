package functional.principles;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstClassCitizenFunctionalTest {
    // shahrvand daraje yek

    // 1- mishe function ra be onvane parametre yek method estefade kard
    // 2- mishe function ra be onvane meghdar be yek moteghayer dad
    // 3- mishe function ra be onvane yek meghdar az daroun yekmethod return beshe

    // function da java barbar ast ebarate lambda



    @Test
    void be_passed_as_method_parametr(){
        List<String> players = getPlayers();
        Collections.sort(players, (a,b) -> a.compareTo(b));

        assertPlayerSort(players);

    }

    @Test
    void be_passed_as_value_to_a_variable() {
        List<String> players = getPlayers();
        Comparator<String> stringComparator = (a, b) -> a.compareTo(b);
        Collections.sort(players, stringComparator);

        assertPlayerSort(players);

    }

    @Test
    void be_returned_from_method() {
        List<String> players = getPlayers();
        Comparator<String> stringComparator = getStringComparator();
        Collections.sort(players, stringComparator);

        assertPlayerSort(players);

    }

    private static Comparator<String> getStringComparator() {
        return (a, b) -> a.compareTo(b);
    }

    private static void assertPlayerSort(List<String> players) {
        Assertions.assertThat(players.get(0)).isEqualTo("Ashghar");
    }

    private static List<String> getPlayers() {
        List<String> players = new ArrayList<>();
        players.add("Ronaldo");
        players.add("Ashghar");
        players.add("Ronaldo_2");
        return players;
    }
}
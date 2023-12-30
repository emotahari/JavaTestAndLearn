package football.player;

public class Player {
    private final String name;
    private final Integer goal;

    public Player(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public Integer getGoal() {
        return goal;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGoal(Integer goal) {
//        this.goal = goal;
//    }
}

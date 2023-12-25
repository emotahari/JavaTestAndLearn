package football.player;

public class Player {
    String name;
    Integer goal;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }
}

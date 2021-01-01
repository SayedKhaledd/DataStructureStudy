package CH3;

public class GameEntry {
    private int score;
    private String name;

    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CH3.GameEntry{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

}

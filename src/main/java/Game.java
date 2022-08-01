import java.util.ArrayList;

public class Game {
    protected ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String name1, String name2) {
        Player p1 = null;
        Player p2 = null;
        for (Player player : players) {
            if (player.getName().equals(name1)) {
                p1 = player;
            }
            if (player.getName().equals(name2)) {
                p2 = player;
            }
        }
        if (p1 == null) {
            throw new RuntimeException("Нет 1 игрока");
        }
        if (p2 == null) {
            throw new RuntimeException("Нет 2 игрока");
        }
        if (p1.getStrenght() == p2.getStrenght()) {
            return 0;
        }
        if (p1.getStrenght() > p2.getStrenght()) {
            return 1;
        } else {
            return 2;
        }
    }

}

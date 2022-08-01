import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest {
    Game game = new Game();
    Player p1 = new Player(1, "Katya", 78);
    Player p2 = new Player(5, "Masha", 50);
    Player p3 = new Player(20, "Liza", 147);
    Player p4 = new Player(2, "Li", 78);

    @Test
    public void notPlayers() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        assertThrows(RuntimeException.class, () -> {
            game.round("unknow1", "unknow2");
        });
    }

    @Test
    public void notRegister() {
        assertThrows(RuntimeException.class, () -> {
            game.round("unknow1", "unknow2");
        });
    }

    @Test
    public void notPlayer2() {
        game.register(p1);
        game.register(p2);
        game.register(p3);
        p4.getId();

        assertThrows(RuntimeException.class, () -> {
            game.round(p1.getName(), "unknow2");
        });
    }

    @Test
    public void notPlayer1() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        assertThrows(RuntimeException.class, () -> {
            game.round("unknow1", p3.getName());
        });
    }

    @Test
    public void bePlayers() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        game.round(p1.getName(), p2.getName());
    }

    @Test
    public void bePlayers1() {
        game.register(p1);
        game.register(p2);
        game.register(p3);
        game.register(p4);

        game.round(p1.getName(), p4.getName());
    }

    @Test
    public void bePlayers2() {
        game.register(p1);
        game.register(p2);
        game.register(p3);
        game.register(p4);

        game.round(p2.getName(), p4.getName());
    }

}

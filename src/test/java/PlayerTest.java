import org.example.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player('X');
        assertEquals('X', player.getMarker(), "Player should be initialized with marker X");
    }

    @Test
    public void testMarkerChange() {
        Player player = new Player('X');
        player.marker = 'O';
        assertEquals('O', player.getMarker(), "Player's marker should be changed to O");
    }
}

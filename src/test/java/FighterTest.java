import com.codeclan.*;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FighterTest {
    Barbarian barbarian;
    IWeapon sword;
    Enemy troll;


    @Before
    public void before() {
        sword = new Sword(50);
        barbarian = new Barbarian("Dave", 100, sword);
        troll = new Troll("Timmy", 200);
    }

    @Test
    public void canAttack() {
        barbarian.doesAttack(troll);
        assertEquals(150, troll.getHealth());
    }
}

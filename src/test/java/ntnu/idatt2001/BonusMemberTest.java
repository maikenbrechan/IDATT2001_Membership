package ntnu.idatt2001;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class BonusMemberTest {
    /*
    Oppretter 4 objekter for å teste om de har fått riktig membershilevel.
     */
    BonusMember oneGold = new BonusMember(1, LocalDate.now(), 100000, "Kvalø, Eva", "ekva@gmail.com");
    BonusMember twoGold = new BonusMember(2, LocalDate.now(), 75000, "Brechan, Maiken", "maikebre@ntnu.no");
    BonusMember oneSilver = new BonusMember(3, LocalDate.now(), 30000, "Lamo, Oda", "oda@gmail.com");
    BonusMember oneBasic = new BonusMember(4, LocalDate.now(), 10000, "Johnsen, Rikke", "rikek@hotmail");

    @Nested
    class TestingCorrectCases{

    @Test
    public void shouldBegoldMembership(){
        assertEquals("Gold", oneGold.getMembershipLevel());
        assertEquals("Gold", twoGold.getMembershipLevel());
    }
    @Test
    public void shouldBeSilverMembership(){
        assertEquals("Silver", oneSilver.getMembershipLevel());
    }
    @Test
    public void shouldBeBasicMembership(){
            assertEquals("Basic", oneBasic.getMembershipLevel());
        }
    }
}
    @Nested
    class DestructiveTesting{
        /*
     Oppretter 4 objekter for å teste om de har fått riktig membershilevel.
      */
        BonusMember oneGold = new BonusMember(1, LocalDate.now(), 100000, "Kvalø, Eva", "ekva@gmail.com");
        BonusMember twoGold = new BonusMember(2, LocalDate.now(), 70000, "Brechan, Maiken", "maikebre@ntnu.no");
        BonusMember oneSilver = new BonusMember(3, LocalDate.now(), 30000, "Lamo, Oda", "oda@gmail.com");

        @Test
    public void shouldNotBeBasic(){
        assertNotEquals("Basic",oneGold.getMembershipLevel());
        assertNotEquals("Basic",twoGold.getMembershipLevel());
        assertNotEquals("Basic",oneSilver.getMembershipLevel());
        }


}

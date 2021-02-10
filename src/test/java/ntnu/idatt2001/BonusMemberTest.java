package ntnu.idatt2001;


import java.time.LocalDate;

public class BonusMemberTest {

    @nested
    class TestingCorrectCases{
        BonusMember oneGold = new BonusMember(1, LocalDate.now(), 100000, "Kvalø, Eva", "ekva@gmail.com");
        BonusMember twoGold = new BonusMember(2, LocalDate.now(), 70000, "Brechan, Maiken", "maikebre@ntnu.no");
        BonusMember oneSilver = new BonusMember(3, LocalDate.now(), 30000, "Lamo, Oda", "oda@gmail.com");
        BonusMember oneBasic = new BonusMember(4, LocalDate.now(), 10000, "Johnsen, Rikke", "rikek@hotmail");

    @Test
    public void goldMembership(){
        Boolean test1 = oneGold.getMembershipLevel().equals("Gold");
        assertTrue(test1);
    }

    }
}

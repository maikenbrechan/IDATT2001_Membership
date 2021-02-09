package ntnu.idatt2001;

public class BasicMembership extends Membership{

    /* Setter navnet til medlemskapet via objektvariabel i Membership, slik at objekter er BasicMembership
    vil alltid ha navnet Basic
    */

    public BasicMembership(){
        super("Basic");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        return bonusPointsBalance+newPoints;
    }

    @Override
    public String getMembershipName() {
        return "Basic";
    }
}

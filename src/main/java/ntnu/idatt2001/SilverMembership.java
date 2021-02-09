package ntnu.idatt2001;

import java.lang.Math;

public class SilverMembership extends Membership{
    private float pointsScalingFactor = 1.2f;

    /* Setter navnet til medlemskapet via objektvariabel i Membership, slik at objekter er SilverMembership
    vil alltid ha navnet Silver
    */
    public SilverMembership(){
        super("Silver");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        int totoalPoints=Math.round(newPoints*pointsScalingFactor);
        return bonusPointsBalance + totoalPoints;
    }

    @Override
    public String getMembershipName() {
        return "Silver";
    }
}

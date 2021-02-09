package ntnu.idatt2001;

public class GoldMembership extends Membership{
    private final float POINT_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private final float POINT_SCALING_FACTOR_LEVEL_2 = 1.5f;
    private final int BONUS_LIMIT=90000;

    /* Setter navnet til medlemskapet via objektvariabel i Membership, slik at objekter er GoldMembership
    vil alltid ha navnet Gold
    */

    public GoldMembership(){
        super("Gold");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        int totalPoints = 0;
        if(bonusPointsBalance>BONUS_LIMIT){
            totalPoints = Math.round(newPoints*POINT_SCALING_FACTOR_LEVEL_2);
        }
        else{
            totalPoints = Math.round(bonusPointsBalance*POINT_SCALING_FACTOR_LEVEL_1);
        }
        return bonusPointsBalance+totalPoints;
    }

    @Override
    public String getMembershipName() {
        return "Gold";
    }
}

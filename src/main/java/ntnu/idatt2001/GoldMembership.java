package ntnu.idatt2001;

public class GoldMembership extends Membership{
    private float POINT_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private float POINT_SCALING_FACTOR_LEVEL_2 = 1.5f;
    private int BONUS_LIMIT=90000;

    public GoldMembership(){
        super("Gold membership");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        if(bonusPointsBalance>BONUS_LIMIT){
            newPoints*=POINT_SCALING_FACTOR_LEVEL_2;
        }
        else{
            bonusPointsBalance*=POINT_SCALING_FACTOR_LEVEL_1;
        }
        return super.registerBonusPoints(bonusPointsBalance, newPoints);
    }

    @Override
    public String getMembershipName() {
        return super.getMembershipName();
    }
}

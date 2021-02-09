package ntnu.idatt2001;

public class SilverMembership extends Membership{
    private float pointsScalingFactor = 1.2f;

    public SilverMembership(){
        super("Silver membership");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        newPoints*=pointsScalingFactor;
        return super.registerBonusPoints(bonusPointsBalance, newPoints);
    }

    @Override
    public String getMembershipName() {
        return super.getMembershipName();
    }
}

package ntnu.idatt2001;

public class BasicMembership extends Membership{

    public BasicMembership(){
        super("Basic membership");
    }

    @Override
    public int registerBonusPoints(int bonusPointsBalance, int newPoints) {
        return super.registerBonusPoints(bonusPointsBalance, newPoints);
    }

    @Override
    public String getMembershipName() {
        return super.getMembershipName();
    }
}

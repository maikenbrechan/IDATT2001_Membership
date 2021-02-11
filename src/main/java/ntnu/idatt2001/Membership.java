package ntnu.idatt2001;

public abstract class Membership {
    private String membershipName;

    abstract public int registerBonusPoints(int bonusPointsBalance ,int newPoints);

    abstract public String getMembershipName();
}

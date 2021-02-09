package ntnu.idatt2001;

public class Membership {
    private String membershipName;

    public Membership(String membershipName){
        this.membershipName=membershipName;
    }

    public int registerBonusPoints(int bonusPointsBalance ,int newPoints){
        return bonusPointsBalance + newPoints;
    }

    public String getMembershipName() {
        return membershipName;
    }
}

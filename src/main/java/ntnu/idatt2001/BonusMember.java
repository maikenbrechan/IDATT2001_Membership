package ntnu.idatt2001;

import java.time.LocalDate;

public class BonusMember {
    private int membernumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailAdress;
    private String password;
    public int SILVER_LIMIT = 25000;
    public int GOLD_LIMIT=75000;
    private Membership membership;

    public BonusMember(int membernumber, LocalDate enrolledDate, int bonusPoints, String name, String eMailAdress){
        this.membernumber=membernumber;
        this.enrolledDate=enrolledDate;
        this.bonusPointsBalance=bonusPoints;
        this.name=name;
        this.eMailAdress=eMailAdress;
        if(bonusPointsBalance>GOLD_LIMIT){
            this.membership = new GoldMembership();
        }
        else if(bonusPointsBalance>SILVER_LIMIT){
            this.membership = new SilverMembership();
        }
        else{
            this.membership=new BasicMembership();
        }
    }

    public String geteMailAdress() {
        return eMailAdress;
    }

    public void registerBonusPoints(int newPoints){
        if(newPoints<1){
            throw new IllegalArgumentException("Unvalid amount of points");
        }
            this.bonusPointsBalance+=newPoints;
    }

    public boolean checkPassword(String typedIn){
        return this.password.equals(typedIn);
    }
    public String getMembershipLevel(){
        return this.membership.getMembershipName();
    }

    public void checkAndSetMembership(Membership newMembership){
        if(this.membership.equals(newMembership)){
            System.out.println("You already have the requested membership");
        }
        else{
            this.membership=newMembership;
            }
        }
    }

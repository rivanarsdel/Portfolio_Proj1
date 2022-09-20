package models;

import utilities.HelperMethods;

public class Account extends HelperMethods {

    private int accId;
    private String accName;
    private String accUUID;
    private double accBal;

    //<><><><><>----------------------<><><><><>
    //<><><><><>-----Constructors-----<><><><><>
    //<><><><><>----------------------<><><><><>

    //Full Args
    public Account () {}

    public Account(int accId, String accJointUUID, String accName, String accUUID, double accBal) {
        this.accId = accId;
        this.accName = accName;
        this.accUUID = accUUID;
        this.accBal = accBal;
    }

    public Account(String accName) {
        this.accId = 0;
        this.accName = accName;
        this.accUUID = generateUUID();
        this.accBal = 0;
    }

    //Getters and Setters

    public int getAccId() {return accId;}

    public void setAccId(int accId) {this.accId = accId;}

    public String getAccName() {return accName;}

    public void setAccName(String accName) {this.accName = accName;}

    public String getAccUUID() {return accUUID;}

    public void setAccUUID(String accUUID) {this.accUUID = accUUID;}

    public double getAccBalance() {return accBal;}

    public void setAccBalance(double accBal) {this.accBal = accBal;}
}

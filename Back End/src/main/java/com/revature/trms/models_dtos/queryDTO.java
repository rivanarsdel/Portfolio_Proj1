package com.revature.trms.models_dtos;

public class queryDTO {

    private int someId;
    private String someEmail;
    private double someBal;


    //<><><><><>----------------------<><><><><>
    //<><><><><>-----Constructors-----<><><><><>
    //<><><><><>----------------------<><><><><>

    public queryDTO() {}

    public queryDTO(int someId, String someEmail, double someBal) {
        this.someId = someId;
        this.someEmail = someEmail;
        this.someBal = someBal;
    }


    //<><><><><>-----------------------------<><><><><>
    //<><><><><>-----Getters and Setters-----<><><><><>
    //<><><><><>-----------------------------<><><><><>

    public int getSomeId() {
        return someId;
    }

    public void setSomeId(int someId) {
        this.someId = someId;
    }

    public String setSomeEmail() {
        return someEmail;
    }

    public void setSomeEmail(String someEmail) {
        this.someEmail = someEmail;
    }

    public double getSomeBal() {
        return someBal;
    }

    public void setSomeBal(double someBal) {
        this.someBal = someBal;
    }
}

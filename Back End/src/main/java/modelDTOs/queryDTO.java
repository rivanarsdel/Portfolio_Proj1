package modelDTOs;

public class queryDTO {

    private int someId;
    private String someName;
    private String someUUID;
    private double someBal;
    private String someCommand;

    //<><><><><>----------------------<><><><><>
    //<><><><><>-----Constructors-----<><><><><>
    //<><><><><>----------------------<><><><><>

    public queryDTO() {}

    public queryDTO(int someId, String someName, String someUUID, double someBal, String someCommand) {
        this.someId = someId;
        this.someName = someName;
        this.someUUID = someUUID;
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

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public String getSomeUUID() {
        return someUUID;
    }

    public void setSomeUUID(String someUUID) {
        this.someUUID = someUUID;
    }

    public double getSomeBal() {
        return someBal;
    }

    public void setSomeBal(double someBal) {
        this.someBal = someBal;
    }
}

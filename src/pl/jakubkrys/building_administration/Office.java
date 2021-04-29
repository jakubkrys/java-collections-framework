package pl.jakubkrys.building_administration;

public class Office {

    private int stage;
    private int officeNumber;
    private Company company;

    public Office(int stage, int officeNumber, Company company) {
        this.stage = stage;
        this.officeNumber = officeNumber;
        this.company = company;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setOfficeNumber(int officeNumber) {

        this.officeNumber = officeNumber;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "\n"+"Stage: " + stage + "\n" + "Office no.: " + officeNumber + "\n" + company;
    }
}

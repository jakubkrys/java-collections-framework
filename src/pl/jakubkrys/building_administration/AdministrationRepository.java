package pl.jakubkrys.building_administration;

import java.util.*;

public class AdministrationRepository {

    private List<Office> offices = new ArrayList<>();

    public void add(Office office) {
        offices.add(office);
    }

    public void remove(Office officeByCompanyName) {
        offices.remove(officeByCompanyName);
    }

    public void displayAll() {
        System.out.println(offices);
    }

    public Office getByCompanyName(String companyName) {
        Office gotOffice = null;
        for (int i = 0; i < offices.size(); i++) {
            if (offices.get(i).getCompany().getCompanyName().equals(companyName)) {
                gotOffice = offices.get(i);
            }
        }
        return gotOffice;
    }
}
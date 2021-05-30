package pl.jakubkrys.environment_variables;

import java.util.*;

public class VariablesRepo {

    private Map <String,String> variables = new HashMap<>();

    public void addVariableToMap(Variable variable){
        variables.put(variable.getName(), variable.getPath());
    }

    public void getVariableByName(String name){
        if (variables.isEmpty()) {
            System.out.println("Variables Map is empty");
        } else {
            if (variables.containsKey(name)){
                System.out.println(variables.get(name));
            } else {
                System.out.println("Searched variable does not exist");
            }
        }
    }
}

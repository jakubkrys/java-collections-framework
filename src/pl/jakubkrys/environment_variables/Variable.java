package pl.jakubkrys.environment_variables;

public class Variable {

    private String name;
    private String path;

    public Variable(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}

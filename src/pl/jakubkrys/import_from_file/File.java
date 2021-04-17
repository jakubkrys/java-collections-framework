package pl.jakubkrys.import_from_file;

public class File {

    Person[] people = new Person [7];

    public File() {
        prepareData();
    }

    private void prepareData() {
        people[0] = new Person("Marek", "Browarek","87021458967");
        people[1] = new Person("Czarek", "Pojarek","89031458967");
        people[2] = new Person("Darek", "Owczarek","82121458967");
        people[3] = new Person("Marek", "Browarek","87021458967");
        people[4] = new Person("Mariola", "Zych","62021958967");
        people[5] = new Person("Eugeniusz", "Brombor","99022458967");
        people[6] = new Person("Mateusz", "Wajchę-Przełóż","87072958967");
    }

    public Person[] getPeople() {
        return people;
    }
}

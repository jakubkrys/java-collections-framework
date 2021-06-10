package pl.jakubkrys.running_competition;

import java.util.*;

public class RunningCompetitionMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroupsRepo groupsRepo = new GroupsRepo();
        int option;
        int addRunnerOption;

        do {
            System.out.println("----- Running Competition App -----");
            System.out.println("1 - create new runners group");
            System.out.println("2 - add runner to group");
            System.out.println("3 - remove runner from group");
            System.out.println("4 - display group by name");
            System.out.println("5 - display all groups");
            System.out.println("0 - quit app");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Set<String> runners = new HashSet<>();
                    System.out.print("Group name: ");
                    String groupName = scanner.nextLine();
                    do {
                        System.out.println("1 - add runner to group");
                        System.out.println("0 - quit");
                        addRunnerOption = scanner.nextInt();
                        scanner.nextLine();

                        switch (addRunnerOption){
                            case 1:
                                System.out.print("Runner's name and surname: ");
                                String name = scanner.nextLine();
                                runners.add(name);
                                break;
                            case 0:
                                break;
                        }
                    } while (addRunnerOption != 0);
                    groupsRepo.addGroup(groupName, runners);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    groupsRepo.displayAllGroups();
                    break;
                case 5:

                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}

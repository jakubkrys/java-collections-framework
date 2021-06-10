package pl.jakubkrys.running_competition;

import java.util.*;

public class GroupsRepo {

    LinkedHashMap <String, Set<String>> groupsRepo = new LinkedHashMap<>();

    public void addGroup(String groupName,Set<String> runners){
        groupsRepo.put(groupName, runners);
    }

    public void displayAllGroups(){
        System.out.println(groupsRepo.entrySet());
    }

    public void displayRunnersFromGroup(String groupNameDisplay) {
        if(groupsRepo.get(groupNameDisplay) != null){
            System.out.println(groupsRepo.get(groupNameDisplay));
        } else {
            System.out.println("Cannot find group "+groupNameDisplay+" in database");
        }
    }
}

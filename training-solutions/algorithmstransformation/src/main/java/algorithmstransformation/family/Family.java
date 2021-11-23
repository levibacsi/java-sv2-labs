package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMemberList = new ArrayList<>();

    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }

    public void addFamilyMember(FamilyMember member){
        familyMemberList.add(member);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven (String name){
        List<Integer> ageOfFamilyMembersWithName = new ArrayList<>();
        for (FamilyMember fm: familyMemberList){
            if (fm.getName().contains(name)){
                ageOfFamilyMembersWithName.add(fm.getAge());
            }
        }
        return ageOfFamilyMembersWithName;
    }
}

package Competitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@Data

public class Team implements LocalCompetitor,InternationalCompetitor,NationalCompetitor{

    private String name;
    private Set<Undergraduate> teamsMembers= new HashSet();


    public Team (String name){
        this.name = name;
    }

    public Team (String name , Set<Undergraduate>  students){
        this.name = name;
        addSet(students);
    }

    public void addMember(Undergraduate s){
        teamsMembers.add(s);
    }

    public void addSet(Set<Undergraduate>  students){
        for(Undergraduate s : students){
            teamsMembers.add(s);
        }
    }

    public void removeStudent(Undergraduate s){
        if(teamsMembers.contains(s)){
            teamsMembers.remove(s);
        }
    }

    public boolean isThreeMembers() {
        if (teamsMembers.size() == 3){
            return true;
        }else{
            return false;
        }
    }


    public String showInfo() {
        String temp = getName() + "\n";
        for (Undergraduate s : teamsMembers) {
            temp = temp + s.getName() + s.getClass() + " ," + s.getNumberofSSubs()
            + " subject(s)" + "\n";
        }

        temp = temp + "Is Local Competitor : " + isLocalCompetitor() +  "\n";
        temp = temp + "Is National Competitor : " + isNationalCompetitor() + "\n";
        temp = temp + "Is International Competitor : " + isInternationalCompetitor() + "\n";


        return temp;

    }

        public boolean isLocalCompetitor(){
        boolean flag = true;
            for (Undergraduate s : teamsMembers) {
                if(s.getClass() == PhdStudent.class){
                    flag = false;
                }

                if(s.getNumberofSSubs() > 2){
                    flag = false;
                }
            }
             return (flag && isThreeMembers());
         }


    public boolean isNationalCompetitor() {

        int countU = 0;
        int countPHD = 0;
        int sum = 0;
        boolean flag;

        for (Undergraduate s : teamsMembers) {
            if(s.getClass() == Undergraduate.class){
                countU++;
            }else{
                sum = sum + s.getNumberofSSubs();
            }

            if(s.getClass() == PhdStudent.class){
                countPHD++;
            }

        }

        if((countU<1)&&(countPHD>1)&&(sum>3)){
            flag = false;
        }else{
            flag = true;
        }
        return (flag && isThreeMembers());
    }

    public boolean isInternationalCompetitor(){


        ArrayList<Degree> teamsDegrees = new ArrayList();
        int countNotPHD = 0;
        boolean flag = true;

        for (Undergraduate s : teamsMembers) {

            if(teamsDegrees.contains(s.getD())){
                flag = false;
            }else {
                teamsDegrees.add(s.getD());
            }

            if(s.getNumberofSSubs() < 2){
                flag = false;
            }

            if(s.getClass() != PhdStudent.class){
                countNotPHD++;
            }

        }

       return ((flag &&(countNotPHD >= 1)) && isThreeMembers());
    }


}


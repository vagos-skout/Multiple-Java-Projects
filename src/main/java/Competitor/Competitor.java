package Competitor;

import java.util.HashSet;
import java.util.Set;

public class Competitor {

    public static void main(String[] args) {

        Undergraduate Adam = new Undergraduate("Adam Zane " ,  Degree.Physics, 3);
        Undergraduate Carol = new Undergraduate("Carol Cook" , Degree.Computing , 1);
        Undergraduate Mary = new Undergraduate("Mary Smith" , Degree.Maths , 1);

        Undergraduate Bob = new Master("Bob Ward" ,Degree.Chemistry , 1 , "C");
        Undergraduate James = new Master("James Nick" ,Degree.Chemistry , 3 , "Experimenting with explosive materials");
        Undergraduate Rick = new Master("Rick Stiles" ,Degree.Maths , 1 , "Something about numbers");


        Undergraduate Eve = new PhdStudent("Eve Fine" , Degree.Chemistry , 3 , "Minimizing the volume of elephant toothpaste" , "Liz Lorens");
        Undergraduate Helen = new PhdStudent("Helen Brown" , Degree.Physics , 2 , "Do objects fall up or down?" , "Jeremy Tryst");
        Undergraduate Jane = new PhdStudent("Jane Smart" , Degree.Chemistry , 3 , "Inorganic replacements for meat" , "Linda Tyle");


        Set<Undergraduate> students = new HashSet();

        //students.add(Adam);
        students.add(Bob);
        //students.add(Eve);
        students.add(Carol);
        students.add(Mary);




        Team b = new Team("Avengers " , students);

        


        /*
        Team a = new Team("We are the best !!! " );
        a.addMember(Carol);
        a.addMember(James);
        a.addMember(Helen);

        a.showInfo();
        b.showInfo();
        */


        //System.out.println(a.showInfo());
        System.out.println(b.showInfo());



    }
}


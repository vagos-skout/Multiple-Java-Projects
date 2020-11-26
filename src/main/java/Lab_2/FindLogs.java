package Lab_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindLogs {

    public static void main(String[] args) {


        FileReader fr = new FileReader();
        List<String> linesOfText = fr.readFile("C:\\Users\\vagelis\\IdeaProjects\\Test_Project\\src\\main\\java\\Lab_2\\sample.log");
        Set<String> typeOfLogs = new HashSet();


        for (String l : linesOfText){
            //System.out.println(l);

            if((!(l.isBlank())) && ((l.contains("[")))) {
                typeOfLogs.add(l.substring(l.indexOf("[")+1 , l.indexOf("]")));
            }
        }

        for(String s : typeOfLogs) {
            System.out.println(s);
        }
    }

}

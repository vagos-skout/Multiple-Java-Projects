package Lab_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecryptMessage {

    public static void main(String[] args) {

        FileReader fr = new FileReader();
        List<String> secret_text = fr.readFile("C:\\Users\\vagelis\\IdeaProjects\\Test_Project\\src\\main\\java\\Lab_2\\Secret text.txt");


        for(String s : secret_text){
            System.out.println(s);
        }
        String s = secret_text.get(0);



        Map<Integer , String> result = new HashMap();
        int max = 0;


        for(int i=0; i<26; i++) {

            String local="";

            for (int j = 0; j < s.length(); j++){

                char temp = s.charAt(j);
                int x = (int)(s.charAt(j));

                if((x>=65)&&(x<=90)){
                    x = x + i + 1;

                    if (x > 90) {
                        x = x - 26;
                    }

                    temp = (char)x;

                }
                local = local + temp;
            }

            String[] arrOfStr = local.split(" ");
            //System.out.println(local);

            int count = 0;
            for(String v : arrOfStr){

                if ((v.equals("I"))||(v.equals("AND"))||(v.equals("THE"))||(v.equals("WE"))||(v.equals("AT"))||(v.equals("OF"))||(v.equals("TO"))){
                    count++;
                }

            }

            //System.out.println("count : " + count);

            if(count>max) {
                max=count;
                result.put(count, local);
            }

        }




        System.out.println(result.get(max));






        }
}

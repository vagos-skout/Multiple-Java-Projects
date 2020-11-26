package Lab_2;

import java.util.List;
import java.lang.*;
import java.util.Stack;

public class Evaluator {

    public static void main(String[] args) {

        FileReader fr_invalid = new FileReader();
        FileReader fr_valid = new FileReader();

        List<String> invalid = fr_invalid.readFile("C:\\Users\\vagelis\\IdeaProjects\\Test_Project\\src\\main\\java\\Lab_2\\java_code_sample_invalid.txt");
        List<String> valid = fr_valid.readFile("C:\\Users\\vagelis\\IdeaProjects\\Test_Project\\src\\main\\java\\Lab_2\\java_code_sample_valid.txt");

        boolean b1 =  isValid(invalid);
        boolean b2 = isValid(valid);

        System.out.println("Is java_code_sample_invalid.txt Valid ? " + b1);
        System.out.println("Is java_code_sample_valid.txt Valid ? " + b2);




    }

    static boolean isValid(List<String> javaCode){

        int countOpen = 0;
        int countClose = 0;
        Stack<String> stack = new Stack();
        String a = "";

        for(String s : javaCode){
            a = a + s;
        }

        a = a.replaceAll("\\s", "");


        for(int i=0; i<a.length(); i++){

            char temp = a.charAt(i);

            if(temp == '{'){
                countOpen++;
                stack.push(String.valueOf(temp));
            }else if(temp == '}'){
                countClose++;
                if(!(String.valueOf('{').equals(stack.pop()))){
                    return false;
                }
            }

            if(temp == '['){
                countOpen++;
                stack.push(String.valueOf(temp));
            }else if(temp == ']'){
                countClose++;
                if(!(String.valueOf('[').equals(stack.pop()))){
                    return false;
                }
            }

            if(temp == '('){
                countOpen++;
                stack.push(String.valueOf(temp));
            }else if(temp == ')'){
                countClose++;
                if(!(String.valueOf('(').equals(stack.pop()))){
                    return false;
                }
            }
        }

        if(countClose == countOpen){
            return true;
        }else{
            return false;
        }



    }

}

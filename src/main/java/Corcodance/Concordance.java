import java.util.*;

public class Concordance {

    public static void main(String[] args) {

        Set<Integer> count = new HashSet();
        Map<String, HashSet<Integer>> conc = new HashMap();

        CakeRecipe cake = new CakeRecipe();
        //System.out.println(cake.getRecipeLines());

        for (int i = 0; i < cake.getRecipeLines().size(); i++) {    //lines
            String s = cake.getRecipeLines().get(i);
            String[] arr = s.split(" ");

            for (int j = 0; j < arr.length; j++) {       //words by line
                if (conc.containsKey(arr[j])) {
                    conc.get(arr[j]).add(i);
                } else {
                    HashSet temp = new HashSet<Integer>();
                    temp.add(i);
                    conc.put(arr[j], temp);
                }

            }



        }

        for (String keys : conc.keySet()) {
            System.out.println(keys + conc.get(keys));
        }
    }
}

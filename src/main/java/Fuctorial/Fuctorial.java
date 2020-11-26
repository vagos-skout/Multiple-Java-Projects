public class Fuctorial {


    public static final int max = 2147483647;
    public static final long max2 = 9223372036854775807L;

    public static void main(String[] args) {

         int stepint = fuct();
         long steplong = fuctlong();

        System.out.println(stepint);
        System.out.println(steplong);

    }



    private static long fuctlong() {
        long x = 2;
        long total = 1;

        while (total<max2){
            long temp = total;
            total = total * x ;
            if(total/temp == x){
                x++;
            }else{
                break;
            }
        }

        return x;
    }



    private static int fuct() {

        int x = 2;
        int total = 1;

        while (total<max){
            int temp = total;
            total = total * x ;
            if(total/temp == x){
                x++;
            }else{
                break;
            }
        }
        return x;
    }




}

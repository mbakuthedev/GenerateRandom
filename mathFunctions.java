public class mathFunctions {
    public static void main(String[] args){
        //Generates a 10-digit random number
        long result = (long) Math.floor(Math.random() * 10000000000L);
        System.out.println(result);
    }
}

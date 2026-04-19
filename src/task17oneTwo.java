public class task17oneTwo {
    public static void main(String[] args){
        System.out.println(oneTwo("Hello"));
        System.out.println(oneTwo("Wejdan"));
    }
    public static String oneTwo(String text){
        String result=" ";
        for(int i=0; i<=text.length()-3; i=i+3){
            String sub=text.substring(i,i+3);
            result= result + sub.substring(1) + sub.charAt(0);
        }
        return result;
    }
}

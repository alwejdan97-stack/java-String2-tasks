public class Task4CountCode {
    public static void main(String[] args){
        System.out.println(countCode("codeLine"));
        System.out.println(countCode("cobe codeLine"));
        System.out.println(countCode("copy codeline"));
        System.out.println(countCode("copy"));
    }
    public static int countCode(String text){
        int count =0;
        for(int i=0; i< text.length()-3; i++){
            String sub = text.substring(i,i+2);
            char chr =text.charAt(i+3);
            if(sub.equals("co")&&chr=='e'){
                count++;
            }
        }return count;
    }
}

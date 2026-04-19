public class task11RepeatFront {
    public static void main(String[] args){
        System.out.println(repeatFront("Wejdan", 4));
        System.out.println(repeatFront("Sara", 1));
        System.out.println(repeatFront("Hello", 3));
    }
    public static String repeatFront(String text, int n){
        //String front = text.substring(0,n);
        String result=" ";
        for(int i=n; i>0; i--){
            result= result + text.substring(0,i);
        }
        return result;
    }
}

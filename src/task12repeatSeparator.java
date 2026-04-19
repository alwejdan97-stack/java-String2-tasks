public class task12repeatSeparator {
    public static void main(String[] args){
        System.out.println(repeatSeparator("Wejdan", "and",4));
        System.out.println(repeatSeparator("Sara", "+",1));
        System.out.println(repeatSeparator("Hello", "AND",3));
    }
    public static String repeatSeparator(String text, String separate,int n){
        String result=" ";
        for(int i=0; i<n; i++){
            result= result + text;
            if(i<n-1){
                result=result+separate;
            }
        }
        return result;
    }
}

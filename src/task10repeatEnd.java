public class task10repeatEnd {
    public static void main(String[] args){
        System.out.println(repeatEnd("Wejdan", 4));
        System.out.println(repeatEnd("Sara", 1));
    }
    public static String repeatEnd(String text, int n){
        String last = text.substring(text.length()-n);
        String result=" ";
        for(int i=0; i<n; i++){
            result= result+last;
        }
        return result;
    }
}

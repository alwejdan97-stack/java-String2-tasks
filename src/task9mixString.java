public class task9mixString {
    public static void main(String[] args){
        System.out.println(mixString("Hello", "Hi"));
        System.out.println(mixString("Hoor", "Omar"));
        System.out.println(mixString("ABC", "DEF"));
    }
    public static String mixString(String text1, String text2){
        String result=" ";

        for(int i=0; i< text1.length(); i++){
            char chr1 = text1.charAt(i);
            result = result + chr1;
                if(i<text2.length()){
                    char chr2 = text2.charAt(i);
                    result = result + chr2;
                }
        }
        return result;
    }
}

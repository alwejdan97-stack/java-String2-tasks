public class task20plusOut {
    public static void main(String[] args){
        System.out.println(plusOut("wejdan","an"));
        System.out.println(plusOut("12xy34", "1"));
    }
    public static String plusOut(String text, String word){
        String result = " ";
        for(int i=0; i<text.length(); i++){
            String sub=text.substring(i,i+word.length());
            if(i<= text.length()-word.length() && sub.equals(word)){
                result= result+word;
                i=i+word.length();
            }
            else{
                result=result+"+";
            }
        }
        return result;
    }
}

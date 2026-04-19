public class task21wordEnds {
    public static void main(String[] args){
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }
    public static String wordEnds(String text, String word){
        String result = " ";
        for(int i=0; i<=text.length()-word.length();i++){
            String sub=text.substring(i,i+word.length());
            if(sub.equals(word)){
                if(i>0){
                    result= result+text.charAt(i-1);
                }
                if(i+word.length() < text.length()){
                    result = result+ text.charAt(i+word.length());
                }
            }
        }
        return result;
    }
}

public class task16sameStarChar {
    public static void main(String[] args){
        System.out.println(sameStarChar("wejd*an"));
        System.out.println(sameStarChar("ab*ba"));
        System.out.println(sameStarChar("*xa*az"));
    }
    public static boolean sameStarChar(String text){
        for(int i=1; i<text.length()-1; i++){
            //char chr= text.charAt(i);
           // char chr1=text.charAt(i-1);
            //char chr2= text.charAt(i+1);
            if(text.charAt(i)=='*'){
                if( text.charAt(i-1)==text.charAt(i+1)) {
                    return true;
                }
            }
        }
        return false;
    }
}

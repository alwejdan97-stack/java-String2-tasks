public class task19starOut {
    public static void main(String[] args){
        System.out.println(starOut("zip**zap"));
        System.out.println(starOut("zop*"));
        System.out.println(starOut("**ABCD"));
    }
    public static String starOut(String text){
        String result=" ";
        for(int i=0; i<text.length(); i++) {
            //char chr1 = text.charAt(i);
            //char chr2 = text.charAt(i+1);
            //char chr3 = text.charAt(i-1);
            if(text.charAt(i)=='*'){
               continue;
            }
            else if(i>0 && text.charAt(i-1)=='*'){
                continue;
            }
            else if(i<text.length()-1 && text.charAt(i+1)=='*'){
                continue;
            }
                result= result +text.charAt(i);
            }
        return result;
    }
}

public class task18zipZap {
    public static void main(String[] args){
        System.out.println(zipZap("zipzap"));
        System.out.println(zipZap("zop"));
    }
    public static String zipZap(String text){
        String result=" ";
        for(int i=0; i<text.length(); i++) {
            char chr1 = text.charAt(i);
            char chr2 = text.charAt(i + 2);
            char chr3 = text.charAt(i+1);
            if(chr1=='z' && chr2=='p'){
                result= result +"zp";
                i=i+2;
            }
            else{
                result= result+chr1;
            }
        }
        return result;
    }
}

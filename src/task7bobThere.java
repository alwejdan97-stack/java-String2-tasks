public class task7bobThere {
    public static void main(String[] args){
        System.out.println(bobThere("bob"));
        System.out.println(bobThere("bop"));
        System.out.println(bobThere("Oman"));
    }
    public static boolean bobThere(String text){
        for(int i=0; i< text.length()-2; i++){
            char chr1 = text.charAt(i);
            char chr2 = text.charAt(i+2);
            if(chr1== 'b' && chr2 == 'b'){
                return true;
            }
        }
        return false;
    }
}

public class task13prefixAgain {
    public static void main(String[] srgs){
        System.out.println(prefixAgain("Wejdan",2));
        System.out.println(prefixAgain("WejdanWejdan",2));
        System.out.println(prefixAgain("ABCxyzABC",4));
        System.out.println(prefixAgain("abcabc",1));
    }
    public static boolean prefixAgain(String text, int n){
            String prefix = text.substring(0,n);
            String last = text.substring(n,text.length());
            if(last.contains(prefix)){
                return true;
            }
            return false;
    }
}

public class task5EndOther {
    public static void main(String[] args){
        System.out.println(endOther("hoor","or"));
        System.out.println(endOther("hoor","omar"));
        System.out.println(endOther("ABCd","cd"));
    }
    public static boolean endOther(String text1, String text2){
        String lower1= text1.toLowerCase();
        String lower2 = text2.toLowerCase();
        if(lower1.endsWith(lower2) || lower2.endsWith(lower1)){
            return true;
        }
        return false;
    }
}

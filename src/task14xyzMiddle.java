public class task14xyzMiddle {
    public static void main(String[] srgs){
        System.out.println(xyzMiddle("wejxyzdan"));
        System.out.println(xyzMiddle("Wejdxzyan"));
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
    public static boolean xyzMiddle(String text){
        int left;
        int right;
        int middle;
        for(int i=0; i<=text.length()-3; i++){
            String sub = text.substring(i,i+3);
            if(sub.equals("xyz")){
                left = i;
                right = text.length() - (i+3);
                middle=Math.abs(left - right);
                if(middle<=1){
                    return true;
                }
            }
        }
        
        return false;
    }
}

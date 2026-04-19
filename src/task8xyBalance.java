public class task8xyBalance {
    public static void main(String[] args){
        System.out.println(xyBalance("xyz"));
        System.out.println(xyBalance("y hello x"));
        System.out.println(xyBalance("yxyz"));
        System.out.println(xyBalance("xyzy"));
    }
    public static boolean xyBalance(String text){
        boolean y=false;

        for(int i=0; i<text.length()-1; i++){
            char chr = text.charAt(i);
            if(chr=='y'){
                y= true;
            }
            if(chr=='x' && y == false){
                return true;
            }
        }
        return false;
    }
}

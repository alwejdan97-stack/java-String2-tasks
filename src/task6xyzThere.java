import javax.swing.*;

public class task6xyzThere {
    public static void main(String[] args){
        System.out.println(xyzThere("helloxyz"));
        System.out.println(xyzThere("hell.xyz"));
        System.out.println(xyzThere("helloXyz"));
        System.out.println(xyzThere("xyzhello"));
    }
    public static boolean xyzThere(String text){
        for(int i=0; i< text.length()-2; i++) {
            String sub = text.substring(i, i + 3);
            //char chr=text.charAt(i-1);
            if(sub.equals("xyz")){
                if(i==0 || (text.charAt(i-1) !='.')){
                    return true;
                }
            }
        }
        return false;
    }
}

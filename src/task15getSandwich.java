public class task15getSandwich {
    public static void main(String[] args){
        System.out.println(getsandwich("breadhibread"));
        System.out.println(getsandwich("breadhi"));
        System.out.println(getsandwich("hibreadhello"));
    }
    public static String getsandwich(String text){
        int first = -1;
        int last=-1;

        for(int i= 0; i<=text.length()-5;i++){
            String sub=text.substring(i,i+5);
            if(sub.equals("bread")){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first==-1 || last ==-1 || first==last){
            return "";
        }
        return text.substring(first+5,last);
    }
}

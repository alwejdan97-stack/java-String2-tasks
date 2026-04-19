public class Task2 {
    public static void main(String[] args){
        String text= "hiHello hi";
        int count = 0;
        for(int i=0; i< text.length()-1; i++){
            char chr1= text.charAt(i);
            char chr2= text.charAt(i+1);
            if(chr1=='h' || chr2=='i'){
                count ++;
            }
        }
        System.out.println("total of hi is: " + count);
    }
}

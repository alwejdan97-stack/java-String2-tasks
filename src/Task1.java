public class Task1 {
    public static void main(String[] args){
        String text= "Hello";
        String doublicate= " ";
        for(int i=0; i< text.length(); i++){
            char chr= text.charAt(i);
            doublicate = doublicate + chr;
            doublicate = doublicate+ chr;
            }
        System.out.println(doublicate);
    }
}

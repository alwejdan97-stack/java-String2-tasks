public class Task3 {
    public static void main(String[] args){
        System.out.println(catDog("cathicat"));
        System.out.println(catDog("cathidog"));
        System.out.println(catDog("hidog"));
        System.out.println(catDog("cathidog dog"));
    }
    public static boolean catDog(String text) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < text.length()-2; i++) {
            String sub = text.substring(i,i+3);
        if (sub.equals("cat")){
            cat++;
            }
        if(sub.equals("dog")){
            dog++;
            }
        }
        if(cat==1 && dog==1){
            return true;
            }
        return false;
    }
}

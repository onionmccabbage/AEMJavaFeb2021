public class UsingLoops {
    public static void main(String[] args) {
        int count = 0;
        while(count < 3){
            System.out.println( count );
            count++;
            // break;
        }
        do {
            System.out.println( count );
            count--;
        } while (count >0);
    }
}

public class CountSingleDigits {
    public static void main(String[] args) {
        int[] count = new int[10];
        
        for(int i = 0; i < 100; i++) {
            int randInt = (int) (Math.random() * 10);
            count[randInt]++;
        }
        
        for(int i = 0; i <= 9; i++) {
            System.out.printf("The count of %ds is %d\n", i, count[i]);
        }
    }
}
public class LoopCount {
    public static void main(String[] args) {
        //Write a loop that runs 12 times
        //int count = 0;
        int i;
        for(i = 0; i < 12; i++){
            //count++;
            //System.out.println("Count: "+ count);
        }
        System.out.println("The loop ran " + i + " times.");

        //Write a nested loop that runs a total of 20 times
        int inner = 0;
        for(int outer = 0; outer < 10; outer++){
            System.out.println("Outer loop has run "+(outer+1)+" times.");
            for(inner = 0; inner < 2; inner++) {
                System.out.println("Inner loop has run " + (inner + 1) + " times.");
            }
        }

        //Make a while loop that runs 8 times
        int n = 0;
        while(n < 8){
            n++;
        }
        System.out.println("The while loop ran " + n + " times.");
    }
}
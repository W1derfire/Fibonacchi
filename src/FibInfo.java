public class FibInfo {
    private static int[][] fibs;
    private static int numOn = 0;

    public static void prepareArray(int len){
        fibs = new int[4][len];
    }

    public static void addInts(int[] fi){

        try {
            // wait 1 second (which is same as 1000 milliseconds)
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        fibs[numOn] = fi;
        System.out.println("Got " + (numOn + 1));
        numOn++;
    }

    public static void showFibs(){

        for(int i = 0; i < fibs[0].length; i ++){
            System.out.println("\n");

            try {
            // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            for(int j = 0; j < fibs.length; j ++){
                System.out.println(fibs[j][i] + " for fib " + (j+1));
            }
            System.out.println("\n");

        }

    }

}

public class Fibbing implements Runnable {
    private int id;
    private int numOne;
    private int numTwo;
    private int num3;
    private int howMany;
    private int howMuch;
    public int[] savedNumbers;
    private int numOn;

    Fibbing(int n, int n2, int h, int id){
        howMany = h - 2;
        numOn = 0;
        howMuch = howMany;
        savedNumbers = new int[howMany + 1];
        numOne = n;
        numTwo = n2;
        this.id = id;
    }


    private void doNumbers(int n1, int n2){
        System.out.println(Thread.currentThread().getName() + " is doingNumbers");
        if(howMany > 0) {

            /*try {
            // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }*/
            //System.out.println((n1 + n2) + " for fib " + this.id);

            num3 = n1;
            n1 = n2;
            n2 = num3 + n2;
            howMany--;
            savedNumbers[howMuch-howMany] = num3;
            doNumbers(n1,n2);
        }


    }

    public void showNumbers(){
        while(numOn < savedNumbers.length) {

            System.out.println(savedNumbers[numOn] + " for fib " + id + ", ");
            /*if(this.id == 4){
                System.out.println("\n");
            }*/

            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            numOn++;
        }
    }

    public void run() {

        System.out.println(numOne + " for fib " + this.id);
        System.out.println(numTwo + " for fib " + this.id);

        doNumbers(numOne,numTwo);
        //synchronized (this) {

            //showNumbers();

            /*for(int i = 0; i < savedNumbers.length; i ++){
                System.out.println(savedNumbers[i] + " for fib " + id + ", ");
            }
            System.out.println("That was fib " + id +"\n");*/
            //System.out.println(savedNumbers.);
            //doNumbers(numOne, numTwo);
        //}

    }
}

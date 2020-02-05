public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        FibInfo.prepareArray(8);

        for (int i = 0; i < 4; i++) {
            Fibbing rocket = new Fibbing((int)(Math.random()*10),(int)(Math.random()*10),(10),i+1);

            // create a new thread to launch this rocket concurrently as the other rockets
            Thread thread = new Thread(rocket, "Fibbing"+(i+1));
            //thread.setPriority(10-i);

            // tell that thread to launch the rocket
            //synchronized (Fibbing.class) {

                thread.start();
            //}
            synchronized(Fibbing.class) {
                FibInfo.addInts(rocket.savedNumbers);
            }

            // DO continue launching more rockets while this rocket is counting down
//            if (((Fibbing)rocket).launched()) {
                //System.out.println("ERROR: Rocket already launched?!");
            }

            FibInfo.showFibs();

//        }


    }

}

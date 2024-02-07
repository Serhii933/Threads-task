public class ThreadsTask {
    public static void main(String[] args) {
        FruitsThread fruitsThread = new FruitsThread();
        VegetablesThread vegetablesThread = new VegetablesThread();

        Thread thread1 = new Thread(fruitsThread);
        Thread thread2 = new Thread(vegetablesThread);

        thread1.start();
        thread2.start();
    }

    static class FruitsThread implements Runnable {
        @Override
        public void run() {
            String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class VegetablesThread implements Runnable {
        @Override
        public void run() {
            String[] vegetables = {"Carrot", "Tomato", "Potato", "Onion", "Broccoli"};
            for (String vegetable : vegetables) {
                System.out.println("Vegetable: " + vegetable);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


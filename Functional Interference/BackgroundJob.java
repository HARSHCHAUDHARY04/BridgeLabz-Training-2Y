public class BackgroundJob {
    public static void main(String[] args) {
        Runnable dataProcessingTask = () -> {
            try {
                System.out.println("Background job started: Processing data...");
                Thread.sleep(2000); // Simulate work
                System.out.println("Background job finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread backgroundThread = new Thread(dataProcessingTask);
        backgroundThread.start();

        System.out.println("Main thread continues to run...");
    }
}
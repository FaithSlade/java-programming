package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat - BBC");
        int second = 0;
//        video is 1 min 57 seconds
        while(second <= 117) {
            System.out.println(" Watching YouTube video: second: 1");
            second++;
//            bring mouse on top that word then click
//            Add exception to method signature : it called
            Thread.sleep(1000); // sleep==Pause the code for 1 second
//                        |
//            You can put anything on top Ex: make it faster put 500
        }
        System.out.println("Finished watching Cat video, lets start another one");
    }
}

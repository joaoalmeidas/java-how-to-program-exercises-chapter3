public class ClockTest {
    public static void main(String[] args) throws Exception {
        
        Clock clock1 = new Clock(6,23,45);
        Clock clock2 = new Clock(7,59,12);
        Clock clock2 = new Clock(7,60,60);

        System.out.println("Display time in format hh:mm:ss");
        clock1.displayTime();
        clock2.displayTime();
    }
}

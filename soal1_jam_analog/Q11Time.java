import java.util.Scanner;

public class Q11Time {

    // Hour hand: 30 deg/hour plus 0.5 deg/minute drift.
    // Minute hand: 6 deg/minute (360 deg / 60 min).
    // Angle is (hour - minute), normalized into [0, 359] since it is
    // measured counterclockwise from the hour hand to the minute hand.
    public static int calculateAngle(int hours, int minutes) {
        double hourAngle = (hours % 12) * 30 + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double angle = hourAngle - minuteAngle;
        if (angle < 0) {
            angle += 360;
        }

        return (int) angle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Masukkan menit (0-59): ");
        int minutes = scanner.nextInt();

        System.out.println("Sudut antara jarum jam dan menit: " + calculateAngle(hours, minutes));

        scanner.close();
    }
}

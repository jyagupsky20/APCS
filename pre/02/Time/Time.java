public class Time {
  public static void main(String[] args) {
    double secInDay = 24.0*3600.0;
    int hour = 12;
    int minute = 26;
    int second = 57;
    double totalSeconds = second + 60.0*(minute + 60.0*(hour));
    System.out.println(totalSeconds + " seconds since midnight");
    double remainingSeconds = secInDay-totalSeconds;
    System.out.println(remainingSeconds + " seconds left in the day");
    double percentage = (totalSeconds*100.0) / secInDay;
    System.out.println(percentage + "% of the way through the day");
    int hourNew = 12;
    int minuteNew = 42;
    int secondNew = 0;
    double elapsedSeconds = secondNew-second + 60.0*(minuteNew-minute + 60.0*(hourNew-hour));
    System.out.println(elapsedSeconds + " seconds have passed since I started writing this code");
  }
}

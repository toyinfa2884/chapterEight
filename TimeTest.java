package chapterEight;

class TimeTest {
    public static void main(String[] args) {
      Time time = new Time();//invokes Time constructor
      displayTime("After time object is corrected", time);
        System.out.println();

        time.setTime(13, 27,6);
        displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99, 99, 99);

        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());

        }
        displayTime("After calling setTime with valid values", time);

    }

    private static void displayTime(String header, Time time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header,
                time.toUniversalString(), time.toString());
    }



}
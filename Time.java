package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        //validate before setting
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Enter a correct value");
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Enter a correct value");
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("Enter a correct value");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){//convert to String in universal time format(HH:MM:SS)

        return String.format("%02d: %02d: %02d", hour, minute, second);
    }
    public String toString(){

        return String.format("%d: %02d: %02d %s", ((hour == 0 || hour ==12)? 12 : hour % 12 ),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}

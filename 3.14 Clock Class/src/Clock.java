public class Clock{

    private int hour, minute, second;

    public Clock(int hour, int minute, int second){

        if(hour >= 0 && hour < 24){

            this.hour = hour;
        }
        
        if(minute >= 0 && minute < 60){

            this.minute = minute;
        }
        
        if(second >= 0 && second < 60){

            this.second = second;
        }
    }

    public void displayTime(){

        System.out.printf("%d:%d:%d%n", hour, minute, second);
    }

    public void setHour(int hour){

        if(hour >= 0 && hour < 24){

            this.hour = hour;
        }else{

            this.hour = 0;
        }
    }

    public int getHour(){

        return hour;
    }

    public void setMinute(int minute){

        if(minute >= 0 && minute < 60){

            this.minute = minute;
        }else{

            this.minute = 0;
        }
    }

    public int getMinute(){

        return minute;
    }

    public void setSecond(int second){

        if(second >= 0 && second < 60){

            this.second = second;
        }else{

            this.second = 0;
        }
    }

    public int getSecond(){

        return second;
    }

}
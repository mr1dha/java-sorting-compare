/**
    @author Muhammad Ridha
    @since March 17th 2020
*/

public class TimeInterval{

    private long startTime, endTime;
    private long elapsedTime;
    /**
        *  Constructor for objects of class TimeInterval
    */
    public TimeInterval(){}

    /**
        method untuk memulai menghitung waktu
    */
    public void startTiming() {
        elapsedTime = 0;
        startTime = System.currentTimeMillis();
    }
    /**
        method untuk mengakhir penghitungan waktu
    */
    public void endTiming() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }
    /**
        method untuk mengembalikan interval waktu
    */
    public double getElapsedTime() {
        return (double) elapsedTime / 1000.0;
    }
}
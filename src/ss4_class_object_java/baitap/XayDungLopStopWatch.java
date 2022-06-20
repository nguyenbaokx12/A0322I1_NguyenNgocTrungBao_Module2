package ss4_class_object_java.baitap;

public class XayDungLopStopWatch {
    private long startTime;
    private long endTime;

    public XayDungLopStopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        XayDungLopStopWatch stopWatch = new XayDungLopStopWatch();
        stopWatch.start();
        long x=0;
        for(long i=0; i<=1000000; i++){
            x*=x;
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}

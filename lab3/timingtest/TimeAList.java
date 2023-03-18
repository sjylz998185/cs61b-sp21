package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.println("AList :");
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE

        AList Ns = new AList<Integer>();
        AList times = new AList<Double>();
        AList opCounts = new AList<Integer>();
        /*repeat much time*/


        addItem(1000,Ns, times, opCounts);
        addItem(2000,Ns, times, opCounts);
        addItem(4000,Ns, times, opCounts);
        addItem(8000,Ns, times, opCounts);
        addItem(16000,Ns, times, opCounts);
        addItem(32000,Ns, times, opCounts);
        addItem(64000,Ns, times, opCounts);
        addItem(128000,Ns, times, opCounts);

        printTimingTable(Ns,times,opCounts);
    }

    public static void addItem(int addTimes , AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts){

        /*create one list */
        AList list = new AList<Integer>();

        /*add time : 1 set the start time*/
        Stopwatch sw = new Stopwatch();

        /*add element into this list */
        for(int i = 0; i < addTimes ; i++){
            list.addLast(1);
        }

        /*get time of this list*/
        /*record times*/
        double timeInSeconds = sw.elapsedTime();

        /*add element into list*/
        Ns.addLast(addTimes);
        opCounts.addLast(addTimes);
        times.addLast(timeInSeconds);
    }

}

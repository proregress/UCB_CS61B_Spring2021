package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
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
        AList<Integer> Ns = new AList<>();
        Ns.addLast(1000);
        Ns.addLast(2000);
        Ns.addLast(4000);
        Ns.addLast(8000);
        Ns.addLast(16000);
        Ns.addLast(32000);
        Ns.addLast(64000);

        AList<Double> times = new AList<>();
        AList<Integer> opCount = new AList<>();

        AList lst = new AList();
        for(int i = 0; i < Ns.size(); i++){
            Stopwatch sw = new Stopwatch();
            int N = Ns.get(i);
            int count = 0;
            while(N != 0){
                lst.addLast(N);
                count++;
                N--;
            }
            double time = sw.elapsedTime();
            times.addLast(time);
            opCount.addLast(count);
        }
        printTimingTable(Ns, times, opCount);
    }
}

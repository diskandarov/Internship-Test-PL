import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(args[0]));
        while (scanner.hasNextLine()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        if (list.isEmpty()) {
            System.out.println(0);
            return;
        }
        double avg = avgrage(list);
        int valueDiffAvg = valueDiffAvgList(list, avg);
        int numberMoves = calculateNumberMoves(valueDiffAvg, list);
        System.out.println(numberMoves);
    }

    public static int calculateNumberMoves(int avgList, List<Integer> list) {
        int count = 0;
        for (Integer value: list){
            count += Math.abs(value - avgList);
        }
        return count;
    }

    public static int valueDiffAvgList(List<Integer> list, double avg) {
        int avgList = list.get(0);
        double minDiff = Math.abs(avgList - avg);
        for (Integer value: list) {
            double valueDiff = Math.abs(value - avg);
            if (valueDiff < minDiff) {
                avgList = value;
                minDiff = valueDiff;
            }
        }
        return avgList;
    }

    public static double avgrage(List<Integer> list) {
        double sum = 0;
        for (Integer value: list) {
            sum += value;
        }
        return sum/list.size();
    }
}

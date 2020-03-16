package ex04.ex03;

public class ArrayUtils {

    static class PairResult {
        private double min;
        private double max;

        public PairResult(double min, double max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return "PairResult[" +
                    "min=" + min +
                    ", max=" + max +
                    ']';
        }
    }

    static PairResult findMinMax(double[] values) {
        double min = values[0];
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if(min>values[i]){
                min = values[i];
            }
            if(max<values[i]){
                max = values[i];
            }
        }
        PairResult pairResult=new PairResult(min,max);
        return pairResult;
    }
}

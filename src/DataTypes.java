public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(int[] numbers) {
        long s = 0; 
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}

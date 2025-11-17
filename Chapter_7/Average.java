public class Average {

    public static double averageElements (int[] arr, int lastIndex) {
        int sum = 0;

        for (int i = 0; i < lastIndex; i++) {
            sum += arr[i];
        }

        return (double) sum / lastIndex;
    }

    public static int countGreaterThan(int[] arr) {

        int count = 0;

        for (int i = 1; i < arr.length; i++) {

            double avg = averageElements(arr, i);  

            if (arr[i] > avg) {
                count++;                   
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int result = countGreaterThan(responseTimes);
        System.out.println("Output: " + result);  
    }
}

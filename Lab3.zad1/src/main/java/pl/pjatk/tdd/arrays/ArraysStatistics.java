package pl.pjatk.tdd.arrays;

public class ArraysStatistics {
    public static int max(int[] numbers){

        int max = numbers[0];
        for (int counter = 0; counter < numbers.length; counter++)
        {
            if (numbers[counter] > max)
            {
                max = numbers[counter];
            }
        }

        return max;
    }

    public static int min(int[] numbers){

        int min = numbers[0];
        for (int counter = 0; counter < numbers.length; counter++)
        {
            if (numbers[counter] < min)
            {
                min = numbers[counter];
            }
        }

        return min;
    }

    public static double avg(int[] numbers){
        int sum=0;

        int length = numbers.length;

        for (int counter = 0 ; counter<length; counter++) {
            sum += numbers[counter];
        }


        float result = sum/length;

        return result;
    }

    public static int sum(int[] numbers){
        int sum=0;

        int length = numbers.length;

        for (int counter = 0 ; counter<length; counter++) {
            sum += numbers[counter];
        }
        return sum;
    }
}

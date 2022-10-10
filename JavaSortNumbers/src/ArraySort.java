import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] data = generateDataArray(10);
        System.out.println("Array");
        printArray(data);
        System.out.println("revert");
        revert(data);
        System.out.println("MaxValue:");
        max(data);
        System.out.println("minValue");
        min(data);
    }

    public static void printArray(int[] data){

        for (int i = 0;i < data.length; i++){
           System.out.println(data[i]);
        }
    }

    public static int[] generateDataArray(int size){
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(100);
        }

        return data;
    }

   public static int[] revert(int[] data){

       int[] newArray = new int[data.length];

        for(int i = 0; i<newArray.length;i++){
            newArray[newArray.length-i-1] = data[i];
        }
       printArray(newArray);
        return data;
    }

    public static int max(int[] data){
        int maxValue = 0;
        for(int i = 0; i<data.length-1; i++){
            if(maxValue<data[i]){
                maxValue = data[i];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }

    public static int min(int[] data){
        int minValue = data[0];
        for(int i = 0; i<data.length-1; i++){
            if(minValue>data[i]){
                minValue = data[i];

            }
        }
        System.out.println(minValue);
        return minValue;
    }
}
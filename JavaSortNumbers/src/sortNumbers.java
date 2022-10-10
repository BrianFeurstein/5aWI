import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortNumbers {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);

        list(list);

        System.out.println(list);
    }


    public static List list(List<Integer> list) {

        int n = 0;
        boolean listeIstSortiert = false;
        do {
            int currentNumber = list.get(n);
            if (n < list.size() - 1) {

                int nextNumber = list.get(n + 1);

                if (nextNumber < currentNumber) {
                    //list.remove(nextNumber);
                    int storeNextNumber = nextNumber;
                    list.add(n, storeNextNumber);
                    list.remove(n + 2);
                }

            } else {

                System.out.println("Die Liste ist sortiert");
            }

            n++;
        } while (n < list.size());


        return list;
    }



}


